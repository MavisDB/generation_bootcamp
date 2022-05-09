const {average} =  require("../para_probar");

describe("average", () => {
    /* test("Ingresa un valor", () => {
        const resultado = average ([1]);

        expect(resultado).toBe(1);
    }) */

    test("Ingresa un solo valor", () => {
        expect(average([1])).toBe(1);
    })

    test("Usando multiples valores", () => {
        expect(average([1, 2, 3, 4, 5, 6])).toBe(3.5);
    })

    //crear test para probar un valor undefined
    test("Provocar que de undefined con un metodo", () => {
        expect(average()).toBeUndefined();
    })

    //crear test para array vacio
    test("Usando array vacio", () => {
        expect(average([])).toStrictEqual([]);
    })
}) 