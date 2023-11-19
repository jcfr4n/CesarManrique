document.addEventListener('DOMContentLoaded', function () {
    const comunidades = document.getElementById('comunidades');
    const provincias = document.getElementById('provincias');
    const municipios = document.getElementById('municipios');
    const etiq_provincias = document.getElementById('etiq_provincias');
    const etiq_municipios = document.getElementById('etiq_municipios');

    provincias.style.display = "none";
    etiq_provincias.style.display = "none";
    municipios.style.display = "none";
    etiq_municipios.style.display = "none";

    // Cargar comunidades al inicio
    cargarDatos('comunidades', 'comunidades', 'comunidad', { tabla: 'comunidades' });

    // Evento al cambiar comunidades
    comunidades.addEventListener('change', function () {
        if (this.value === "") {
            // Si el valor seleccionado es una cadena vacía, ocultar provincias y municipios
            provincias.style.display = "none";
            etiq_provincias.style.display = "none";
            municipios.style.display = "none";
            etiq_municipios.style.display = "none";
        } else {
            cargarDatos('provincias', 'provincias', 'provincia', { tabla: 'provincias', comunidad: this.value });
            provincias.value = ''; // Limpiar provincias
            municipios.value = ''; // Limpiar municipios
            etiq_provincias.style.display = "none";
            provincias.style.display = "none";
            etiq_municipios.style.display = "none";
            municipios.style.display = "none";
        }
    }), false;

    // Evento al cambiar provincias
    provincias.addEventListener('change', function () {
        if (this.value === "") {
            // Si el valor seleccionado es una cadena vacía, ocultar municipios
            municipios.style.display = "none";
            etiq_municipios.style.display = "none";
        } else {
            cargarDatos('municipios', 'municipios', 'municipio', { tabla: 'municipios', provincia: this.value });
            municipios.value = ''; // Limpiar municipios
            municipios.style.display = "none";
            etiq_municipios.style.display = "none";
        }
    }), false;

    function cargarDatos(elemento, id, idSufijo, datos = {}) {
        const xhr = new XMLHttpRequest();
        xhr.open('POST', './functions/acceso_bd.php', true);
        xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');

        // Convertir el objeto de datos a una cadena de consulta
        const data = "objeto=" + encodeURIComponent(JSON.stringify(datos));

        xhr.onreadystatechange = function () {
            if (xhr.readyState == 4 && xhr.status == 200) {
                const response = JSON.parse(xhr.responseText);
                const select = document.getElementById(id);

                // Limpiar el select
                while (select.options.length > 0) {
                    select.remove(0);
                }

                // Añadir opción por defecto
                const optionDefault = document.createElement('option');
                optionDefault.value = '';
                optionDefault.text = 'Seleccionar...';
                select.add(optionDefault);

                // Añadir opciones desde la respuesta
                let identificador = `id_${idSufijo}`;
                let filtro;
                let idFiltro;
                console.log(filtro);
                switch (idSufijo) {
                    case 'provincia':
                        filtro = 'comunidad';
                        idFiltro = 'id_comunidad';
                        break;
                    case 'municipio':
                        filtro = 'provincia';
                        idFiltro = 'id_provincia';
                        break;
                    default:
                        filtro = '';
                        break;
                }
                response.forEach(function (item) {
                    const option = document.createElement('option');
                    option.value = item[identificador];
                    option.text = item.nombre;
                    if (filtro == '') {
                        select.add(option);
                    } else {
                        if (item[idFiltro] == datos[filtro]) {
                            select.add(option);
                        }
                    }
                });

                // Mostrar el select
                select.style.display = '';
                document.getElementById('etiq_' + elemento).style.display = '';
            }
        };
        xhr.send(data);
    }
});
