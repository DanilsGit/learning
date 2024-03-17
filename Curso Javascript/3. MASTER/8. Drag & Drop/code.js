//Drag & drop

//Api de arrastrar y soltar

//Eventos
//drag
//dragend
//dragenter
//dragleave
//dragover
//dragstart
//drop

//Objeto
const circulo = document.querySelector('.circulo');
circulo.addEventListener("dragstart", (e) => {
    e.dataTransfer.setData("clase", e.target.className);
});
circulo.addEventListener("drag", (e) => {

});
circulo.addEventListener("dragend", (e) => {

});

//objeto dataTransfer
// es un objeto que se usa para compartir datos entre eventos

//Objeto a soltar
const cuadrado = document.querySelector('.cuadrado');
cuadrado.addEventListener("dragenter", (e) => {
    console.log(4);
});
cuadrado.addEventListener("dragover", (e) => {
    e.preventDefault();
    console.log(5);
});
cuadrado.addEventListener("drop", (e) => {
    console.log(e.dataTransfer.getData("clase"));
    console.log(6);
});
cuadrado.addEventListener("dragleave", (e) => {
    console.log(7);
});

