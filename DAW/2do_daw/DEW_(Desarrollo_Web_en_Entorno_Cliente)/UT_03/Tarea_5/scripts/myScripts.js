const DIAS_SEMANA = ["Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"];

let respuestaUsuario = '';
let mensajeUsuario = '';
let string = '';
let respuestaSistema = [];

function limpiaVariables() {
    respuestaUsuario = '';
    mensajeUsuario = '';
    string = '';
    respuestaSistema = [];
}

function hacerPregunta(preguntaUsuario) {
    return prompt(preguntaUsuario);
}

function publicaRespuesta(respuestaSistema) {
    respuestaSistema.forEach(element => {
        mensajeUsuario += element + '\n'
    });
    alert(mensajeUsuario);
    limpiaVariables();
}
function cargaScript(url){
    var nuevoScript = document.createElement('script');
    nuevoScript.src = url;
    document.head.appendChild(nuevoScript);
}




/*
Crea un programa que tenga los siguientes botones para permitir modificar las siguientes propiedades de una ventana:
Mover+10: moverá la ventana 10px a la derecha y abajo cada vez que se pulse en dicho botón.
MoverPos: moverá la ventana a la posición 100,100.
Width: aumentará el ancho de la ventana en 10px cada vez que se pulse
Height: aumentará el alto de la ventana en 10px cada vez que se pulse
Scroll: Colocará un scroll a la ventana

*/

document.addEventListener("DOMContentLoaded", function () {

    document.getElementById('diaNacimiento').addEventListener('click', (e) => {
        cargaScript('scripts/diaCumpleanios.js')
        setTimeout(function () {
            calculaDiaCumpleanios();
        }, 500);
    });

    document.getElementById('formatosDia').addEventListener('click', (e) => {
        cargaScript('scripts/fechaFormatos.js')
        setTimeout(function () {
            muestraFechaFormatos();
        }, 500);
    });

    document.getElementById('formatosHora').addEventListener('click', (e) => {
        cargaScript('scripts/horaFormatos.js')
        setTimeout(function () {
            mostrarHoraFormato();
        }, 500);
    });

    document.getElementById('operaciones').addEventListener('click', (e) => {
        cargaScript('scripts/operaciones.js')
        setTimeout(function () {
            operacionesVarias();
        }, 500);
    });

    document.getElementById('propuestaNombre').addEventListener('click', (e) => {
        cargaScript('scripts/propuestaNombre.js')
        setTimeout(function () {
            propuestaNombre();
        }, 500);
    });

    document.getElementById('comprobarPass').addEventListener('click', (e) => {
        cargaScript('scripts/comprobarContrasenia.js')
        setTimeout(function () {
            comprobarContrasenia();
        }, 500);
    });

    document.getElementById('moverVentanas').addEventListener('click', (e) => {
        setTimeout(function () {
            alert('falta');
        }, 500);
    });

});