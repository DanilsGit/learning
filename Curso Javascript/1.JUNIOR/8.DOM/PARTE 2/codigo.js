//////////////////////////////// ATRIBUTOS GLOBALES //////////////////////////////////


let titulo = document.querySelector(".titulo");

//Aquí probaré y explicaré los atributos globales
//Un atributo global es un atributo que todo elemento HTML posee
// [ver foto adjunta]

//contentEditable para indicar si puedo editar el contenido
titulo.setAttribute("contentEditable", "true");
//Es raro ver un titulo que se pueda editar, pero aquí está, es posible ahora

//dir, ltr (derecha a izquierda) y rtl
titulo = document.querySelector(".titulo2");
titulo.setAttribute("dir","rtl");

//hidden, oculta el contenido no importa qué valor tenga 
//y lo muestra de nuevo cuando se elimina el atributo
titulo = document.querySelector(".titulo3");
titulo.setAttribute("hidden","");
titulo.removeAttribute("hidden"); 

//tabindex, indica si puede obtener focus de input
// 0 = focusable
// -1 = focusable solo por JS
// >0 = mayores a cero, será el orden en el que serán focusables 
titulo = document.querySelector(".titulo4");
titulo.setAttribute("tabindex","1");

titulo = document.querySelector(".titulo5");
titulo.setAttribute("tabindex","2");

titulo = document.querySelector(".titulo6");
titulo.setAttribute("tabindex","3");

titulo = document.querySelector(".titulo7");
titulo.setAttribute("tabindex","4");

//title, informacion cuando el mouse pasa por encima
titulo = document.querySelector(".titulo8");
titulo.setAttribute("title","jajaja soy un titulo");

titulo = document.querySelector(".titulo3");
titulo.setAttribute("tabIndex","0");


