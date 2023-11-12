window.addEventListener ("load", iniciar);

function iniciar () {
    document.getElementById("cambiarTextos").addEventListener("click", cambiarTextos);
    document.getElementById("cambiarClases").addEventListener("click", cambiarClases);
    document.getElementById("quitarClases").addEventListener("click", quitarClases);
}

function cambiarTextos() {
    //Seleccionar un único elemento según su id
    document.getElementById("parrafo1").innerHTML = "Primer párrafo cambiado";
    //Seleccionar todos los elementos según su etiqueta y acceder al elemento con la posición []
    document.getElementsByTagName("p")[1].innerHTML = "Segundo párrafo cambiado";
    //Seleccionar todos los elementos según su clase
    document.getElementsByClassName("miClase")[0].innerHTML ="Tercer párrafo cambiado";
}

function cambiarClases() {
    document.getElementById("parrafo1").setAttribute("class", "miClase");
    document.getElementById("parrafo2").className = "miClase";
}

function quitarClases() {
    //Podemos hacerlo uno por uno de ambas formas 
 /*   document.getElementById("parrafo1").setAttribute("class", "");
    document.getElementeById("parrafo2").className = ""; */
    //o podemos quitar todas las clases de un mismo tipo de elemento
    for (let i = 0; i < document.getElementsByTagName("p").length; i++) {
        document.getElementsByTagName("p")[i].className = "";
    }
}