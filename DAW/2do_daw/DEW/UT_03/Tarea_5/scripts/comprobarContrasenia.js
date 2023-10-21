/*
Crea un programa que pida al usuario una propuesta de contraseña y compruebe si cumple con los siguientes requisitos:
Tiene entre 8 y 16 caracteres
Tiene una letra mayúscula
Tiene una letra minúscula
Tiene un número
Tiene uno de los siguientes valores: - (guión alto), _ (guión bajo), @ (arroba), # (almohadilla), $ (dólar), % (tanto por ciento), & (ampersand)

Si cumple con todos los requisitos se considera una contraseña segura, de lo contrario mostrará que es una contraseña no segura.
*/

function comprobarContrasenia() {
    const CONTRASENIA = hacerPregunta("Vamos a comprobar que tu contraseña \n" 
                                    + "- Tiene entre 8 y 16 caracteres\n" 
                                    + "- Tiene una letra mayúscula\n"
                                    + "- Tiene una letra minúscula\n"
                                    + "- Tiene un número\n"
                                    + "- Tiene uno de los siguientes valores: -, _, @, #, $, %, &\n"
                                    + "\nPor favor, ingresa tu contraseña: ");
    const LONGITUD = CONTRASENIA.length;
    const TIENE_MAYUSCULA = /[A-Z]/.test(CONTRASENIA);
    const TIENE_MINUSCULA = /[a-z]/.test(CONTRASENIA);
    const TIENE_NUMERO = /\d/.test(CONTRASENIA);
    const TIENE_CARACTER_ESPECIAL = /[-_@#$%&]/.test(CONTRASENIA);

    if (LONGITUD >= 8 && LONGITUD <= 16 && TIENE_MAYUSCULA && TIENE_MINUSCULA && TIENE_NUMERO && TIENE_CARACTER_ESPECIAL) {
        respuestaSistema.push("Contraseña segura.");
    } else {
        respuestaSistema.push("Contraseña no segura. Asegúrate de que cumple con los requisitos.");
    }
    publicaRespuesta(respuestaSistema);
}