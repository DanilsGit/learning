//Recursividad, clausuras
"use strict";

//Funcion recursiva
function factorial(n) {
    if (n == 0) {
        return 1;
    }
    return n * factorial(n - 1);
}
console.log(factorial(5));

function verificarEdad(msg) {
    try {
        let edad;
        if (msg) edad = prompt(msg);
        else edad = prompt("Ingrese su edad");
        edad = parseInt(edad);
        if (isNaN(edad)) throw "No es un numero";
        if (edad < 18) console.log("Es menor de edad");
        else console.log("Es mayor de edad");
    } catch (e) {
        verificarEdad(e)
    }
}
// verificarEdad();

//Clausuras

const saludar = (nombre) => {
    return function(){
        console.log(`Hola ${nombre}`);
    }
}

let saludo = saludar("Juan");
saludo();