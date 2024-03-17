//Las promesas son asincronas, trabajan en tiempo real

const objeto = {
    nombre: 'Eltrin',
    edad: 26,
    pais: 'MX'
}

const obtenerInformacion = () => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {resolve(objeto)}, 1000);
    })
};

// Muestra el objeto en consola despues de 1 segundo (1000 milisegundos)
obtenerInformacion().then(resultado => console.log(resultado));


//Otra forma de hacerlo es con async y await

const mostrarInformacion = async () => {
    const resultado = await obtenerInformacion();
    console.log(resultado);
}

mostrarInformacion();

// Ejemplos

const obtenerInformacion2 = (txt) => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {resolve(txt)}, Math.random() * 200);
    })
}

//Orden aleatorio, debido al tiempo de espera random

obtenerInformacion2('Primer texto').then(resultado => console.log(resultado));
obtenerInformacion2('Segundo texto').then(resultado => console.log(resultado));
obtenerInformacion2('Tercer texto').then(resultado => console.log(resultado));

//Para que se muestre en orden, se utiliza async y await
//Lo que hace el await es esperar a que se resuelva la promesa 
//para continuar con el codigo
const mostrarInformacion2 = async () => {
    dato1 = await obtenerInformacion2('a');
    dato2 = await obtenerInformacion2('b');
    dato3 = await obtenerInformacion2('c');
    console.log(dato1);
    console.log(dato2);
    console.log(dato3);
};

mostrarInformacion2();