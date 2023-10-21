/* 
Crea un programa que muestre la fecha actual en diferentes formatos. Ejemplo en el día de hoy sería:
21/10/2021
Jueves, 21 de Octubre de 2021
Thursday, October 21th, 2021
*/

function muestraFechaFormatos() {

    const FECHA_ACTUAL = new Date();

    respuestaSistema.push(`La fecha de hoy en formato "dd/mm/yyyy" es: ${FECHA_ACTUAL.getDate()}/${FECHA_ACTUAL.getMonth() + 1}/${FECHA_ACTUAL.getFullYear()}\n`);

    const OPCIONES_FORMATO_2 = { weekday: 'long', year: 'numeric', month: 'long', day: 'numeric' };
    respuestaSistema.push(`La fecha de hoy en formato "Día, dd de Mes de yyyy" es: ${FECHA_ACTUAL.toLocaleDateString('es-ES', OPCIONES_FORMATO_2)}\n`);

    // Formato "Weekday, Month ddth, yyyy"
    const OPCIONES_FORMATO_3 = { weekday: 'long', year: 'numeric', month: 'long', day: 'numeric' };
    respuestaSistema.push(`La fecha de hoy en formato "Día, dd de Mes de yyyy" es: ${FECHA_ACTUAL.toLocaleDateString('en-US', OPCIONES_FORMATO_3)}\n`);

    publicaRespuesta(respuestaSistema);
}