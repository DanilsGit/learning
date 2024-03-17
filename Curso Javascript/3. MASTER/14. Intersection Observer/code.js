"use strict";

const cajas = document.querySelectorAll(".caja");

const verificarVisibilidad = (entries) => {
    for (const entry of entries){
        if(entry.isIntersecting){
            entry.target.textContent = "Visible";
        }else{
            entry.target.textContent = "Invisible";
        }
    }
};

const opciones = {
    //root -> elemento que se toma como referencia para calcular la intersección
    //rootMargin -> margen que se le agrega al root ej. "10px 20px 30px 40px" (top, right, bottom, left)
    //threshold -> porcentaje de intersección que debe tener el elemento para que se dispare el callback
    // ej. 0.5 -> 50% de intersección
};

const observer = new IntersectionObserver(verificarVisibilidad);


for (const caja of cajas) {
    observer.observe(caja);
}


