
// Callback es una funcion que se ejecuta despues de que algo suceda

//Recibo una funcion como parametro y la ejecuto
function prueba(callback){
    callback();
}


//Ejemplo 1

function nombre(){
    console.log('Hola Mundo');
}

prueba(nombre);

//Ejemplo 2

prueba(function nombre(){
    console.log('Hola Mundo2');
});

//Ejemplo 3

prueba(nombre => {
    console.log('Hola Mundo3');
});

//Ejemplo 4

prueba(nombre => console.log('Hola Mundo4'));

//Ejemplo 5

prueba(() => console.log('Hola Mundo5'));


// Una promesa es un objeto que representa 
// la terminación o el fracaso de una operación asíncrona.

let apodo = 'Juan';

const promesa = new Promise((resolve, reject) => {
    if (apodo !== 'Juan') {
        reject('El nombre no es Juan');
    }else{
        resolve(apodo);
    }
});

// Los datos de la promesa se obtienen con then y catch

// si la condicion sale bien se ejecuta el then
// promesa.then(resultado => {
//     console.log(resultado);
// })

// // si la condicion sale mal se ejecuta el catch
// promesa.catch(error => {
//     console.log(error);
// });

// // evaluar ambos casos
// promesa
//     .then(resultado => console.log(resultado))
//     .catch(error => console.log(error));

// Ejemplo

class Persona {
    constructor(nombre, edad){
        this.nombre = nombre;
        this.edad = edad;
    }
}

const datos =   [["Juan",50],
                [,30],
                ["Pedro",],
                ["Luis",40]];

const personas = [];

for (let i = 0; i < datos.length; i++) {
    personas[i] = new Persona(datos[i][0], datos[i][1]);
}

const obtenerNombre = (id) => {
    return new Promise((resolve, reject) => {
        if (personas[id].nombre == undefined) {
            reject('No existe el nombre');
        }else{
            resolve(personas[id].nombre);
        }
    });
}

const obtenerEdad = (id) => {
    return new Promise((resolve, reject) => {
        if (personas[id].edad == undefined) {
            reject('No existe la edad');
        }else{
            resolve(personas[id].edad);
        }
    });
}

let id=3;

obtenerNombre(id).then(persona=>{
    console.log(persona);
    return obtenerEdad(id);
}).then(persona=>{
    console.log(persona);
}).catch(error => console.log(error));