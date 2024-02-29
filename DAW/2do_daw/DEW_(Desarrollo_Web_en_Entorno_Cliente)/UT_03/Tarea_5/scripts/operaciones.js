/*
Crea un programa que pida al usuario que elija una opción del siguiente menú:
Potencia
Raíz
Redondeo

Si el usuario introduce 1, se le deberá pedir una base y un exponente y se mostrará el resultado en pantalla "La potencia de X elevado a Y es: "
Si el usuario introduce 2, se le pedirá un número(no negativo) y se mostrará el resultado en pantalla "La raíz de X es: "
Si el usuario introduce 3, se le pedirá un decimal y se mostrará por pantalla el redondeo con un número entero "El redondeo del número X es: "

*/

function operacionesVarias() {
    const OPCION = hacerPregunta(   
                                    "Introduzca el número correspondiente a la operación que desea realizar.\n"
                                +   "1 - Potencia\n" 
                                +   "2 - Raíz\n"
                                +   "3 - Redondeo\n"
                                +   "¿cuál es la opción que desea?: ");
    
    switch (OPCION) {
        case "1":
        const BASE = hacerPregunta("Ingresa la base:");
        const EXPONENTE = hacerPregunta("Ingresa el exponente:");
        const POTENCIA = Math.pow(BASE, EXPONENTE);
        respuestaSistema.push(`La potencia de ${BASE} elevado a ${EXPONENTE} es: ${POTENCIA}`);
        publicaRespuesta(respuestaSistema);
        break;

        case "2":
        const NUMERO = parseFloat(hacerPregunta("Ingresa un número positivo para calcular la raíz:"));
        if (NUMERO >= 0) {
            const raiz = Math.sqrt(NUMERO);
            respuestaSistema.push(`La raíz de ${NUMERO} es: ${raiz}`);
        } else {
            respuestaSistema.push("El número ingresado no es válido para calcular la raíz.");
        }
        publicaRespuesta(respuestaSistema);
        break;
        
        case "3":
        const NUMERO_DECIMAL = parseFloat(hacerPregunta("Ingresa un número decimal para redondear:"));
        const REDONDEO = Math.round(NUMERO_DECIMAL);
        respuestaSistema.push(`El redondeo del número ${NUMERO_DECIMAL} es: ${REDONDEO}`);
        publicaRespuesta(respuestaSistema);
        break;
        default:
        respuestaSistema.push("Opción no válida. Por favor, elige una opción válida (1, 2, o 3).");
        publicaRespuesta(respuestaSistema);
    }
}