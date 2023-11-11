const LONGITUD_NOMBRE = 20;
const LONGITUD_APELLIDO = 35;
const RANGO_EDAD = [18, 105];
const LONGITUD_NUMERICA_DNI = 8;

const LETRAS_DNI = [
  "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E",
];

const LONGITUD_NUMERO_TELEFONO = 9;
const INICIO_TELEFONO_VALIDO = [6, 9];

let statusForm = true;

// Reutilización de código para manejo de cookies de w3schools con modificaciones propias
function setCookie(cname, cvalue, exdays = null) {
  if (exdays) {
    const d = new Date();
    d.setTime(d.getTime() + (exdays * 24 * 60 * 60 * 1000));
    let expires = "expires="+d.toUTCString();
    document.cookie = cname + "=" + cvalue + ";" + expires + ";path=/";
    return;
  }
  document.cookie = cname + "=" + cvalue + ";path=/";
}

function getCookie(cname) {
  let name = cname + "=";
  let ca = document.cookie.split(';');
  for(let i = 0; i < ca.length; i++) {
    let c = ca[i];
    while (c.charAt(0) == ' ') {
      c = c.substring(1);
    }
    if (c.indexOf(name) == 0) {
      return c.substring(name.length, c.length);
    }
  }
  return "";
}

function addOneToCookie(cname) {
  let intentos = parseInt(getCookie(cname));
  intentos++;
  setCookie('Intentos', intentos);
}

function mostrarError(mensaje){
  let contenedorMesaje = document.getElementById('errores');
  contenedorMesaje.innerHTML = mensaje;
}

function borrarError(){
  contenedorMesaje.innerHTML = '';
}

window.onload = ((e) => {

  setCookie('Intentos', 0);
  const contenedorMesaje = document.getElementById('errores');
  const confirmacion = '¿Desea enviar el formulario?'
  let mensaje = '';

  const nombre = document.getElementById('nombre');
  const apellidos = document.getElementById('apellidos');
  const edad = document.getElementById('edad');
  const nif = document.getElementById('nif');
  const email = document.getElementById('email');
  const provincia = document.getElementById('provincia');
  const isla = document.getElementById('isla');
  const fecha = document.getElementById('fecha');
  const telefono = document.getElementById('telefono');
  
  const BOTON_ENVIAR = document.getElementById('enviar');


  nombre.setAttribute("required", "required");
  nombre.setAttribute("tabindex", 1);
  apellidos.setAttribute("required", "required");
  apellidos.setAttribute("tabindex", 2);
  edad.setAttribute("required", "required");
  edad.setAttribute("tabindex", 3);
  nif.setAttribute("required", "required");
  nif.setAttribute("tabindex", 4);
  email.setAttribute("required", "required");
  email.setAttribute("tabindex", 5);
  provincia.setAttribute("required", "required");
  provincia.setAttribute("tabindex", 6);
  isla.setAttribute("required", "required");
  isla.setAttribute("disabled", "disabled");
  isla.setAttribute("tabindex", 7);
  fecha.setAttribute("required", "required");
  fecha.setAttribute("tabindex", 8);
  telefono.setAttribute("required", "required");
  telefono.setAttribute("tabindex", 9);

  nombre.focus();

  nombre.addEventListener('blur', (e) => {
    let valorNombre = nombre.value;
    nombreRegex = new RegExp(`^[A-Za-z\s]{1,${LONGITUD_NOMBRE}}$`);
    
    if (!nombreRegex.test(valorNombre)){
      mensaje = `El nombre solo puede tener hasta ${LONGITUD_NOMBRE} letras incluidos los espacios en blanco.`
      mostrarError(mensaje);
      nombre.focus();
      nombre.classList.add('error');
      statusForm = false;
      return;
    }
    nombre.classList.remove('error');
    mensaje = '';
    mostrarError(mensaje);
    statusForm = true;
    apellidos.focus();

  });

  apellidos.addEventListener('blur', (e) => {
    let valorApellidos = apellidos.value;
    apellidosRegex = new RegExp(`^[A-Za-z\s]{1,${LONGITUD_APELLIDO}}$`);
    
    if (!apellidosRegex.test(valorApellidos)){
      mensaje = `Los apellidos solo pueden tener hasta ${LONGITUD_NOMBRE} letras incluidos los espacios en blanco.`
      mostrarError(mensaje);
      apellidos.focus();
      apellidos.classList.add('error');
      statusForm = false;
      return;
    }
    apellidos.classList.remove('error');
    mensaje = '';
    mostrarError(mensaje);
    statusForm = true;
    edad.focus();

  });

  edad.addEventListener('blur', (e) => {
    let valorEdad = edad.value;

    if (!(valorEdad !== NaN && (valorEdad > RANGO_EDAD[0] && valorEdad < RANGO_EDAD[1]))) {
      mensaje = `La edad solo puede ser un número y debe estar comprendida entre los ${RANGO_EDAD[0]} y los ${RANGO_EDAD[1]} años.`
      mostrarError(mensaje);
      edad.focus();
      edad.classList.add('error');
      statusForm = false;
      return;
    }
    edad.classList.remove('error');
    mensaje = '';
    mostrarError(mensaje);
    statusForm = true;
    nif.focus();

  });

  nif.addEventListener('blur', (e) => {
    let valorNif = nif.value;
    nifRegex = new RegExp(`^\\d{${LONGITUD_NUMERICA_DNI}}-[a-zA-Z]$`);
    
    if (!nifRegex.test(valorNif)){
      mensaje = `Los nif solo pueden tener ${LONGITUD_NUMERICA_DNI} dígitos, seguidos por un guión y una letra.`
      mostrarError(mensaje);
      nif.focus();
      nif.classList.add('error');
      statusForm = false;
      return;
    }
    nif.classList.remove('error');
    mensaje = '';
    mostrarError(mensaje);
    statusForm = true;
    email.focus();

  });

  email.addEventListener('blur', (e) => {
    let valorEmail = email.value;
    emailRegex = new RegExp(`^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$`);
    
    if (!emailRegex.test(valorEmail)){
      mensaje = `No ha introducido un email válido.`
      mostrarError(mensaje);
      email.focus();
      email.classList.add('error');
      statusForm = false;
      return;
    }
    email.classList.remove('error');
    mensaje = '';
    mostrarError(mensaje);
    statusForm = true;
    provincia.focus();

  });

  provincia.addEventListener('blur', (e) => {
    let valorProvincia = provincia.value;
    let todasIslas = isla.options;
        
    switch (valorProvincia) {
      case 'SC':
        todasIslas[1].style.display = "";
        todasIslas[2].style.display = "";
        todasIslas[3].style.display = "";
        todasIslas[4].style.display = "";
        todasIslas[5].style.display = "none";
        todasIslas[6].style.display = "none";
        todasIslas[7].style.display = "none";
        break;

      case 'LP':
        todasIslas[1].style.display = "none";
        todasIslas[2].style.display = "none";
        todasIslas[3].style.display = "none";
        todasIslas[4].style.display = "none";
        todasIslas[5].style.display = "";
        todasIslas[6].style.display = "";
        todasIslas[7].style.display = "";
        break;
    
      default:
        mensaje = `Debe seleccionar una opción válida.`
        mostrarError(mensaje);
        provincia.focus();
        provincia.classList.add('error');
        statusForm = false;
        return;
        break;
    }
    provincia.classList.remove('error');
    mensaje = '';
    mostrarError(mensaje);
    statusForm = true;
    isla.removeAttribute("disabled");
    isla.focus();

  });

  isla.addEventListener('blur', (e) => {
    let valorIsla = isla.value;

    if ((valorIsla == "")) {
      mensaje = `Debe elegir una opción válida.`
      mostrarError(mensaje);
      isla.focus();
      isla.classList.add('error');
      statusForm = false;
      return;
    }
    isla.classList.remove('error');
    mensaje = '';
    mostrarError(mensaje);
    statusForm = true;
    fecha.focus();

  });

  fecha.addEventListener('blur', (e) => {
    let valorFecha = fecha.value;
    let datosFecha = valorFecha.split("/");
    let diaNacimiento = parseInt(datosFecha[0], 10);
    let mesNacimiento = parseInt(datosFecha[1], 10);
    let anioNacimiento = parseInt(datosFecha[2], 10);
    
    let fechaNacimiento = new Date(anioNacimiento, mesNacimiento - 1, diaNacimiento);
    let fechaActual = new Date();
  
    let myAge = fechaActual.getFullYear() - fechaNacimiento.getFullYear();
  
    // Ajustar la edad si el mes de nacimiento es mayor al mes actual
    if (mesNacimiento > fechaActual.getMonth() + 1 || (mesNacimiento === fechaActual.getMonth() + 1 && diaNacimiento > fechaActual.getDate())) {
      myAge--;
    }
  
    // Resto del código de validación
    let edadIngresada = parseInt(edad.value, 10);
  
    if (myAge !== edadIngresada) {
      mensaje = `La fecha seleccionada no coincide con la edad introducida.`;
      mostrarError(mensaje);
      fecha.focus();
      fecha.classList.add('error');
      statusForm = false;
      return;
    }
  
    fecha.classList.remove('error');
    mensaje = '';
    mostrarError(mensaje);
    statusForm = true;
  });

  telefono.addEventListener('blur', (e) => {
    let valorTelefono = telefono.value;
    telefonoRegex = new RegExp(`^[${INICIO_TELEFONO_VALIDO.join('')}]\\d{${LONGITUD_NUMERO_TELEFONO - 1}}$`);
  
    if (!telefonoRegex.test(valorTelefono)){
      mensaje = `Los telefonos solo pueden comenzar con ${INICIO_TELEFONO_VALIDO[0]} o ${INICIO_TELEFONO_VALIDO[1]} y  tener ${LONGITUD_NUMERO_TELEFONO}.`
      mostrarError(mensaje);
      telefono.focus();
      telefono.classList.add('error');
      statusForm = false;
      return;
    }
    telefono.classList.remove('error');
    mensaje = '';
    mostrarError(mensaje);
    statusForm = true;
    email.focus();

  });

  BOTON_ENVIAR.addEventListener('click', (e) => {
    e.preventDefault();

    if (confirm (confirmacion)) {
  
      if (statusForm) {
        setCookie('Intentos', 0, 0);
        document.getElementsByTagName('form')[0].submit();
      }else{
        addOneToCookie('Intentos');
        let intentos = document.getElementById('intentos');
        intentos.innerHTML = `Intento de Envíos del formulario: ${getCookie('Intentos')}`;
      }
    }

  });

  
});