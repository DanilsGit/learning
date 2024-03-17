//EVENTOS TECLADO

const input = document.querySelector(".inputPrueba");
const contenedor = document.querySelector(".contenedor-1");

//keydown, se activa cuando una tecla está presionada,
// si se deja presionada se activa repetidamente
input.addEventListener("keydown",()=>{
    console.log("keydown");
});

//keypress, se activa cuando una tecla se presiona,
// se activa primero el keydown y después el keypress
// si se deja presionada se activaría intercaladamente
// keydown, keypress, keydown, keypress, etc...
input.addEventListener("keypress",()=>{
    console.log("keypress");
});


//keyup, se activa cuando se suelta una tecla
// si se deja presionada, no se activará hasta soltarla
input.addEventListener("keyup",()=>{
    console.log("keyup");
});





