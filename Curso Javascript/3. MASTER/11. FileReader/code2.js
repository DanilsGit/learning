//readAsDataURL
"use strict";

//FileReader
const archivo = document.getElementById('archivo');
const cajaImagenes = document.getElementById('resultado');

const leerArchivo = (archivo) =>{
    for (let i = 0; i < archivo.length; i++) {
        const archivoActual = archivo[i];
        console.log(archivoActual);
        const reader = new FileReader();
        reader.addEventListener('load', (e)=>{
            let newIMG = `<img src="${e.currentTarget.result}" style="width: 800px; background-size: cover;">`;
            cajaImagenes.innerHTML += newIMG;
        });
        reader.readAsDataURL(archivoActual);
    }
};

// const leerArchivo2 = (archivo) =>{
//     let fragmento = document.createDocumentFragment();
//     let img = document.createElement('img');
//     img.setAttribute('src', `./imagenes/${archivo[0].name}`);
//     img.setAttribute('style', 'width: 800px; background-size: cover;');
//     fragmento.appendChild(img);
//     cajaImagenes.appendChild(fragmento);
// };

archivo.addEventListener('change', (e)=>{
    leerArchivo(e.target.files);
});


