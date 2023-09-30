const LETRAS = 'TRWAGMYFPDXBNJZSQVHLCKET';  
let dni;
let alerta = [];
let continuar = true;

function pedirDni() {
    dni = prompt('Introduce tu DNI');
    return dni;
}

function validarDni(dni) {
    if (dni.length != 8) {
        alerta.push('El DNI debe tener 8 dígitos');
        continuar = false;
    }
    if (isNaN(dni)) {
        alerta.push('El DNI debe ser un número');
        continuar = false;
    }
    if (continuar == false) {
        alert(alerta.join('\n'));
    }
    return continuar;
}

function calcularLetra(dni) {
    let resto = dni % 23;
    alert('Tu letra es: ' + LETRAS.charAt(resto));
}

while (continuar) {
    dni = pedirDni();
    if (validarDni(dni)) {
        calcularLetra(dni);
    }
}


