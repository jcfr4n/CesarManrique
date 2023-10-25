const LETRAS = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'];

function calcularLetraDni() {
    let numeroDni = prompt('Por favor introduzca un número de dni para calcular su letra: ');
    let indiceLetra = numeroDni % 23;

    return (`La letra correspondiente al DNI ${numeroDni} es la letra "${LETRAS[indiceLetra]}".`);
}

function aleatorio (min,max) {
    return Math.floor(Math.random() * (max - min) + min);
}

function par_impar(vector_par, vector_impar) {
  for (let i = 0; i < vector_impar.length; i++) {
    if (vector_impar[i] % 2 === 0) {
      vector_par.push(vector_impar[i]);
      vector_impar.splice(i, 1);
      i--;
    }
  }
}

Array.prototype.Duplicados = function () {
  for (let i = 0; i < this.length; i++) {
    const index = this.lastIndexOf(this[i]);
    if (index !== i) {
      this.splice(index, 1);
    }
  }
}

function vectores () { 
    let vector_par = [];
    let vector_impar = [];

    let min = prompt(`Introduzca el valor mínimo(incluído) del intervalo para generar números de forma aletoria`);
    let max = promp(`Introduzca el valor máximo(excluido) del intervalo para generar números de forma aleatoria`);

    for (let i = 0; i < iteraciones; i++) {
        vector_impar[i] = aleatorio(min, max);
        vector_par[i] = aleatorio(min, max);            
    }

    vector_impar.sort((a,b) => a - b);
    vector_par.sort((a,b) => a - b);

    par_impar(vector_impar, vector_par);

    vector_impar.Duplicados();
    vector_par.Duplicados();

    return (`Vector Impar (ordenado y sin duplicados):\n
            ${vector_impar}\n\n\n
            Vector Par (ordenado y sin duplicados):\n
            ${vector_par}.`)
    
} 


generaNumerosAleatorios();

