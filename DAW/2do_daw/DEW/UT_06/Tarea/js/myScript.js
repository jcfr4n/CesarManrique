function invisivilizar(colection) {

    for (let i = 0; i < colection.length; i++) {
        const element = colection[i];
        element.style.visibility = "hidden";
    }

}

function mostrarPueblos(isla, islas, uls) {
    // Crea el contenedor de pueblos si no existe
    let contenedorPueblos = document.getElementById('contenedor_pueblos');
    if (!contenedorPueblos) {
        contenedorPueblos = document.createElement('div');
        contenedorPueblos.id = 'contenedor_pueblos';
        document.body.appendChild(contenedorPueblos);
    }

    // Limpia el contenedor de pueblos
    contenedorPueblos.innerHTML = '';

    // Agrega los pueblos al contenedor
    let pueblos = uls[isla].children;
    for (let i = 0; i < pueblos.length; i++) {
        const originalElement = pueblos[i];
        const nuevoElemento = document.createElement('li');
        nuevoElemento.textContent = originalElement.textContent;

        nuevoElemento.addEventListener('click', function () {
            this.style.color = "red";
            let brothers = this.parentNode.children;
            for (let i = 0; i < brothers.length; i++) {
                const brother = brothers[i];
                (brother !== this) ? brother.style.color = "blue" : "";
            }
            mostrarImagenIsla(isla, this.innerHTML);
        });

        contenedorPueblos.appendChild(nuevoElemento);
    }

    // Posiciona el contenedor de pueblos al lado del select
    let islasRect = islas.getBoundingClientRect();
    contenedorPueblos.style.position = 'absolute';
    contenedorPueblos.style.top = islasRect.top + window.scrollY + 'px';
    contenedorPueblos.style.left = islasRect.right + window.scrollX + 10 + 'px';
}

function mostrarImagenIsla(isla, puebloElegido) {
    // Crear la imagen
    let imagen = document.createElement('img');
    imagen.setAttribute('src', './islas/' + isla + '.png'); // Ajusta la ruta según tus necesidades
    imagen.setAttribute('alt', 'Imagen de ' + isla);

    // Ajustar tamaño y posición de la imagen
    imagen.style.width = '200px'; // Ajusta el tamaño según tus necesidades
    imagen.style.height = 'auto'; // Mantener la proporción original
    imagen.style.position = 'relative'; // Otra opción podría ser 'absolute', dependiendo del diseño

    // Añadir la imagen al contenedor
    let contenedorImagen = document.getElementById('contenedor_imag');
    contenedorImagen.innerHTML = ''; // Limpiar cualquier contenido existente
    contenedorImagen.appendChild(imagen);

    // Actualizar el párrafo con la información
    let parrafo = document.getElementById('parrafo');
    parrafo.innerHTML = `Has elegido ${puebloElegido}, un municipio de la isla de ${isla}.`;
    parrafo.style.color = 'green';

    // Cambiar la posición del párrafo
    parrafo.style.position = 'relative'; // Otra opción podría ser 'absolute', dependiendo del diseño
    parrafo.style.top = '10px'; // Ajusta la posición según tus necesidades
}

window.onload = (e) => {
    let labels = document.getElementsByTagName('label');
    let selects = document.getElementsByTagName('select');
    let listas = document.getElementsByTagName('ul');
    let optgroups = document.getElementsByTagName('optgroup');
    let uls = document.getElementsByTagName('ul');

    console.log(uls);

    invisivilizar(labels);
    invisivilizar(selects);
    invisivilizar(listas);
    invisivilizar(uls);

    const provincias = document.getElementById("provincias");
    const islas = document.getElementById("islas")

    console.log(provincias);
    console.log(islas);

    provincias.style.visibility = "";
    labels[0].style.visibility = "";

    provincias.addEventListener('change', function mostrarIslas(e) {
        islas.style.visibility = "";
        labels[1].style.visibility = "";

        console.log(provincias.value);

        switch (provincias.value) {  // Cambiado de islas.value a provincias.value
            case "LPGC":
                optgroups[1].style.display = "";
                optgroups[0].style.display = "none";
                break;
            case "SC":
                optgroups[1].style.display = "none";
                optgroups[0].style.display = "";
                break;
            default:
                optgroups[1].style.display = "none";
                optgroups[0].style.display = "none";
                provincias.focus();
                islas.style.visibility = "hidden";
                labels[1].style.visibility = "hidden";
                break;
        }
    });

    console.dir(islas.options[islas.selectedIndex].textContent);

    islas.addEventListener('change', function seleccionarIsla(e) {
        switch (islas.value) {
            case "LP":
            case "EH":
            case "LG":
            case "TF":
            case "GC":
            case "FV":
            case "LZ":
                mostrarPueblos(islas.value, islas, uls);
                break;

            default:
                islas.focus();
                break;
        }
    });

}