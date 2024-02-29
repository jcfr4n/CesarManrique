/*
Crea un programa que muestre la hora actual en diferentes formatos:
21:05:36 (hora detallada con minutos y segundos)
21:05 PM o 09:25 AM (AM antes del mediodía, PM después del medio día)
*/

function mostrarHoraFormato() {

    const HORA_ACTUAL = new Date();

    const FORMATO1 = HORA_ACTUAL.toLocaleTimeString('es-ES', { hour: '2-digit', minute: '2-digit', second: '2-digit' });
    respuestaSistema.push(`La hora detallada con minutos y segundos "HH:mm:ss" es: ${FORMATO1}\n`);

    const OPCIONES_FORMATO_2 = { hour: '2-digit', minute: '2-digit' };
    const FORMATO2 = HORA_ACTUAL.toLocaleTimeString('en-US', OPCIONES_FORMATO_2);
    respuestaSistema.push(`La hora en formato "hh:mm a" es: ${FORMATO2}\n`);

    publicaRespuesta(respuestaSistema);

}