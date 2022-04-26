const invertir = (palabra = "") => {
    if(palabra.length <= 1) return console.warn("No ingresaste texto");
    if(typeof(palabra) !== `string`) return console.error("El valor ingresado no es una palabra");



    let arreglo = palabra.split("")
    console.log(arreglo);
    let arregloInv = arreglo.reverse();
    console.log(arregloInv);
    let unir = arregloInv.join("");
    console.log(unir);

}

invertir ("Daniela");