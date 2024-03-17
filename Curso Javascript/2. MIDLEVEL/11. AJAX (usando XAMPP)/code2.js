console.log('  - - - - - - - ');

let request;

if (window.XMLHttpRequest) {
    console.log('El navegador si soporta el objeto XMLHttpRequest');
    request = new XMLHttpRequest();
}else{
    request = new ActiveXObject('Microsoft.XMLHTTP');
}

request.addEventListener('load', () => {
    console.log(request.status);
    let respuesta;
    if (request.status === 200 || request.status === 201) {
        respuesta = request.responseText;
        let respuestaDescodificada = JSON.parse(respuesta);
        console.log(respuestaDescodificada);
        console.log(respuestaDescodificada.name);
    }else{
        respuesta = 'Lo siento, no se ha encontrado el recurso';
    }
    console.log(respuesta);
});

//Para enviar datos por POST

//En POST el status 201 significa que se ha creado un nuevo recurso

request.open('POST','https://reqres.in/api/users');
request.setRequestHeader('Content-type','application/json;charset=utf8');
//El content-type es un header que se envía en la petición para indicar el tipo de contenido que se envía
//Aparte del content-type hay otros tipos de cabeceras como:
//Accept: Para indicar el tipo de contenido que se acepta
//Authorization: Para enviar credenciales de acceso
//Cache-Control: Para indicar si se debe o no almacenar en caché
//Cookie: Para enviar cookies
//Origin: Para indicar el origen de la petición
//Referer: Para indicar la página que ha enviado la petición
//User-Agent: Para indicar el navegador que ha enviado la petición

request.send(JSON.stringify(
    {
        "name": "morpheus",
        "job": "leader"
    }
));


