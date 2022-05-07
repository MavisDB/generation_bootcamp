const url = "https://dog.ceo/api/breeds/list/all"
const lista = document.querySelector("ul")

fetch(url).then(resp => resp.json()).then(datos =>{
    console.log(datos.message.hound);

    const arregloHound =  datos.message.hound
    console.log(arregloHound);

    arregloHound.forEach((tipoHound) => {
        console.log(tipoHound);

        const template = `<li class="list-group-item">${tipoHound}</li>`

        lista.innerHTML += template
    })
})