//Eventos de mouse

const div = document.querySelector(".contenedor");
const btn = document.querySelector(".btn");

//click
btn.addEventListener("click",()=>{
    //console.log("click");
});

//dblclick
btn.addEventListener("dblclick",()=>{
    //console.log("doble click");
});

//mouseover, se activa en diversas situaciones:
//Cuando entro al elemento que posee el evento
//Cuando entro al elemento hijo
//Cuando salgo del elemento hijo
//Cuando entro al elemento hijo del hijo

//etc, no se activa cuando cuando no entro ni salgo de los elementos.
//NO se activa cuando salgo del elemento que posee el evento
div.addEventListener("mouseover",()=>{
    //console.log("mouseover");
});

//mouseout, se activa cuando:
//Salgo del elemento que posee el evento
//Entro a un elemento hijo
//Salgo de un elemento hijo
//Entro o salgo del elemento hijo del hijo, etc
div.addEventListener("mouseout",()=>{
    //console.log("mouseout");
});

//contextmenu, se activa al oprimir click derecho
//se puede activar en los hijos del elemento.
div.addEventListener("contextmenu",()=>{
    //console.log("contextmenu");
});

//mouseenter, se activa cuando se entra al elemento con el evento
div.addEventListener("mouseenter",()=>{
    //console.log("mouseenter");
});

//mousemove, se activa cada que el puntero se mueve un pixel
//dentro del elemento (por consecuencia, sobre los hijos)
div.addEventListener("mousemove",()=>{
    //console.log("mousemove");
});

//mouseleave, se activa cuando se sale del elemento con el evento
div.addEventListener("mouseleave",()=>{
    //console.log("mouseleave");
});

//mousedown, se activa apretando el click
//el evento no espera a que sueltes el click, se ejecuta antes
//Funciona en hijos
//PD. cuando lo sueltas no se ejecuta de nuevo.
div.addEventListener("mousedown",()=>{
    //console.log("mousedown");
});

//mouseup, se activa cuando se suelta el click
//Funciona en hijos
div.addEventListener("mouseup",()=>{
    console.log("mouseup");
});

