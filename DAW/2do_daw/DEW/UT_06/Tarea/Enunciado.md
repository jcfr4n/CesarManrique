# Enunciado

Se parte de un fichero.html facilitado en el apartado información de interés, en el cuál no se puede modificar ni añadir nada, salvo la línea para enlazar el fichero de JavaScript. No se puede usar código JQuery ni document.querySelector. Se debe usar document.getElementById o document.getElementsByTagName o document.getElementsByName y movernos por los elementos con parentElement, nextElementSibling, children,...Se pide realizar las siguientes funcionalidades:

- Inicialmente tienen que estar todos los elementos de la web ocultos, salvo el primer select name="provincias" id="provincias", para ello puedes usar style.visibility = "hidden" en cada elemento.

- Función mostrar islas: Cuando se seleccione una opción en el primer select name="provincias" id="provincias", es decir, se detecte un cambio con el evento change, hacemos visible el segundo select name="islas" id="islas", dejando ver solo las islas agrupadas por la provincia que se ha elegido previamente. Las otras islas se ocultarán sin dejar el espacio en blanco que ocupan en el select. display = "none".

- Función seleccionar isla: Cuando se seleccione una opción en el segundo select name="islas" id="islas", es decir, se detecte un cambio con el evento change, hacemos visible los 3 pueblos de esa Isla y los posicionamos al lado del select en lugar de verlos en el lugar que ocuparía dentro del html. A cada uno de esos 3 pueblos debemos añadirle un addEventListener()

- Función elegir pueblo: Al pinchar encima del texto de uno de los pueblos anteriormente mostrados, debemos cambiar el color del texto a rojo y de los no seleccionados a azul. Deberá mostrar la imagen de la Isla, llamamos a la siguiente función.

- Función mostrar imagen isla: Para ello debemos crear un elemento nuevo document.createElement de una imagen, le fijaremos los atributos src y alt con setAttribute y la añadiremos al contenedor id="contenedor_imag" que se encuentra en el fichero.html. Le daremos un tamaño adecuado a la imagen y su posición. Y mostraremos un texto que hemos ido almacenando durante la ejecución de la práctica en un variable, con la siguiente información "Has elegido pueblo_elegido es un municipio de la isla de isla>", esta información actualizará la información del id=parrafo haciendo uso de document.innerHTML. Cambiaremos su posición desde JavaScript para que en lugar de ocupar la que ocupa en el HTML esté debajo de la imagen y la lista de los 3 pueblos, y su color a verde. 
