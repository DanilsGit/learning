//LocalStorage and SessionStorage

//LocalStorage
// //setItem
// localStorage.setItem("nombre", "Juan");
// console.log(localStorage);
// //getItem
// const nombre = localStorage.getItem("nombre");
// console.log(nombre);
// //removeItem
// localStorage.removeItem("nombre");
// console.log(localStorage);
// //clear
// localStorage.clear();
// console.log(localStorage);

// //SessionStorage
// //setItem
// sessionStorage.setItem("nombre", "Daniel");
// console.log(sessionStorage);
// //getItem
// const nombre2 = sessionStorage.getItem("nombre");
// console.log(nombre2);
// //removeItem
// sessionStorage.removeItem("nombre");
// console.log(sessionStorage);
// //clear
// sessionStorage.clear();

// localStorage.clear();

//Ejemplo de uso. Idioma de la página

const definirIdioma = () => {
    document.querySelector(".btn_es").addEventListener("click", () => {
        localStorage.setItem("idioma", "es");
        desaparecer()
    });
    document.querySelector(".btn_en").addEventListener("click", () => {
        localStorage.setItem("idioma", "en");
        desaparecer();
    });
    document.querySelector(".btn_fr").addEventListener("click", () => {
        localStorage.setItem("idioma", "fr");
        desaparecer();
    });
}

const iniciarWeb = () => {
    let idioma = localStorage.getItem("idioma");
    (idioma == "es") ? mostrarEs(): (idioma == "en") ? mostrarEn(): mostrarFr();
}

const desaparecer = () => {
    const pregunta = document.querySelector(".container_pregunta");
    pregunta.style.animation = "desaparecer 1s forwards";
    setTimeout(() => {
        pregunta.style.display = "none"
        iniciarWeb();
    }, 1000);
}

const cerrarPregunta = () => {
    document.querySelector(".container_pregunta").style.display = "none";
}
const mostrarEs = () => {
    document.querySelector(".container_es").style.display = "block";
}
const mostrarEn = () => {
    document.querySelector(".container_en").style.display = "block";
}
const mostrarFr = () => {
    document.querySelector(".container_fr").style.display = "block";
}

if (localStorage.getItem("idioma") === null){
    definirIdioma();
} else {
    cerrarPregunta();
    iniciarWeb();
}
