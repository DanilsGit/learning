"use strict";
const cajaTexturas = document.querySelector(".texturas_container");
const cajaAnimales = document.querySelector(".animales_container");
const zona = document.querySelector(".zona");
const zonaAnimales = document.querySelector(".animales");

let texturaTransferida = "";

zona.addEventListener("dragover",(e)=>{
    if (texturaTransferida.substring(0,5) == "campo") e.preventDefault();
});

zona.addEventListener("drop",(e)=>{
    let img = e.dataTransfer.getData("textura");
    if (texturaTransferida.substring(0,5) == "campo"){
        zona.style.backgroundImage = `url('./imagenes/${img}')`;
        zona.style.backgroundSize = "cover";
    }
    
});

for(let i=0;i<cajaTexturas.children.length ;i++){
    cajaTexturas.children[i].addEventListener("dragstart",(e)=>{
        cambiarTextura(e,`campo${i+1}.png`);
    })
}
for(let i=0;i<cajaAnimales.children.length ;i++){
    cajaAnimales.children[i].addEventListener("dragstart",(e)=>{
        cambiarTextura(e,`A${i+1}.png`);
    })
}

const cambiarTextura = (e,textura)=>{
    console.log(textura);
    e.dataTransfer.setData(`textura`,textura);
    texturaTransferida = e.dataTransfer.getData("textura");
}

zonaAnimales.addEventListener("dragover",(e)=>{
    if (texturaTransferida.substring(0,1) == "A") e.preventDefault();
});

zonaAnimales.addEventListener("drop",(e)=>{
    let img = e.dataTransfer.getData("textura");
    if (img.substring(0,1) == "A"){
        zonaAnimales.style.backgroundImage = `url('./imagenes/${img}')`;
        zonaAnimales.style.backgroundSize = "contain";
    }
});