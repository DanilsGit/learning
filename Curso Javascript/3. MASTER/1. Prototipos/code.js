
//Modificar el método del objeto
class Objeto {
    constructor() {
    }
    hablar() {
        console.log("Hola");
    }
}

const objeto = new Objeto();

//Esto crea un nuevo método
objeto.hablar = ()=> {
    console.log("Adios");
};

//Esto modifica el método
// objeto.__proto__.hablar = ()=> {
//     console.log("Adios");
// };

// console.log(objeto);

//En un array??
let arr = [];
arr.__proto__ = objeto;
arr.__proto__.hablar(); //Este encuentra uno por fuera

//Este usa el método original
let arr2 = [];
arr2.__proto__ = objeto.__proto__;
arr2.__proto__.hablar();




