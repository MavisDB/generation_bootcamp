/* Programa una función que valide si una palabra o frase dada, es un palíndromo 
(que se lee igual en un sentido que en otro), pe. mifuncion("Salas") devolverá true */

// EJERCICIO1 
const palindromo = (word) => {
    let volteada;
    nospaces = word.replace(/\s/g, '');
    volteada = nospaces.split('').reverse().join('')
      if (volteada.toLowerCase() == nospaces.toLowerCase()) {
      return true
    } else {
      return false
    }
  }
  
  console.log(palindromo('anita lava la tina'));

  // EJERCICIO2
  const repetir = (word, num) => {
    let phrase = [];
    for (let i = 0; i < num; i++) {
      phrase.push(word)
    }
    return phrase.join(' ');
  }
  
  console.log(repetir('Adiós mundo',10))

  // EJERCICIO3
  const recorte = (word, num) => {
    if (word.length < num) {
      return console.error('No hay suficientes caracteres')
    } else {
      return word.substring(0,num);
    }
  }
  
  console.log(recorte('Adiós mundo', 5));

  // EJERCICIO4
  const factorial = (n) => {
    if (n >= 0) {
      var total = 1; 
      for (i=1; i<=n; i++) {
        total = total * i; 
      }
      return total;
    } else {
      console.error('Introduce un número mayor o igual a cero');
    }
  }
  
  console.log(factorial(5));
  
  