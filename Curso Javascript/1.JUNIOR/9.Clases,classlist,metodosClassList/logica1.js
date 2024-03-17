const titulo = document.querySelector(".titulo");

titulo.classList.add("texto"); //Añade clases
titulo.classList.remove("texto"); //Eliminar clases
//classList.item me dice las clases presentes.
document.write(`Clases asociadas: <b style="color:purple"> <br>`);
document.write(titulo.classList.item(0) + "<br>");
document.write(titulo.classList.item(1) + "<br>");
document.write(titulo.classList.item(2) + "<br>");
document.write(titulo.classList.item(3) + "<br>");
document.write(`</b><br>`);

//classList.contains verifica si posee la clase
document.write(`El titulo contiene la clase "principal"? ${titulo.classList.contains("principal")} <br>`);
document.write(`El titulo contiene la clase "entrada"? ${titulo.classList.contains("entrada")} <br>`);
document.write(`El titulo contiene la clase "colorido"? ${titulo.classList.contains("colorido")} <br>`);

//classList.toggle, si tiene la clase la elimina, si no la tiene, la agrega
//Además nos retorna booleanos:
// true si agregó la clase
// false si eliminó la clase
titulo.classList.toggle("texto"); //Agregó
titulo.classList.toggle("titulo"); //Sacó
//Es posible agregarle un segundo parámetro
//true, no elimina la clase en caso de que exista
//false, elimina siempre la clase y no agrega ninguna
titulo.classList.toggle("principal",true); //No la saca, a pesar de que exista
titulo.classList.toggle("xdxdxd",false); //No la agrega, a pesar de que no existe

//replace, reemplaza una clase por otra.
//Devuelve true si la reemplazó
//Devuelve false si no existe la clase que vamos a reemplazar.
titulo.classList.replace("entrada","nuevaclase");



