"use strict";

//Operadores

//Operador ternario
let edad = 18;
edad >= 18 ? (
        console.log("Es mayor de edad"),
        console.log("Puede pasar")
    )
            : console.log("Es menor de edad");

//Operador spread
let lenguajes = ["JavaScript", "PHP", "Python"];
    //Para añadir arrays a otros arrays
    let lenguajesPlus = ["Java", "C#"];
    lenguajes.push(...lenguajesPlus);
    console.log(lenguajes);

    //Para concatenar dos arrays
    let frameworks = ["ReactJS", "Laravel", "Django"];
    let combinacion = [...lenguajes, ...frameworks];
    console.log(combinacion);

    //Argumento rest
    let suma = (num1,num2) => {
        console.log(num1+num2);
    };
    let numeros = [2,3];
    suma(...numeros);