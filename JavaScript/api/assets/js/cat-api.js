const url = "https://cdn2.thecatapi.com/images/5u8.jpg"
const imagenGato = document.getElementById("imagenGatito")

$btnGato.addEventListener("click",() => {
fetch(url).then(respuesta => respuesta.json()).then(datos =>{
    console.log(datos[0]);
    imagenGato.src = datos.message
})