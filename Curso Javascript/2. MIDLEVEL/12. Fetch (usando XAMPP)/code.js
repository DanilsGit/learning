//Tenemos el objeto HTMLhttpRequest
//Para manejarlo se usará fetch
//Fetch es una promesa
//Fetch es una función que recibe como parámetro una URL
//Fetch posee el GET por defecto

request = fetch('https://reqres.in/api/unknown/2');
request
    .then((res) => res.json())
    .then((res) => console.log(res))

//Metodos para el objeto fetch
//Devuelve una promesa con el contenido del body en 
//text() -> texto plano
//json() -> formato JSON
//blob() -> formato Blob
//arraybuffer() -> formato ArrayBuffer
//formdata() -> formato FormData

//Para enviar datos por POST
//Se debe enviar un objeto con la propiedad method: 'POST'

request2 = fetch('https://reqres.in/api/users', {
    method: 'POST',
    body: JSON.stringify({
        "name": 'Daniel',
        "job": 'Líder'
    }),
    headers: {
        'Content-Type': 'application/json'
    }
}).then((res) => res.json()).then((res) => console.log(res))

//Para el método blob()
const imagen = document.querySelector('.imagen');
fetch("xd.png") .then(res=>res.blob())
                .then(img=>{
                    imagen.src = URL.createObjectURL(img);
                    console.log(URL.createObjectURL(img));
                })

