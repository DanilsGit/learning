"use strict";

const zona = document.querySelector(".zona");


const cambiarEstilo = (elemento, color) => {
    elemento.style.color = `#${color}`;
    elemento.style.border = `4px dashed #${color}`;
};

zona.addEventListener("dragover", (e) => {
    e.preventDefault();
    cambiarEstilo(e.target,"222");
});

zona.addEventListener("dragleave", (e) => {
    cambiarEstilo(e.target,"888");
});

zona.addEventListener("drop", (e) => {
    e.preventDefault();
    let formato = e.dataTransfer.files[0].type;
    console.log(formato);
    if (formato === "text/plain") cargarTXT(e.dataTransfer.files[0]);
    if (formato === "image/png") cargarIMG(e.dataTransfer.files[0]);
    if (formato === "video/mp4") cargarVideo(e.dataTransfer.files[0]);
});

const cargarTXT = arr => {
    const reader = new FileReader();
    reader.readAsText(arr);
    reader.addEventListener("load", e => {
        let contenido = e.currentTarget.result;
        contenido = contenido.replace(/\n/g, "<br>");
        document.querySelector(".resultado").innerHTML = contenido;
        zona.textContent = "Archivo cargado";
    });
};

const cargarIMG = arr => {
    const reader = new FileReader();
    reader.readAsDataURL(arr);
    reader.addEventListener("load", e => {
        let url = URL.createObjectURL(arr);
        let img = document.createElement("img");
        img.setAttribute("src", url);
        document.querySelector(".resultado").appendChild(img);
        zona.textContent = "Archivo cargado";
    });
};

const actualizarBarra = porcentaje => {
    zona.textContent = `Cargando ${porcentaje}%`;
    document.querySelector(".barra").style.width = `${porcentaje}%`;
    if (porcentaje === 100) zona.textContent = "Archivo cargado";
};

const cargarVideo = arr => {
    const reader = new FileReader();
    reader.readAsArrayBuffer(arr);
    reader.addEventListener("load", e => {
        let video = new Blob([new Uint8Array(e.currentTarget.result)], {type: "video/mp4"});
        let url = URL.createObjectURL(video);
        let vid = document.createElement("video");
        vid.setAttribute("src", url);
        vid.setAttribute("controls", true);
        document.querySelector(".resultado").appendChild(vid);
    });
    reader.addEventListener("progress", e => {
        let porcentaje = parseInt((e.loaded * 100) / e.total);
        actualizarBarra(porcentaje);
    });
};