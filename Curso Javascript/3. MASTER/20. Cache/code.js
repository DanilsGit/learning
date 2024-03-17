"use strict";

//Caché

caches.open('v1').then(cache => {
    console.log(cache);
    cache.add('./index.html');
})

caches.open('v1-2').then(cache => {
    console.log(cache);
    cache.addAll(["./index.html", "./style.css", "./code.js"]);
    cache.keys().then(console.log);

    cache.match('./index.html').then(res => {
        console.log(res);
    })
})




//metodos de cache
// add -> agrega una nueva respuesta a la cache
// addAll -> agrega un array de respuestas a la cache
// delete -> elimina una respuesta de la cache
// keys -> devuelve un array con las keys de la cache
// match -> devuelve una promesa con la respuesta que coincida con la key
// put -> agrega una respuesta a la cache
