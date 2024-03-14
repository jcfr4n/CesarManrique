/* String con las letras del DNI según el Ministerio del Interior, consultado en el siguiente enlace el día 29/09/2023;
https://www.interior.gob.es/opencms/es/servicios-al-ciudadano/tramites-y-gestiones/dni/calculo-del-digito-de-control-del-nif-nie/
*/
const LETRAS = 'TRWAGMYFPDXBNJZSQVHLCKET';
let dni;
let alerta;
let continuar = true;
let validar;

/**
 * Pide al usuario que introduzca su DNI
 * 
 * @returns {string} DNI introducido por el usuario
 */
function pedirDni() {
    dni = prompt(
        'Introduce tu DNI: \n' + 
        '(Debe ser númerico y tener 8 dígitos.) \n' +
        '(Para salir, pulsa enter con la casilla vacia.)'
        );
    return dni;
}

/**
 * Valida el string introducido por el usuario comprobando que tenga 8 dígitos y que sea un número
 * 
 * @param {string} dni 
 * @returns boolean
 */
function validarDni(dni) {
    validar = true;
    alerta = [];

    if (dni.length != 8) {
        alerta.push('El DNI debe tener 8 dígitos');
        validar = false;
        continuar
    }
    if (isNaN(dni)) {
        alerta.push('El DNI debe ser un número');
        validar = false;
    }
    if (dni == ''){
        alert('Adios...');
        validar = false;
        continuar = false;
    }
    if (!validar && continuar) {
        alert(alerta.join('\n'));
    }
    return validar;
}

/**
 * Calcula la letra del DNI a partir del número introducido por el usuario
 * Esta función no retorna nada, muestra el resultado directamente por pantalla mediante un alert
 *  
 * @param {string} dni 
 */
function calcularLetra(dni) {
    let resto = dni % 23;
    alert('Tu letra es: ' + LETRAS.charAt(resto));
}

/* cuando el documento termine de cargar, se ejecuta la función */
window.onload = function() {
    /**
     * Bucle principal del programa
     */
    while (continuar) {
        dni = pedirDni();
        if (validarDni(dni)) {
            calcularLetra(dni);
        }
    }

}

