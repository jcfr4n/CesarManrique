
/* 
Crea un programa que pida por parámetro la fecha de tu cumpleaños, con este valor calcula
El día de la semana en la que nacistes.
Si por ejemplo ese día en que nacistes es "Jueves" calcula en qué años tu cumpleaños vuelve a caer "Jueves" hasta el 2100.
NOTA: Recuerda que los meses empiezan en el valor 0 al 11. 
*/

function calculaDiaCumpleanios() {

    respuestaUsuario = hacerPregunta("¿Cuál es tu fecha de cumpleaños? (yyyy-mm-dd): ");

    const FECHA_NACIMIENTO = new Date(respuestaUsuario);
    const INDICE = FECHA_NACIMIENTO.getDay();
    const diaNacimiento = DIAS_SEMANA[INDICE];

    let anio;
    let fechaActualizada = FECHA_NACIMIENTO;

    respuestaSistema.push(`Naciste un ${diaNacimiento}\n`);
    respuestaSistema.push(`Tu cumpleaños caerá un ${diaNacimiento} de nuevo en: `);
    anio = (new Date()).getFullYear() + 1;

    while (anio < 2101) {
        fechaActualizada = new Date(fechaActualizada.setFullYear(anio));
        if (INDICE === fechaActualizada.getDay()) {
            string += `${anio}, `;
        }
        anio++;
    }
    string = string.slice(0, -2);
    respuestaSistema.push(`${string}`);

    publicaRespuesta(respuestaSistema);

}