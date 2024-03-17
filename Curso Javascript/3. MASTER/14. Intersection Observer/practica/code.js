"use strict";

const publicaciones = document.querySelector(".publicaciones");

const crearPublicaciones = (name,content) => {
    const container = document.createElement("div");
    container.classList.add("publicacion");
    const h3 = document.createElement("h3");
    h3.textContent = name;
    const p = document.createElement("p");
    p.textContent = content;
    const comentarios = document.createElement("div");
    comentarios.classList.add("comentarios");
    const input = document.createElement("input");
    input.type = "text";
    input.placeholder = "Comentar...";
    input.classList.add("comentario_text");
    const submit = document.createElement("input");
    submit.type = "submit";
    submit.value = "Enviar";
    submit.classList.add("enviar");
    submit.addEventListener("click", () => {input.value = ""; input.placeholder = "Comentario enviado";});
    comentarios.appendChild(input);
    comentarios.appendChild(submit);
    container.appendChild(h3);
    container.appendChild(p);
    container.appendChild(comentarios);
    return container;
};

let contador = 0;

const cargarMasPublicaciones = (entry) => {
    if (entry[0].isIntersecting) cargarPublicaciones(4);
};

const observer = new IntersectionObserver(cargarMasPublicaciones, {threshold: 0.5});

const crearFinal = (msg) => {
    const bloqueFinal = document.createElement("div");
    bloqueFinal.id = "noMore";
    bloqueFinal.classList.add("final");
    const h3 = document.createElement("h3");
    h3.textContent = msg;
    bloqueFinal.appendChild(h3);
    return bloqueFinal;
};

const cargarPublicaciones = async num => {
    const request = await fetch("./info.txt");
    const contenido = await request.json();
    const arr = contenido.content;
    const documentFragment = document.createDocumentFragment();
    for (let i=0; i<num; i++) {
        if (arr[contador] != undefined) {
            const publicacion = crearPublicaciones(arr[contador].nombre,arr[contador].contenido);
            documentFragment.appendChild(publicacion);
            contador++;
            if (i == num-1) observer.observe(publicacion);
        }else{
            if (publicaciones.lastElementChild.id !== "noMore") {
                let noMore = crearFinal("Estás al día. No hay más publicaciones. 😸");
                documentFragment.appendChild(noMore);
                publicaciones.appendChild(documentFragment);
                break;
            }
        }
    }
    publicaciones.appendChild(documentFragment);
};

cargarPublicaciones(4);
