//OBJETO WINDOW

//Hereda las propiedades de EventTarget

//método open(), abre una ventana nueva
let ventana = window.open("https://www.youtube.com");

//método close(), cierra una ventana
ventana.close();

//propiedad closed,indica si la ventana está cerrada
//true: cerrada
//false: abierta
if (ventana.closed) {
    document.write("La ventana está cerrada ");
}else {
    document.write("La ventana está abierta ");
}

//método stop(), detiene la carga de una ventana
window.stop();
//Sin efectos en este caso, la ventana no tiene mucho para cargar.

//método alert(), muestra un mensaje en pantalla.
window.alert("Método alert");

//método print(), envía la ventana a imprimir
window.print();

//método prompt(), solicita un dato String al usuario
let dato = prompt("Dame un dato");
console.log(dato);

//método confirm(), ventana emergente que devuelve
//true si aceptamos
//false si cancelamos
let confirmacion = window.confirm("¿Desea descartar los cambios hechos?");
console.log(confirmacion);


