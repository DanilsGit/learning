//Verificacion del navegador para ver si soporta el objeto
//XMLHttpRequest
//Esto es para navegadores antiguos
let request;
if (window.XMLHttpRequest) {
    console.log('El navegador si soporta el objeto XMLHttpRequest');
    request = new XMLHttpRequest();
}else{
    request = new ActiveXObject('Microsoft.XMLHTTP');
}

//Para escuchar el cambio de estado de la conexion

//De esta forma se trabajaba antes

// request.addEventListener('readystatechange', () => {
//     console.log(request.readyState);
//     if (request.readyState === 4 && request.status === 200) {
//         console.log(request.responseText);
//     }
//     console.log(request.status);
// });

//De esta forma se trabaja ahora
request.addEventListener('load', () => {
    console.log(request.status);
    let respuesta;
    if (request.status === 200) {
        respuesta = request.responseText;
        let respuestaDescodificada = JSON.parse(respuesta);
        console.log(respuestaDescodificada);
        console.log(respuestaDescodificada.nombre);
    }else{
        respuesta = 'Lo siento, no se ha encontrado el recurso';
    }
    console.log(respuesta);
});

//Significado de cada estado de la conexion:
//0: No inicializado
//1: Conexion establecida
//2: Recibido
//3: Procesando
//4: Respuesta lista

//Significado de cada status 
//200: OK
//403: Prohibido
//404: No encontrado
//500: Error interno del servidor

//Para abrir una conexion
request.open('GET','objeto.txt');
//Para ejecutar la conexion
request.send();






