const Daniela = {
    nomCompleto: {
        nom: "Mitzi",
        app: "Hernandez"
    },
    edad: 23,
    pasatiempo: ["jugar", "dibujar", "series"],
}

const Katia = {
  nomCompleto: {
    nom: "Katia",
    app: "Alvarez",
  },
  edad: 28,
  pasatiempo: ["Cine", "Musica", "Baile"],
};

const Pedro = {
    nomCompleto: {
        nom: "Antonio",
        app: "Castañón"
    },
    edad: 18,
    pasatiempo: ["jugar","salir","series"],
}

const Abi = {
    nomCompleto:{
        nom: "Abigail",
        app: "Moreno"
    }, 
    edad:23, 
    pasatiempo: ["bailar", "plantas", "fotografía"], 
}

const cohorte12 = [Daniela,Katia,Pedro,Abi];
console.log(cohorte12);

for(let i=0; i<cohorte12.length; i++){
    if(cohorte12[i].pasatiempo.includes("series")){
    console.log(cohorte12[i].nomCompleto.nom);
    }
}