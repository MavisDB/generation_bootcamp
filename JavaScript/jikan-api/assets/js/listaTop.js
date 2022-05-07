const urlTop = "https://api.jikan.moe/v4/top/anime"
const topAnime = document.getElementById("topAnime")

fetch (urlTop).then(resp => resp.json()).then((datos) =>{
    /* console.log(datos.data.slice(0,8)); */

    const animesTop = datos.data.slice(0,8)

    animesTop.forEach((top) => {
        console.log(top);

        const datosNec = {
            nombre: top.title
        }

        const template = `<a href="#" class="list-group-item list-group-item-action">${datosNec.nombre}</a>
        `

        topAnime.innerHTML += template

        console.log(datosNec);
    })

})