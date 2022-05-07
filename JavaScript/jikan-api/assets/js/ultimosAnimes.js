const urlUltimos = "https://api.jikan.moe/v4/seasons/now"
const ultimosAnimes = document.getElementById("ultimosAnimes")

fetch(urlUltimos).then(resp => resp.json()).then(datos =>{
  /*   console.log(datos.data); */

    const arregloAnimesUltimos = datos.data.slice(0,16)
    /* console.log(arregloAnimesUltimos);  */

    arregloAnimesUltimos.forEach((anime) =>{
        /* console.log(anime); */


      /*   Datos de la API*/
        const datosNec = {
            nombre: anime.title,
            imagen: anime.images.jpg.image_url,
            id: anime.mal_id,
            sinopsis: anime.synopsis,
        }

        const template = `<div class="col mb-4">
                            <a href="informacion.html?id=${datosNec.id}">
                            <div class="card">
                            <img src="${datosNec.imagen}" class="card-img-top" alt="...">
                                <div class="card-body">
                                <h5 class="card-title">${datosNec.nombre}</h5>
                               
                                </div>
                            </div>
                            </a>
                        </div>`

        ultimosAnimes.innerHTML += template

    })
})