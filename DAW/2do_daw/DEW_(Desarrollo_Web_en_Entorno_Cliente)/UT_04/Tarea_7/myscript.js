/**
 * Array de letras utilizadas para calcular la letra del DNI.
 * @type {string[]}
 */
const LETRAS = [
  "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E",
];

/**
 * Calcula la letra del DNI basada en un número de DNI proporcionado.
 * @returns {string} Mensaje para informar la letra del DNI.
 */
function calcularLetraDni() {
  let numeroDni = prompt(
    "Por favor introduzca un número de dni para calcular su letra: "
  );
  let indiceLetra = numeroDni % 23;

  return `
            <h1>DNI:</H1>
            <p>La letra de tu DNI es: ${LETRAS[indiceLetra]}</p>
            `;
}

/**
 * Genera un número aleatorio en el rango [min, max).
 * @param {number} min - Valor mínimo (incluido).
 * @param {number} max - Valor máximo (excluido).
 * @returns {number} Número aleatorio generado.
 */
function aleatorio(min, max) {
  return Math.floor(Math.random() * (max - min) + min);
}

/**
 * Separa los números pares e impares de dos vectores y los ordena en pares e impares.
 * @param {number[]} vector_par - Vector que almacenará los números pares.
 * @param {number[]} vector_impar - Vector que almacenará los números impares.
 */
function par_impar(vector_par, vector_impar) {
  let temp = vector_par.concat(vector_impar);
  temp.sort((a, b) => a - b);

  vector_par.length = 0;
  vector_impar.length = 0;

  for (let i = 0; i < temp.length; i++) {
    temp[i] % 2 == 0 ? vector_par.push(temp[i]) : vector_impar.push(temp[i]);
  }

  temp = [];
}

/**
 * Elimina los elementos duplicados de un array usando prototipos.
 */
Array.prototype.Duplicados = function () {
  const uniqueSet = new Set(this);
  const uniqueArray = Array.from(uniqueSet);
  this.length = 0;
  this.push(...uniqueArray);
};

/**
 * Genera vectores de números aleatorios y realiza operaciones en ellos.
 * @param {number} iteraciones - Número de iteraciones para generar números aleatorios.
 * @returns {string} Un mensaje que resume las operaciones realizadas.
 */
function vectores(iteraciones) {
  let message = "";
  let vector_par = [];
  let vector_impar = [];

  let min = prompt(
    `Introduzca el valor mínimo(incluído) del intervalo para generar números de forma aletoria`
  );
  let max = prompt(
    `Introduzca el valor máximo(excluido) del intervalo para generar números de forma aleatoria`
  );

  message += `<h1>El intervalo elegido es [${min}, ${max})</h1>`;

  min = Number(min);
  max = Number(max);

  for (let i = 0; i < iteraciones; i++) {
    vector_impar[i] = aleatorio(min, max);
    vector_par[i] = aleatorio(min, max);
  }

  message += `<h1>Vectores inicialmente</h1>`;
  message += `<p>vector_par: ${vector_par}</p>`;
  message += `<p>vector_impar: ${vector_impar}</p>`;

  par_impar(vector_par, vector_impar);

  message += `<h1>Vectores ordenados en pares e impares con posibles valores duplicados</h1>`;
  message += `<p>vector_par: ${vector_par} - Su tamaño es ${vector_par.length}</p>`;
  message += `<p>vector_impar: ${vector_impar} - Su tamaño es ${vector_impar.length}</p>`;

  vector_impar.Duplicados();
  vector_par.Duplicados();

  message += `<h1>Vectores ordenados sin duplicados</h1>`;
  message += `<p>vector_par: ${vector_par} - Su tamaño es ${vector_par.length}</p>`;
  message += `<p>vector_impar: ${vector_impar} - Su tamaño es ${vector_impar.length}</p>`;

  return message;
}

window.onload = function () {
  document.body.innerHTML = calcularLetraDni();
  document.body.innerHTML += vectores(20);
};

