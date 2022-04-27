const nom = "Daniela";
const nom2 = new String ("Mitzi");


//Ya no se ocupa esta forma
const persona = new Object();
persona.nom = "Daniela"
persona.app = "Hernandez"
persona.edad = 23

console.log(persona);

//Forma actual de hacer Objeto

const nvPersona = {
    /* atributos o propiedades*/
    nomCompleto: {
        nom: "Mitzi",
        app: "Hernandez"
    },
    edad: 23,
    pasatiempo: ["jugar", "dibujar", "ver series"],
    tieneTrabajo:true,
    /* metodo */
    saludar: function () {
        console.log("Hola");
    },
    sumar: function (n1,n2){
        console.log(`El resultado de la suma es: ${n1 + n2}`);
    }
}

"Hola".length /* atributos o propiedades */
"Hola".toLowerCase() /* metodo */

console.log(nvPersona.edad);
console.log(nvPersona.tieneTrabajo);
console.log(nvPersona.saludar);

nvPersona.saludar();
nvPersona.sumar(5,10);

/* Para cambiar el valor */
nvPersona.edad = 10;
console.log(nvPersona);

/* Agregar nuevo atributo */
nvPersona.colorFav = "Azul";
console.log(nvPersona.colorFav);

console.log(nvPersona.hasOwnProperty("edades")) //hasOwnProperty te sirve para lanzarte T or F, si es que encuentra la propiedad en tu arreglo
console.log(Object.keys(nvPersona));
console.log(Object.values(nvPersona));

