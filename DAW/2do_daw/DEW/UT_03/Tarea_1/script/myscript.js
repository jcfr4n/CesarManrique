const NUEVA_VENTANA = () => {
    let message = '';
    let win = window.open('','','width="800", height="600"')
    win.document.write('<h3>Ejemplo de Ventana Nueva</h3>');
    win.document.write(`<span>URL Completa: ${win.location.href}</span><br/>`);
    win.document.write(`<span>Protocolo: ${win.location.protocol}</span><br/>`);
    win.document.write(`<span>Navegador: ${win.navigator.appName}</span><br/>`);
    message += (navigator.javaEnabled()) ? 'Java SI disponible en esta ventana' :'Java NO disponible en esta ventana';
    win.document.write(`<span>Navegador: ${message}</span><br/>`);
    win.document.write('<iframe src="https://cifpcesarmanrique.es/" width="800px" height="600" style="border:none;"></iframe>');
    
}

const NOMBRE_APELLIDO = prompt('Introduzca nombre y apellidos: ');
const DIA_NACIMIENTO = prompt('Introduzca día de nacimiento: ');
const MES_NACIMIENTO = prompt('Introduzca mes de nacimiento: ');
const ANIO_NACIMIENTO = prompt('Introduzca año de nacimiento: ');
const FECHA_NACIMIENTO = new Date(`${ANIO_NACIMIENTO}-${MES_NACIMIENTO}-${DIA_NACIMIENTO}`);
const DIAS_SEMANA = ['Domingo', 'Lunes','Maretes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado'];
const HOY = new Date();

window.document.write('<h1>TAREA DWEC03</H2><HR />');
window.document.write(`<span>Buenos días: <strong>${NOMBRE_APELLIDO}.</strong></span><br/>`);
window.document.write(`<span>Tu nombre tiene <strong> ${NOMBRE_APELLIDO.length} </strong> caracteres, incluidos espacios.<span><br/>`);
window.document.write(`<span>La primera letra A de tu nombre está en la posición: <strong> ${NOMBRE_APELLIDO.toLowerCase().indexOf('a')}</strong><span><br/>`);
window.document.write(`<span>La última letra A de tu nombre está en la posición: <strong>' ${NOMBRE_APELLIDO.toLowerCase().lastIndexOf('a')}</strong><span><br/>`);
window.document.write(`<span>Tu nombre menos las 3 primeras letras es: <strong> ${NOMBRE_APELLIDO.slice(3)}</strong></span><br/>`);
window.document.write(`<span>Tu nombre todo en mayúsculas es: <strong> ${NOMBRE_APELLIDO.toUpperCase()}</strong></span><br/>`);
window.document.write(`<span>Tu edad es: <strong>${(HOY.getFullYear()-FECHA_NACIMIENTO.getFullYear())}</strong> años.</span><br/>`);
window.document.write(`<span>Naciste un feliz ${DIAS_SEMANA[FECHA_NACIMIENTO.getDay()]} del año ${ANIO_NACIMIENTO}.</span><br/>`);
window.document.write(`<span>El coseno de 180 es: <strong>${Math.cos(180)}</strong></span><br/>`);
window.document.write(`<span>El número mayor de (34,67,23,75,35,19) es: <strong>${Math.max(34,67,23,75,35,19)}</strong></span><br/>`);
window.document.write(`<span>Ejemplo de número al azar: <strong>${Math.random()}</strong></span><br/>`);


NUEVA_VENTANA();