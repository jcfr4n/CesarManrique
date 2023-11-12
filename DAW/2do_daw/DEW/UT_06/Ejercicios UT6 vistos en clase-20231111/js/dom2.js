window.addEventListener("load", inicio);

function inicio() {
    document.getElementById("crearParrafo").addEventListener("click", crearParrafo);
    document.getElementById("crearImagen").addEventListener("click", crearImagen);
    document.getElementById("borrarUtlimo").addEventListener("click", borrarUtlimo);
    document.getElementById("borrarPrimero").addEventListener("click", borrarPrimero);
    document.getElementById("sustituirPrimeroVacio").addEventListener("click", sustituirPrimeroVacio);
}

function crearParrafo() {
    //Creamos un elemento
    let parrafo = document.createElement("p");
    //Creamos el texto
    let texto = document.createTextNode(document.getElementById("texto").value);
    
    //Añadimos un hijo al párrafo
    parrafo.appendChild(texto);

    //Añadimos atributos
    parrafo.setAttribute("class", "miClase");

    //Añadimos un hijo al div, el párrafo
    let contenedor = document.getElementById("div1");
    contenedor.appendChild(parrafo);
}

function crearImagen() {
    //Creamos un elemento
    let imagen = document.createElement("img");
   
    //Añadimos atributos
    let ruta = prompt("Introduce la ruta de la imagen");
    imagen.setAttribute("src", ruta);
    //imagen.src = "ruta";                        // es otra forma de hacerlo
    imagen.setAttribute("alt", prompt("Introduce un texto alternativo para la imagen"));  //podemos incluir el prompt dentro 

    //Añadimos un hijo al div, el párrafo
    let contenedor = document.getElementById("div1");
    contenedor.appendChild(imagen);
}

function borrarUtlimo() {
    let contenedor = document.getElementById("div1");
    let hijo = contenedor.lastChild;                      //Seleccionamos el útlimo hijo 
    
    // Elimina un elemento hijo
    contenedor.removeChild(hijo);
}

function borrarPrimero() {
    let contenedor = document.getElementById("div1");
    let hijo = contenedor.firstChild;                      //Seleccionamos el primer hijo 
    
    // Elimina un elemento hijo
    contenedor.removeChild(hijo);
}

function sustituirPrimeroVacio() {
    let contenedor = document.getElementById("div1");
    /* explicado paso a paso 
    let parrafo = document.createElement("p");       //creamos el párrafo
    let texto = document.createTextNode("Vacio");   // creamos el texto
    parrafo.appendChild(texto); */                 // añadimos el texto al párrafo
    let parrafo = document.createElement("p").appendChild(document.createTextNode(""));  //Sustituimos por vacío, si ponemos vació como ""  no lo vemos pero sigue estando como hijo

    //Sustituir un elemento
    contenedor.replaceChild(parrafo, contenedor.firstChild);  //nuevo, viejo
}