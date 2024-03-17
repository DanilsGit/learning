"use strict";

this.nombre = "Contexto Global";

const objeto = {
    nombre: "RRR",
    apellido: "Perez",
    edad: 25,
    saludo: function () {
        console.log(`Hola ${this.nombre}`);
    }   
};

objeto.saludo();