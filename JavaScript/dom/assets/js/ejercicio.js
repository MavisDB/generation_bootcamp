const $card = document.querySelector(".card");
const $form = document.querySelector("form");

$form.addEventListener("submit", (e) =>{
    e.preventDefault();
    const datos = Object.fromEntries(
        new FormData(e.target)
    )
    crearElemento(datos.url, datos.texto);
    $form.reset();
});





function crearElemento(url, texto){
    const img = document.createElement("img");
    const txt = document.createElement("figcaption") //figcaption descripcion a una img
    img.src = url;
    img.alt = texto;

    txt.textContent = texto;

    //appendChild
    $card.appendChild(img); //nos permite agregar
    $card.appendChild(txt);

}
