addEventListener("load", function(){
    this.alert("Se ha terminado de cargar la pagina");
});

function saludar(){
    alert("Hola");
}

/* Manejadores de eventos semantico */
const $botonSemantico = document.getElementById("eventoSem");
$botonSemantico.onclick = saludar; //Se coloca sin parametros porque si no se ejecuta solo y en este caso la accion la  debe hacer cuando se hace click, por eso es sin ()

$botonSemantico.onclick = function (evento){
    //alert("Hola desde un manejador semantico");
    console.log(evento.target); //con target te marca en especifico desde donde se esta mandando, identificar elementos
}

/* Manejador de eventos multiple */
const $botonMultiple = document.getElementById("eventoMult");
$botonMultiple.addEventListener('click', saludarMultiple)
$botonMultiple.addEventListener('click', function(e){
    console.log(e.target);
})

function saludarMultiple(){
    alert ("Hola desde manejador multiple");
}

