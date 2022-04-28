const $titulo = document.querySelector("h1");
const $parr = document.querySelector("p");
const $card = document.querySelector(".card"); //punto por el elemento de clase

//node.Name
console.log($parr.nodeName);
console.log($titulo.nodeName);

//name.textContent - Devuelve el contenido de texto del elemento. Se puede asignar para modificar.
$parr.textContent += "Adios mundo!";
console.log($parr.textContent);

$titulo.textContent = "Modificando elementos con JS"

//innerText - mejor no usarla

//innerHTML -- Agregar elementos de un HTML
//el textContent te lanza tal cual el contenido junto con las etiquetas y el inner el contenido, sin etiquetas

console.log($parr.innerHTML);
$parr.innerHTML = '<a href ="#"> Este es un enlace </a>'
//reemplaza lo que hay adentro del elemento seleccionado

//outerHTML
//$parr.outerHTML = '<a href ="#"> Este es un enlace </a>'
//reemplaza todo, incluido el elemento que seleccionamos


//Crear elementos html
console.log(document);
function crearElemento(){
    const img = document.createElement("img");
    img.src = "https://as1.ftcdn.net/v2/jpg/03/32/56/46/1000_F_332564633_s0bfIwcGsRLSICTCLWdbI4rmtVIjJMr2.jpg";
    //appendChild
    $card.appendChild(img); //nos permite agregar
}

crearElemento();