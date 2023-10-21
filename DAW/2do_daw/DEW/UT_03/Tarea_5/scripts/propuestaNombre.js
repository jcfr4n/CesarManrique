/*
Crea un programa que pida al usuario su nombre y apellidos y muestre:.
Una propuesta de nombre de usuario con la 1º inicial del nombre + 3 iniciales del primer apellido + 3 iniciales del segundo apellido ej: yguaper
Una propuesta de nombre de usuario con las 3 primeras letras del nombre + 3 primeras del primer apellido + 3 primeras del segundo apellido ej: yaiguaper
*/

function propuestaNombre() {
    const NOMBRE = hacerPregunta("Ingresa tu nombre: ");
    const APELLIDO1 = hacerPregunta("Ingresa tu primer apellido: ");
    const APELLIDO2 = hacerPregunta("Ingresa tu segundo apellido: ");

    const PROPUESTA1 = NOMBRE.slice(0, 1) + APELLIDO1.slice(0, 3) + APELLIDO2.slice(0, 3);
    const PROPUESTA2 = NOMBRE.slice(0, 3) + APELLIDO1.slice(0, 3) + APELLIDO2.slice(0, 3);

    respuestaSistema.push(`Propuesta de nombre de usuario 1: ${PROPUESTA1}\n`);
    respuestaSistema.push(`Propuesta de nombre de usuario 2: ${PROPUESTA2}\n`);

    publicaRespuesta(respuestaSistema);
}