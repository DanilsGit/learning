//Acceder a elementos hijos desde el elemento padre.

const contenedor = document.querySelector(".contenedor"); //Accedo al padre

/*
Aquí hay que tener en cuenta que es diferente esto:

<div>
    <h2>Hola</h2>
    <p>soy un párrafo</p>
</div>

que esto:

<div><h2>Hola</h2><p>soy un párrafo</p></div>

ya que en el primer ejemplo, lo primero que encuentra es texto (los espacios)
y en el segundo ejemplo, primero encuentra el h2, porque no hay espacios
*/

const primerHijo = contenedor.firstChild;
console.log(primerHijo); //devuelve #text por lo mencionado anteriormente
document.write(primerHijo); //Objeto texto

const ultimoHijo = contenedor.lastChild;
console.log(ultimoHijo); //también devuelve #text
document.write(ultimoHijo+"<br><br>"); //Objeto texto

//Aclarar que si el código estuviera pegado como en el segundo ejemplo de arriba
// el primer hijo sería h2, y el ultimo p

//Para no tener ese problema de espacios usamos ElementChild

const primerElementoHijo = contenedor.firstElementChild;
console.log(primerElementoHijo);//h2
document.write(primerElementoHijo+"<br>"); //Objeto HTML Heading


const ultimoElementoHijo = contenedor.lastElementChild;
console.log(ultimoElementoHijo); // p
document.write(ultimoElementoHijo); // Objeto HTML Paragraph

// childNodes devuelve todos los nodos hijos
const hijos = contenedor.childNodes;
console.log(hijos); //En consola se puede ver mejor todos los nodos que posee
//Lo que nos devuelve es una lista de nodos (NodeList)
console.log(hijos[1]);//h2
console.log(hijos.length); //cantidad de nodos

//Un NodeList no posee los métodos de array (aunque se puede recorrer con un for each)
//sin embargo, podemos acceder a los elementos con corchetes []

// children devuelve solamente los nodos elementos.
// En otras palabras, una colección HTML
const hijosElementos = contenedor.children; 
console.log(hijosElementos); 

//Ahora ni siquiera podemos recorrer la colección HTML con for each.
//Podríamos usar for in y of

for (hijo of hijosElementos) {
    console.log(hijo);
}

