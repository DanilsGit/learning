parrafo = document.getElementById("parrafo"); // Selecciona el elemento con id "parrafo"
document.write("By Id: "+parrafo);
document.write("<br><br>");

elemento = document.getElementsByTagName("p"); //Abre una lista de elementos <p>
document.write("ByTagName: "+elemento);
document.write("<br><br>");
document.write("ByTagName [0] : "+elemento[0]);
document.write("<br><br>");
document.write("ByTagName [1] : "+elemento[1]);
document.write("<br><br>");
document.write("ByTagName [2] : "+elemento[2]); //undefined porque solo hay dos <p> en el html
document.write("<br><br>");

selector = document.querySelector(".menu"); // Selector de una clase, se incluye el .
document.write("querySelector clase .menu : "+selector);
document.write("<br><br>");

selector = document.querySelector("#texto");
document.write("querySelector Id #texto : "+selector);
document.write("<br><br>");

selector = document.querySelectorAll(".inicio"); //Selector de todas las clases .inicio
document.write("querySelectorAll clase .inicio : "+selector);
document.write("<br><br>");
document.write("querySelectorAll clase .inicio [0]: "+selector[0]);
document.write("<br><br>");
document.write("querySelectorAll clase .inicio [1]: "+selector[1]);
document.write("<br><br>");
document.write("querySelectorAll clase .inicio [2]: "+selector[2]);
document.write("<br><br>");
document.write("querySelectorAll clase .inicio [3]: "+selector[3]);
document.write("<br><br>");
