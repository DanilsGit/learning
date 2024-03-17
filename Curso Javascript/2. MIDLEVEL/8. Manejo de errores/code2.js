
const prueba = () => {

    try {
        return 1;
    } catch (error) {
        return 2;
    } finally {
        return 3;
    }

}

console.log(prueba()); // 3
/* 
    El bloque finally siempre se ejecuta, incluso si hay un return en el bloque try o catch. 
    El valor devuelto por finally sobreescribe cualquier valor devuelto por catch o try.
*/