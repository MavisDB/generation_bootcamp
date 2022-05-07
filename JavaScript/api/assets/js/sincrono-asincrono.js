/* let tiempo = 5000
let datos

setTimeout(() =>{
   let datos = "Daniela"
   console.log(datos);
}, tiempo)

console.log(datos);
console.log("Hola"); */

const datos = [
    {
        nombre: "Daniela",
        edad: 23,
    },
    {
        nombre: "Mitzi",
        edad: 29,
    },
    {
        nombre: "Bruno",
        edad: 19,
    },
]

function obtenerDatos(){
    return new Promise((resolve,reject) =>{
        setTimeout(() =>{
            resolve(datos) 
        },3000)
    })
}

/* obtenerDatos().then((datos) =>{
    console.log(datos);
})
//then -- le estamos diciendo que si una vez que la promesa se cumple hara tal cosa */

async function obtenerDatosAsync(){
    const datosObtenidos = await obtenerDatos()
    console.log(datosObtenidos);
}

obtenerDatosAsync()