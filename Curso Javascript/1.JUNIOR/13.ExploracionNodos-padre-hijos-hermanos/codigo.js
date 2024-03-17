//METODOS PARA HIJOS, PADRES Y HERMANOS
//VER IMAGEN DE APOYO

const contenedor = document.querySelector(".contenedor");

const parrafo = document.createElement("P");
const h2 = document.createElement("H2");

parrafo.textContent = "parrafo creado en JS";
h2.textContent = "Soy el titulo nuevo";

const h2_antiguo = document.querySelector(".h2");

// replaceChild, reemplaza dos elementos
// los parámetros son: El nuevo y el antiguo
contenedor.replaceChild(h2,h2_antiguo);

// removeChild, elimina un elemento.
const li = document.querySelector(".li");
contenedor.removeChild(li);

// hasChildNodes, verifica si tiene elementos hijos o no.
const contenedor2 = document.querySelector(".contenedor2");
let respuesta = contenedor2.hasChildNodes();
//Devuelve true, porque recordemos que tiene el nodo de texto
//Por la separación de etiquetas.
if(respuesta){
    document.write(`El contenedor2 tiene al menos un hijo, 
    puede ser el nodo #texto que separa las etiquetas <br>`);
}else{
    document.write(`El elemento no tiene hijos <br>`);
}
//Los elementos como h1,h2,p,li, etc
// tendrán hijos si tienen texto por dentro.
// ej: <h2></h2> = no tiene hijos
// ej: <h2>soy titulo</h2> = si tiene un NodeChild, tiene un textNode

/*
PROPIEDADES de los padres.

parentElement: Selecciona el padre elemento de un elemento.
parentNode: Selecciona el padre de un elemento.

Hay casos específicos en donde el padre no es un elemento
como lo podría ser un div, sino que es otra cosa. Ahí se usaría
el parentNode, de resto, es más común el parentElement.
*/

const padre = h2.parentElement;
document.write(`<br><br>Elemento padre del h2: ${padre}`);
console.log(padre);


//PROPIEDADES DE LOS HERMANOS
// Son los nodos que están a los lados, es decir, en el mismo rango

// nextSibling, el nodo hermano que le sigue
const nodoSiguienteH2 =  h2.nextSibling;

// lastSibling, el último nodo hermano que tiene.
const previoNodoH2 = h2.previousSibling;

document.write(`<br><br><br>Nodo hermano siguiente del h2: ${nodoSiguienteH2}`);
document.write(`<br><br>Nodo hermano previo del h2: ${previoNodoH2}`);

//En ambos casos nos dice que es  un texto
//pues hay un espacio, entre las etiquetas
// <h2>  [este espacio cuenta como un nodo #text]  <hermano>
// <h2>  [este espacio cuenta como un nodo #text]  <hermano>

//Si queremos solamente centrarnos en los elementos usamos:

const elementoSiguienteH2 = h2.nextElementSibling;
document.write(`<br><br>Elemento hermano siguiente del h2: ${elementoSiguienteH2}`);

const elementoPrevioH2 = h2.previousElementSibling;
document.write(`<br><br>Elemento hermano previo del h2: ${elementoPrevioH2}`);
// null, porque h2 ya está en lo más alto
//pero probemos con el h4 que está debajo del párrafo

const h4 = document.querySelector(".h4");
const elementoPrevioH4 = h4.previousElementSibling;
document.write(`<br><br>Elemento hermano previo del h4: ${elementoPrevioH4}`);
// jejeje, el hermano previo, efectivamente es el párrafo.
// Y el siguiente? Si es el último, puede que sea null
const elementoSiguienteH4 = h4.nextElementSibling;
document.write(`<br><br>Elemento hermano siguiente del h4: ${elementoSiguienteH4}`);
//efectivamente jiji

// closest() nos SELECCIONA el elemento padre más cercano
// que tenga la clase que le solicitemos

const div = document.querySelector(".div3");
const divPadreCercano = div.closest(".div");
console.log(divPadreCercano);  
