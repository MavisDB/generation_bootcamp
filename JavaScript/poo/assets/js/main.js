class Persona{
    //atributos
    #id= 0;
    static #contador = 0;
    #nombre = "";
    #edad = 0;
    #correo = "";

    constructor(nombre, edad, correo){
        this.#nombre = nombre;
        this.#edad = edad;
        this.#correo = correo;
        this.#id = ++Persona.#contador;

    } 

    //setters y getters
    //set y get
    //fijar y obtener
    get getNombre(){
        return this.#nombre;
    }

    set setNombre(nombre){
        this.#nombre = nombre;

    }


    get getEdad(){
        return this.#edad;
    }

    set setEdad(edad){
        this.#edad = edad;
    }

    get getCorreo(){
        return this.#correo;
    }

    set setCorreo(correo){
        this.#correo = correo;
    }

    
    cambiarNombre(nombre){
        this.#nombre = nombre;

    }

    #saludar (){
        let mensaje = `Hola mi nombre es ${this.#nombre}`;
        return mensaje;
    }

    mostrarSaludo(){
        return this.#saludar();
    }

    static mostrarContador(){
        return Persona.#contador;
    }
}

//instancia de la clase persona
const persona1 = new Persona("Daniela", 18, "mitzi_miz@hotmail.com");
const persona2 = new Persona("Bruno", 24, "bruno1222@hotmail.com");
const persona3 = new Persona ("David",39, "ddavisz@outlook.es");

persona1.setNombre = "José"
persona1.cambiarNombre("Antonio");


persona2.setEdad = "30"
persona2.setCorreo = "daniela@hotmail.com"

console.log(persona1);
console.log(persona2);
console.log(persona3);
/* console.log(persona2.getNombre);
console.log(persona2.getEdad);
console.log(persona2.getCorreo);

console.log(persona1.mostrarSaludo()); *//* 
console.log(Persona.contador); */
console.log(Persona.mostrarContador());