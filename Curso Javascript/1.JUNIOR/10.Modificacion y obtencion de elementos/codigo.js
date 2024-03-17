// PROPIEDADES DE ELEMENTOS PARA CREAR, MODIFICAR Y OBTENER

const titulo = document.querySelector(".titulo");

//textContent, devuelve el contenido del texto. sin incluir el HTML
let resultado = titulo.textContent;
document.write("textContent: "+resultado+"<br>");

//innerText, devuelve unicamente el texto visible de un node element.
//Aunque ya no se usa porque solo se hizo para internet explorer XD
resultado = titulo.innerText;
document.write("innerText: "+resultado+"<br>");

//innerHTML, devuelve el texto junto con el HTML que tenga
//El navegador interpretará el HTML.
resultado = titulo.innerHTML;
document.write("innerHTML: "+resultado+"<br>");

//outerHTML, devuelve absolutamente todo el HTML
//El navegador interpretará el HTML.
let resultado2 = titulo.outerHTML;
document.write("outerHTML: "+resultado2+"<br>");

//Para verlo mejor los mostraremos en alert();
alert("innerHTML: "+resultado);
alert("outerHTML: "+resultado2);

