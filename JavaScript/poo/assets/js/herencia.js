class Pokemon{
    //atributos
    #nombre = "";
    #edad = 0;
    #evolucion;

    constructor(nombre, edad, evolucion){
        this.#nombre = nombre;
        this.#edad = edad;
        this.#evolucion = evolucion;
    }

    get nombre(){
    return this.#nombre;
    }

    atacar(){
        return console.log(`${this.#nombre}, esta atacando`);
    }

    evolucionar(){
        let mensaje = ''
        
        if(this.#evolucion === ''){
            mensaje = 'No puedo evolucionar';
            console.log(mensaje) 
        }else{
            mensaje = `${this.#nombre} ha evolucionado a ${this.#evolucion}`;
            this.#nombre = this.#evolucion;
            console.log(mensaje);
        }
         
    }


    
}
/* 
const pokemon1 = new Pokemon("Charmander",2, "Charmeleon","Fuego")
const pokemon2 = new Pokemon("Bulbasaur", 1 , "Ivisaur", "Planta"); */

/* console.log(pokemon1);
console.log(pokemon2);

pokemon2.atacar();

pokemon1.evolucionar(); */

//Clase hija
class TipoFuego extends Pokemon{
    //atributos
    #tipo = "";
    constructor(nombre, edad, evolucion, tipo){
        super(nombre,edad,evolucion);
        this.#tipo = "Fuego";
    }

    atacar(){
        
        return console.log(`${this.nombre}, esta lanzando un ataque de tipo ${this.#tipo}`);
    }



}

let nombre = "Charmander";

const pokemon1 = new TipoFuego(nombre,2, "Charmeleon")
console.log(pokemon1);

pokemon1.atacar();
/* pokemon1.evolucionar(); */
