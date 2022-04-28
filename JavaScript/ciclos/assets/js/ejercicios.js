//ESCRIBE UN CICLO QUE IMPRIMA EL SIGUIENTE PATRON
/* 
*  
 * *  
 * * *  
 * * * *  
 * * * * *
*/

/* for (let i=1; i<=5; i++){          //1
    for(let j=1; j<=i; j++){       //5
    document.write("*");
    //console.log("Ciclo hijo \n");
    }
    document.write("<br>");
} */

//EJERCICIO1
//Repetidamente imprime el valor de la variable xValue, disminuyendo por 0.5 su valor cada iteración.
//El ciclo se mantendrá mientras que el valor de xValue sea positivo.

/* for (let i = xValue; i>0; i-=0.5){
    document.write(i + "<br>");
} */

//Ejercicio 2
//Imprime todos los números impares entre 1 y 100
/* const num2 =2;
for (let i  = 0; i<=100; i++){
    if(i%num2 == 0){
        document.write(i+1 + "<br>")
    }
} */

//Ejercicio 3
//Escribe un ciclo while que imprima de 1 a n dentro de corchetes cuadrados
//Por ejemplo: si n = 6 imprime [1] [2] [3] [4] [5] [6]
/* const numIn = new Number (prompt("Ingrese un numero"));
let contador = 1;

while (contador <= numIn){
    document.write("[" + contador + "]");
    contador++;
} */

//Ejercicio 4
//Escribe un ciclo que calcule la suma de los numeros positivos entre 1 y n
//ejemplo: n = 5 sum = 15     
//por que (1 + 2 + 3 + 4 +5 )
/* let n=45;
let suma=0;

for (let i=1; i<=n; i++){
    suma=suma+i;
}
console.log(suma); */

let numIn = new Number(prompt("Ingrese un número"));

for (numIn ; numIn>0 ; numIn--) {
    document.write("<hr>" + numIn + "<hr>");
    for (let i = 0; i<=numIn; i++) {
        let arrayIn = new Array();
        arrayIn.push(i);
        document.write(arrayIn + "<br>");
    }
}


