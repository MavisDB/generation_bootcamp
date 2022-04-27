//Escribes año y te regresa la edad
//AVTIVIDAD CON MI EQUIPO
/* const year = document.querySelector("#year");
const btnCalcular = document.querySelector("#btnCalcular");

const yearAct = new Date().getFullYear();

btnCalcular.addEventListener("click", calculaEdad);

function calculaEdad(){
    const yearNacimiento = year.value;
    const edad = yearAct - yearNacimiento;
    console.log(edad);

} */

//EJERCICIO HECHO POR JONATHAN
//NIVEL 1
/* const anioNac  = parseInt(prompt("Escribe tu año de nacimiento: "));
const anioAct = 2022;
console.log(`Año de nacimiento: ${anioNac}`);
console.log(`Tienes ${anioAct - anioNac} años`);
 */

//NIVEL 2
//OPCION 1
/* const anioAct = 2022;

function calEdad() {
    const anioNac = parseInt(document.getElementById("anio").value);
    console.log(anioNac); //Consigue la etiqueta del año de nacimiento pero se le añade 'value' para ver que si esta jalando especificamente el dato en este caso 1998  
    console.log(`Tienes ${anioAct - anioNac} años`)
} */

//OPCION2
/* const boton = document.getElementById("calcular")
console.log(boton);

boton.addEventListener("click", () =>{
    const anioNac = parseInt(document.getElementById("anio").value);
    console.log(anioNac);
    console.log(`Tienes ${anioAct - anioNac} años`)
}) */

//NIVEL3
const fecha = new Date()
const anioAct = fecha.getFullYear()
console.log(anioAct);
const mesAct = fecha.getMonth() +1
console.log(mesAct);
const diaAct = fecha.getDay()
console.log(diaAct);



/* const anioAct = 2022;
const mesAct = 04;
const diaAct = 27; */

function mostrarDatos(){
    const nac = document.getElementById("anio").value;
    console.log(nac);
    const nacDiv = nac.split("-")
    console.log(nacDiv);
    const anioNac = parseInt(nacDiv[0])
    const mesNac = parseInt(nacDiv[1])
    const diaNac = parseInt(nacDiv[2])
    console.log(anioNac,mesNac,diaNac);

    if (mesNac <= mesAct && diaNac <= diaAct){
        console.log(`Tienes ${anioAct - anioNac} años`)
    }
    else{
        console.log(`Tienes ${anioAct - anioNac - 1} años`)

    }
}

    