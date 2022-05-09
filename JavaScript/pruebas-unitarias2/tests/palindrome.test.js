//importar
const {palindrome} = require ("../para_probar");

//primer test unitario
test("palindrome de generation", () => {
    const resultado = palindrome("generation");

    //comparar
    expect(resultado).toBe('noitareneg');
})

//segundo test unitario
test("palindrome usando un string vacio", () => {
    const resultado = palindrome("");

    //comparar
    expect(resultado).toBe('');
})

//tercer test unitario
test("palindrome usando undefined", () => {
    const resultado = palindrome();

    //comparar
    expect(resultado).toBe();
})