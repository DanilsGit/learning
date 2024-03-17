//Eventos de la interfaz

const img = document.querySelector('.img-prueba');

//error, se activa cuando sucede errores durante la carga
// de archivos multimedia:
// - No se ha cargado la imagen
// - No se encuentra el directorio de la imagen
img.addEventListener('error',()=>{
    console.log("Ha sucedido un error inesperado");
});

//load, se activa cuando un objeto
//se ha cargado completamente
img.addEventListener('load',()=>{
    console.log("se ha cargado la imagen");
});
window.addEventListener('load',()=>{
    console.log("se ha cargado el sitio web");
});

//beforeunload, se activa cuando el sitio se está cerrando:
// - Cuando se recarga la página
// - Cuando se cierra la pestaña
// - Cuando se cambia la pestaña a otro link
window.addEventListener('beforeunload',()=>{
    console.log("Te vas a ir del sitio");
    alert("Saliendo...");
    //no se ejecutará, porque el navegador 
    //bloquea el alert cuando el sitio
    //está durante "beforeunload"
});

//unload, se activa cuando el sitio se ha cerrado "completamente"
window.addEventListener('unload',()=>{
    console.log("sitio cerrado");
});

//resize, se activa cuando se cambia la resolución del sitio
// - Cuando se estira o contrae la pantalla
window.addEventListener('resize',()=>{
    console.log("sitio cambiando de resolución");
});

//scroll, se activa cuando se desplaza la barra de un elemento.
// funciona también en div con barra de desplazamiento
window.addEventListener('scroll',()=>{
    console.log("se ha hecho scroll en la pantalla");
});
{
    for (let index = 0; index < 5; index++) {
        const body = document.querySelector(".body");
        const p = document.createElement("P");
        p.textContent = `Lorem ipsum dolor sit amet consectetur adipisicing elit. Corporis adipisci, qui eligendi officiis recusandae veniam possimus cumque ad. Hic, quas quia eius corrupti inventore eum sunt accusamus id totam consequatur!`;
        body.appendChild(p);
        
    }
}

//select, cuando se selecciona el texto de un input o textarea

//con el objeto "evento" se pueden retornar varias propiedades:
//e.target.value = texto completo del input/textarea
//e.target.selectionStart = índice del comienzo de la selección
//e.target.selectionEnd = índice del final de la selección + 1


const input = document.querySelector(".input");
const textarea = document.querySelector(".txtarea");
input.addEventListener('select',(e)=>{
    console.log("se ha seleccionado el texto del input");
    console.log(`Se ha seleccionado del índice
    ${e.target.selectionStart} al ${e.target.selectionEnd}`);

    //Para mostrar la parte que seleccionó:
    let textoCompleto = e.target.value;
    let inicio = e.target.selectionStart;
    let final = e.target.selectionEnd;
    let textoSeleccionado = textoCompleto.substring(inicio,final);
    console.log(`Texto seleccionado ${textoSeleccionado}`);
});

textarea.addEventListener('select',()=>{
    console.log("se ha seleccionado el textarea");
});


