// PROPIEDADES DE ELEMENTOS PARA CREAR ELEMENTOS [ver fotos de apoyo]

const contenedor = document.querySelector(".contenedor");

//LI, es un elemento que existe en JS, el cual debe ser escrito
//En mayúsculas por el Case Sensitive
const item = document.createElement("LI");

//Se logra apreciar en consola (Google Chrome)
console.log(item);

//Ahora, podemos almacenar un nodo dentro del elemento.
// (También se pueden almacenar nodos dentro de nodos)
const textoDelItem = document.createTextNode("Este es un item de la lista");
console.log(textoDelItem);

item.innerHTML = textoDelItem;

//De esta forma estamos almacenando el objeto dentro de 'item'
//Pero no estamos almacenando el texto.
//<li>[object Text]</li>

// Debemos usar métodos child (hijos)
// los child son elementos que están dentro de otros elementos

item.appendChild(textoDelItem); //texto agregado al item

contenedor.appendChild(item); //item agregado al contenedor

//En el navegador, podemos ver como ahora en el div, hay un li con  un texto

//O tan simple como lo siguiente:
const item2 = document.createElement("LI");
item2.textContent = "Soy el item2 de la lista"; //Esto no es un objeto, entonces no tiene las propiedades que tendría TextNode
//Para conservar el objeto, se puede seguir  usando appendChild()
contenedor.appendChild(item2);

//Para agregar varios nodos nos sirve el fragment
const fragmento = document.createDocumentFragment();

for (let index = 0; index < 20; index++) {
    let item = document.createElement("LI"); //item temporal
    item.textContent = `Este es el item ${index+1} de la lista`;
    fragmento.appendChild(item);
}
// El fragmento ya posee todos los item que son LI, ahora solo falta agregarlo al DOM
console.log(fragmento); //Aquí se puede ver en consola
//Lo agregamos al contenedor
const contenedorVariosLI = document.querySelector(".contenedorVariosLI");
contenedorVariosLI.appendChild(fragmento);

///////////// OBTENCIÓN Y MODIFICACIÓN DE CHILDS /////////////




