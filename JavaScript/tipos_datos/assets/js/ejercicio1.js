//Escribes año y te regresa la edad
const year = document.querySelector("#year");
const btnCalcular = document.querySelector("#btnCalcular");

const yearAct = new Date().getFullYear();

btnCalcular.addEventListener("click", calculaEdad);

function calculaEdad(){
    const yearNacimiento = year.value;
    const edad = yearAct - yearNacimiento;
    console.log(edad);

}