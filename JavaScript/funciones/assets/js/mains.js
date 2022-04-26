/* FUNCIONES, NOS PERMITES REUTILIZAR CODIGO */
function saludar(nombre = "", apellido = "HERNANDEZ") {
    //let nombre = 'DANIELA';
    //let nombre = false;
    //String normal
    //console.log("HOLA! MI NOMBRE ES: ", nombre, apellido);
    //Template String || Plantilas literales
    //console.log(`HOLA! MI NOMBRE ES: ${nombre}`); //Template Strings || plantillas literales
    //Operador tiernario
    //console.log(`HOLA! MI NOMBRE ES: ${nombre?"MITZI" : "DESCONOCIDO"}`);
    return `Mi nombre es: ${nombre} ${apellido}`;
}

/* saludar("MITZI", "HERNANDEZ"); //La invocacion o llamada de la funcion
let funcionSaludar = saludar ("BRUNO", "DÍAZ"); 
console.log(funcionSaludar);
console.log(saludar("JAVIER", "RUIZ"));
 */


/* document.write("<h1> Este es un texto h1 </h1>");
//comillas normales
console.log("<h1> Este es un texto h1 </h1>");
//comillas invertidas *En esta actividad no afecta pero es mejor usar `
//Plantilla literal
console.log(`<h1> Este es un texto h1 </h1>`); */

//funciones declaradas
function suma(a,b) {
    return a + b;
    
}

console.log(suma(10,20));

//funciones expresadas | funcion expresion
const resta = function (a, b){
    return a - b;
}

//console.log(resta(10,5));

/* setTimeout(()) => {

}, 3000;
 */

//funcion flecha
const multiplicacion = (a,b) =>{
    return a * b;
}
// SE PUEDE ESCRIBIR EN UNA SOLA LINEA
const multiplicacion = (a,b) => a * b
console.log(multiplicacion(40, 5));