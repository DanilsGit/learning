
//Los arrays en JS tienen métodos como:

//----------------------------------------------------------------TRANSFORMACIONES----------------------------------------------------------------:

/* RESUMEN

Transformadores
- pop() elimina el último elemento de un array y lo devuelve.
- push() agrega un elemento al array al final de la lista.
- shift() elimina el primer elemento de un array y lo devuelve.
- unshift() agrega uno o más elementos al inicio del array, y devuelve la nueva longitud del array.
- reverse() invierte el orden de los elementos de un array.
- sort() ordena los elementos de un array alfabéticamente o numéricamente.
- splice() cambia el contenido de un array eliminando elementos existentes y/o agregando nuevos elementos.

*/

//Estos métodos transforman el array original:

let nombres = ["Pedro","Maria","Jorge","Daniel"];


console.log(" ");

console.log("Eliminado: "+nombres.pop()); //Elimina el ultimo elemento del array y retorna el eliminado 
console.log(nombres);
console.log("Eliminado: "+nombres.shift()); //Elimina el primer elemento del array y retorna el eliminado
console.log(nombres);
//Ahora el array solo tiene a maria y jorge porque se ha eliminado el ultimo y el primero.
//Los metodos que eliminan elementos, los retorna, así que es posible conservarlos en una variable.

console.log("N°Elementos después de agregar: "+nombres.push("Joan")); //Agrega elementos al final del array y devuelve la longitud del array después del cambio.
console.log(nombres);

console.log(nombres.reverse()); //Invierte el orden del array.

console.log("N°Elementos después de agregar: "+nombres.unshift("Dalto","Juanma","Ares")); //Agrega elementos al inicio del array y devuelve la longitud del array después del cambio.
console.log(nombres);

console.log("Array ordenado: "+nombres.sort()); //Ordena alfabéticamente el array, o de menor a mayor si es un array numérico
console.log(" ");
//splice(). Tiene varias formas de usarse dependiendo de los parámetros dados:

//splice(n,m): a partir de la posición n del array, elimina la cantidad m de elementos.
console.log("Se han eliminado los elementos: "+nombres.splice(1,2)); //Retorna un array de los que eliminó.
console.log("El array ahora es: "+nombres);

console.log(" ");

//splice(n,m,Object []), A partir de la posición n elimina m elementos y agrega a partir de n los datos puestos.
console.log("Se han eliminado los elementos: "+nombres.splice(1,1,"Eren","prueba2","prueba3","prueba4")); //Retorna un array de los que eliminó.
console.log("El array ahora es: "+nombres);

console.log(" ");

//Para agregarlos al inicio solo basta con pa posición 0 y cambiando 0 datos.
console.log("Se han eliminado los elementos: "+nombres.splice(0,0,"gato","loro")); //Retorna un array de los que eliminó. (En este caso ninguno)
console.log("El array ahora es: "+nombres);
console.log(" ");

//Para agregarlos al final, se puede usar la propiedad .length, también es posible con -1, pero los colocaría en el penúltimo lugar.
console.log("Se han eliminado los elementos: "+nombres.splice(nombres.length,0,"portátil","consola","escritorio")); //Retorna un array de los que eliminó. (En este caso ninguno)
console.log("El array ahora es: "+nombres);


//----------------------------------------------------------------ACCESORES----------------------------------------------------------------:

/* RESUMEN

Accesores

- join() - une todos los elementos de una matriz (u objeto similar) en una cadena y la retorna.
- slice() - devuelve una parte del array dentro de un nuevo array empezando por inicio hasta fin (fin no incluido).
- Metodos ya vistos en cadenas: toString(), indexOf()), lastIndexOf(), includes()

- indexOf(); Retorna la posición donde esté el elemento, si no lo encuentra, retorna -1. Si está repetido, devuelve la posición del primero que encontró
- includes(); Revisa si se encuentra un elemento en el array, retorna true/false
- lastIndexOf(); Retorna la posición donde esté el elemento, si no lo encuentra, retorna -1. Si está repetido, devuelve la posición del último que encontró

*/

//Estos métodos no modifican el array original, sino que nos devuelve un nuevo array.

console.log(" ");

let array = ["árbol","boro","cloro","diente","etanol","fósforo","galio","helio"];

console.log(array+"");

let nuevoArray = array.join("<br> "); //Retorna el array en un String, separado como nos gustaría

console.log(array[0]);
console.log(nuevoArray[0]); //En JS es posible acceder a los caracteres del string como si fuera un array.
console.log(nuevoArray); 

nuevoArray = array.slice(1,array.length); //Retorna un nuevo array con los elementos dentro del rango, sin contar el ultimo.
// Ejemplo, de 1 a 3, es 1 <= elementos < 3. Mayores e iguales a 1 y menores que 3. Es decir, los elementos en [1, 2]
console.log(nuevoArray);
console.log(array.length);


//----------------------------------------------------------------REPETICIÓN----------------------------------------------------------------:

/* RESUMEN

Repetición


*/

//Estos métodos recorren el array y nos devuelven otro.

console.log(" ");

let array2 = ["pera","manzana","mango","uva","banano","mora","kiwi","melón","sandía"];

console.log("Array: "+array2);

array2.forEach(frutas => console.log(frutas+" ")); // Recorre el array en forma de un bucle
// Pasa automáticamente los índices del array como parámetros. de hecho otra forma es escribirlo es así:

console.log(" ");

array2.forEach( function(param) {
    console.log(param+"");
} );

//Ahora, filter() es parecido, retorna un array pero le podemos pasar condiciones.
//Como que nos retorne solamente los mayores de n letras

let resultado = array2.filter(param => param.length > 5);

console.log(resultado);
