class Edificio {

    // Constructor de la clase Edificio
    constructor(calle, numero, codigoPostal) {

        this.calle = calle;
        this.numero = numero;
        this.codigoPostal = codigoPostal;
    
        console.log(`Construido nuevo edificio en calle: ${this.calle}, nº: ${this.numero}, CP: ${this.codigoPostal}.`);
    
    }

    agregarPlantasYPuertas(nroPlantas = 0, nroPuertas = 0) {
        let message = '';
        !this.plantas ? this.plantas = [] : '';
        // !this.puertas ? this.puertas = [] : '';
        
        if (!nroPlantas > 0){
            message = 'No se pudieron agregar plantas ni puertas';
        }else{
            for (let i = 0; i < nroPlantas; i++) {
                let planta = [];
                for (let j = 0; j < nroPuertas; j++) {
                    let puerta = [];
                    planta.push(puerta);            
                }      
                this.plantas.push(planta);
            }
            message = `Agregamos ${nroPlantas} plantas y ${nroPuertas} puertas por planta al edificio `;
        }
        return message;
    }
    
    modificarNumero(numero){
        this.numero = numero;
    }
    
    modificarcalle(calle){
        this.calle = calle;
    }
    
    modificarCodigoPostal(codigoPostal){
        this.codigoPostal = codigoPostal;
    }

    imprimeCalle(){
        return this.calle;
    }

    imprimeNumero(){
        return this.numero;
    }

    imprimeCodigoPostal(){
        return this.codigoPostal;
    }

    agregarPropietario(nombre,planta,puerta){
        this.plantas[planta-1][puerta-1]['nombre'] = nombre;
        console.log(`${this.plantas[planta-1][puerta-1]['nombre']} es ahora el propietario de la puerta ${puerta} de la planta ${planta}.`)
    }

    imprimePlantas(){
        if (this.plantas){
            for(let m = 0; m < this.plantas.length; m++){
                for(let n = 0; n < this.plantas[m].length; n++){
                    console.log(`Propietario del piso ${n+1} de la planta ${m+1}: ${(this.plantas[m][n]['nombre'])?this.plantas[m][n]['nombre']:''}` );
                }
            }
        }
    }
}



window.onload = () => {

    const edificioA = new Edificio('Garcia Prieto', '58', '15706');
    const edificioB = new Edificio('Camino Caneiro', '29', '32004');
    const edificioC = new Edificio('San Clemente', 's/n', '15705');


    console.log(`El código postal del edificio A es: ${edificioA.codigoPostal}.`);
    console.log(`La calle del edificio C es: ${edificioC.calle}.`);
    console.log(`El edificio B está situado en la calle ${edificioB.calle} número ${edificioB.numero}.`);

    console.log(`${edificioA.agregarPlantasYPuertas(2,3)} A...`);

    console.log(`El código postal del edificio A es ${edificioA.modificarCodigoPostal('15300'), edificioA.imprimeCodigoPostal()}`);

    edificioA.agregarPropietario('Jose Antonio Lopez',1,1);
    edificioA.agregarPropietario('Luisa Martínez',1,2);
    edificioA.agregarPropietario('Marta Castellón',1,3);
    edificioA.agregarPropietario('Jose Antonio Lopez',2,2);

    edificioA.imprimePlantas();

    console.log(`${edificioA.agregarPlantasYPuertas(1,3)} A...`);
    edificioA.agregarPropietario('Pedro Meijide',3,2);

    edificioA.imprimePlantas();


}

