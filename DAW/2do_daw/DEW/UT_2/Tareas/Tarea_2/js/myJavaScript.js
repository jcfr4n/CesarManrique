const ALEATORIO = Math.floor((Math.random() * 100) + 1);
let intentos = 3;
let numeroUsuario;
let ganador;

function pedirNumero() {
    return prompt('Por favor introduzca un número entre 1 y 100 a ver si aciertas: ');
}

while (intentos > 0) {

    numeroUsuario = pedirNumero();

    intentos--;

    if (ALEATORIO < numeroUsuario) {
        alert('Tu número es mayor. Te quedan ' + intentos + ' intentos.');
    }
    if (ALEATORIO > numeroUsuario) {
        alert('Tu número es menor. Te quedan ' + intentos + ' intentos.');
    }
    if (ALEATORIO == numeroUsuario) {
        alert('Felicidades, has acertado faltando ' + intentos + ' intentos');
        intentos = 0;
        ganador = true;
    }
}

if (!ganador) {
    alert('Lo siento, has perdido. El número era: ' + ALEATORIO);
}