// El use strict es para evitar errores de sintaxis
// y para que el navegador sea más estricto con el código
// y no permita ciertas cosas que no son buenas prácticas
// o que pueden ser errores en el código
// https://developer.mozilla.org/es/docs/Web/JavaScript/Referencia/Modo_estricto
'use strict';
//Convierte errores silenciosos en errores lanzados al bloque (throw errors)

// nombre = "daniel"; // Esto es un error porque no se ha declarado la variable
// se declara la variable con var, let o const

let nombre = "daniel";
console.log(nombre);

const objeto = {
    juego: "Zelda"
}

Object.defineProperty(objeto, 'nombre', {
    value: "danielObj",
    writable: false // No se puede cambiar el valor
});
// objeto.nombre = "danielObj2"; // No se puede cambiar el valor
// Sin el use strict esto no daría error (igual no lo reescribe)
// pero con el use strict si da error 

Object.preventExtensions(objeto);
// No se pueden añadir más propiedades que las que ya tiene


// Object.defineProperty(objeto, 'apellido', {
//     value: "Marquez",
// });
// o
// objeto.apellido = "Marquez";

// No se puede añadir la propiedad apellido porque no se ha permitido

console.log(objeto.nombre);

// Para que no se pueda modificar el objeto
// Object.freeze(objeto);

// Para strings, no se pueden agregar propiedades
let pais = "Colombia";
pais.ciudad = "Bogota";
console.log(pais.ciudad); // undefined sin el use strict
// Con el use strict esto da error

// Las funciones no pueden tener dos parámetros con el mismo nombre

function saludo(nombre, nombre) {
    console.log("Hola " + nombre);
}
saludo("Daniel", "Daniel2"); // Hola Daniel2 sin el use strict
// Con el use strict esto da error

//delete se usa para eliminar propiedades de un objeto
const obj = {
    nombre: "Daniel",
    apellido: "Marquez"
}
delete obj.nombre;
console.log(obj); // {apellido: "Marquez"}