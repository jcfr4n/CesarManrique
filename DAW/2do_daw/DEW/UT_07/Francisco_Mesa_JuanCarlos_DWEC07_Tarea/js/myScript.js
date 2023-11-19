document.addEventListener('DOMContentLoaded', function () {
    // Obtengo todos los elementos que voy a utilizar
    const comunidades = document.getElementById('comunidades');
    const provincias = document.getElementById('provincias');
    const municipios = document.getElementById('municipios');
    const etiq_provincias = document.getElementById('etiq_provincias');
    const etiq_municipios = document.getElementById('etiq_municipios');

    // Oculto los campos de provincias y municipios
    provincias.style.display = "none";
    etiq_provincias.style.display = "none";
    municipios.style.display = "none";
    etiq_municipios.style.display = "none";

    // Cargo las comunidades al inicio
    cargarDatos('comunidades', 'comunidad', { tabla: 'comunidades' });

    // Evento al cambiar comunidades
    comunidades.addEventListener('change', function () {
        if (this.value === "") {
            // Si el valor seleccionado es una cadena vacía, ocultar provincias y municipios
            provincias.style.display = "none";
            etiq_provincias.style.display = "none";
            municipios.style.display = "none";
            etiq_municipios.style.display = "none";
        } else {
            cargarDatos('provincias', 'provincia', { tabla: 'provincias', comunidad: this.value });
            // Necesario por si cambiamos la selección
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
            cargarDatos('municipios', 'municipio', { tabla: 'municipios', provincia: this.value });
            // Necesario por si cambiamos la selección
            municipios.value = ''; // Limpiar municipios
            municipios.style.display = "none";
            etiq_municipios.style.display = "none";
        }
    }), false;

    /**
     * 
     * @param {string} id // id de los campos  utilizados
     * @param {string} idSufijo // sufijo usado para la formación del id de la label del campo
     * @param {Object} datos // Objeto cuyas propiedades indican los datos para la consulta en base de datos
     * 
     * Esta función hace una consulta ajax al servidor, para poblar los campos 
     */
    function cargarDatos(id, idSufijo, datos = {}) {
        const xhr = new XMLHttpRequest();
        xhr.open('POST', './php/acceso_bd.php', true);
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
                document.getElementById('etiq_' + id).style.display = '';
            }
        };
        xhr.send(data);
    }
});
