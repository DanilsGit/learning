"use strict";

console.log(history);

//Métodos
//back() - Regresa a la página anterior
//forward() - Avanza a la página siguiente
//go(n|-n) - Avanza o retrocede n páginas en el historial
//length - Devuelve el número de páginas en el historial
//pushState() - Añade una nueva página al historial
//replaceState() - Reemplaza la página actual en el historial

console.log(location.href);
console.log(history.state);
// history.pushState({ id: "1" }, "Titulo 1", "?pagina1");
addEventListener("popstate", (e) => {
    console.log(e.state);
});
