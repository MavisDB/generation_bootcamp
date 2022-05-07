const expresiones = {
	usuario: /^[a-zA-Z0-9_-]{4,16}$/, // Letras, numeros, guion y guion_bajo
	nombre: /^[a-zA-ZÀ-ÿ\s]{1,40}$/, // Letras y espacios, pueden llevar acentos.
	password: /^.{4,12}$/, // 4 a 12 digitos.
	email: /^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/,
	telefono: /^\d{7,14}$/ // 7 a 14 numeros.
}

// Para recuperar los valores de un formulario necesitamos
// Llamar al formulario con el dom y la etiqueta form

const formulario = document.querySelector('form');

// Llamar a todos los inputs con querySelectorAll
const inputs = document.querySelectorAll('input')
// console.log(inputs);

const nombreError = document.querySelector("#errorNom");
const apellidoError = document.querySelector("#errorApp");
const emailError = document.querySelector("#errorEmail");
const passwordError = document.querySelector("#errorPass");
const telefonoError = document.querySelector("#errorTel");

const statusInf = {
	nombre: false,
	apellido: false,
	email: false,
	password: false,
	telefono: false
}

inputs.forEach((input) => {
	// console.log(input);
	input.addEventListener('keyup',(e)=>{
		// console.log(e.target.name);
		
		switch(e.target.name){
			case "nombre":
				// console.log(e.target.value);
				// console.log(expresiones.nombre.test(e.target.value));
				if (expresiones.nombre.test(e.target.value)) {
					statusInf.nombre = true;
					nombreError.textContent = ""
				} else {
					nombreError.textContent = "Error"
					statusInf.nombre = false;
				}
				break;
			case 'apellido':
				// console.log(e.target.value);
				if (expresiones.nombre.test(e.target.value)) {
					apellidoError.textContent = ""
					statusInf.apellido = true;
				} else {
					apellidoError.textContent = "Error"
					statusInf.apellido = false;
				}
				break;
			case 'email':
				// console.log(e.target.value);
				if (expresiones.email.test(e.target.value)) {
					emailError.textContent = ""
					statusInf.email = true;
				} else {
					emailError.textContent = "Error"
					statusInf.email = false;
				}
				break;

			case 'password':
				// console.log(e.target.value);
				if (expresiones.password.test(e.target.value)) {
					passwordError.textContent = ""
					statusInf.password = true;
				} else {
					passwordError.textContent = "Error"
					statusInf.password = false;
				}
				break;

			case 'telefono':
				// console.log(e.target.value);
				if (expresiones.telefono.test(e.target.value)) {
					telefonoError.textContent = ""
					statusInf.telefono = true;
				} else {
					telefonoError.textContent = "Error"
					statusInf.telefono = false;
				}
				break;
		}
	})
})

// console.log(formulario);
formulario.addEventListener("submit",(e) =>{
	// Evita que la página se recargue por el submit
	e.preventDefault();
	/* console.log(Object.values(statusInf));
	console.log(Object.values(statusInf).includes(false));
	 */
	const check = document.querySelector("#terminos").checked
	/* console.log(check); */
	if(!Object.values(statusInf).includes(false) && check == true){
		//console.log('Enviado');
		document.querySelector(".alert-danger").style.display = "none"
		const datos = Object.fromEntries(
			new FormData(e.target)
		)
		console.log(datos)
		formulario.reset()


	}
	else{
		//console.log('No Enviado');
		document.querySelector(".alert-danger").style.display = "block"
	}
	
})