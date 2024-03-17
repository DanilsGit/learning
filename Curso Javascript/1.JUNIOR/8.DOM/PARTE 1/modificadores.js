const rangoEtario = document.querySelector(".inputRango");
document.write("<br><br>");
document.write(rangoEtario);
rangoEtario.setAttribute("type","text"); //(parámetro,nuevo valor)

const rangoEtario2 = document.querySelector(".inputRango2");
rangoEtario2.setAttribute("type","range");

//otra forma de hacerlo sin variables
document.querySelector(".inputColor").setAttribute("type","color");

//Obtener el atributo
let valorAtributo1 = rangoEtario.getAttribute("type");
let valorAtributo2 = rangoEtario2.getAttribute("type");
let valorAtributo3 = document.querySelector(".inputColor").getAttribute("type");

document.write(`<br><br> Obtener el atributo type del primero: ${valorAtributo1}`);
document.write(`<br><br> Obtener el atributo type del segundo: ${valorAtributo2}`);
document.write(`<br><br> Obtener el atributo type del tercero: ${valorAtributo3}`);

document.write(`<br><br>Eliminado el atributo type del tercero*: <br>`);
document.querySelector(".inputColor").removeAttribute("type");
valorAtributo3 = document.querySelector(".inputColor").getAttribute("type");
document.write(`<br>Obtener el atributo type del tercero: ${valorAtributo3}, ahora no tiene el atributo type`);






