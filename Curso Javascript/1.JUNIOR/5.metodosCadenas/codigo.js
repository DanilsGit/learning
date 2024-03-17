
//Las cadenas en JS son objetos los cuales tienen métodos como:

//----------------------------------------------------------------BUSCAR:

let cadena = "Hola mundo, cadena de prueba prueba prueba";


console.log(" ");

console.log(cadena.concat(" jejeje")); // Concatena ' jejeje'

console.log("Inicia con Hola : "+cadena.startsWith("Hola")); //true

console.log("Termina con prueba : "+cadena.endsWith("prueba")); //true

console.log("Incluye 'mundo' : "+cadena.includes("mundo")); //true

// Retorna si no los encuentra -1 :

console.log(cadena.indexOf("prueba")); //indice inicial donde comienza la primera cadena 'prueba'
//sin importar si hay otros caracteres al rededor

console.log(cadena.lastIndexOf("prueba")); //15, devuelve el indice inicial donde comienza 'prueba', 
//pero en el ultimo resultado que encuentra


//----------------------------------------------------------------MODIFICAR:

let cadena2 = "hola chavos";


console.log(" ");

console.log(cadena2.padStart(20,"no")); //Rellena la parte inicial de la cadena hasta el length 
//deseado con la cadena que le proporcionemos. Si no cabe la cadena, pondrá los caracteres que quepan

console.log(cadena2.padEnd(20,"no")); //Rellena la parte final de la cadena hasta el length
//deseado con la cadena que le proporcionemos. Si no cabe la cadena, pondrá los caracteres que quepan

console.log(cadena2.repeat(3)); //Repite la cadena las veces que deseemos.

console.log(cadena2.replace("hola","mundo")); //Reemplazan una cadena del objeto (frase) por otra.

//----------------------------------------------------------------MODIFICACIONES DE CADENAS+:

let cadena3 = "Aprendiendo Javascript Con Cadenas";


console.log(" ");

cadenaArray = cadena3.split(" "); //Convierte la cadena en un array, dividida como la necesitemos
console.log(cadenaArray[0]);
console.log(cadenaArray[1]);
console.log(cadenaArray[2]);
console.log(cadenaArray[3]);
console.log(cadenaArray);

// split(" ") quedaría [aprendiendo][javascript][con][cadenas]
// split(",") quedaría [aprendiendo javascript con cadenas] ya que no encuentra mas comas para dividir
// Interesante split("") convierte la cadena en un array de caracteres.
console.log(cadena3.split(""));

console.log(cadena3.substring(12, 22)); //De donde a donde quiero la nueva cadena
//(el ultimo caracter no lo cuenta, tener en cuenta para sumarle 1 si se desea toda la cadena)

console.log(cadena3.toLowerCase()); //Toda la cadena pasa a ser minúsculas

console.log(cadena3.toUpperCase()); //Toda la cadena pasa a ser mayúsculas

console.log(cadena3.toString()); //Convierte a cadena de texto, evidentemente tiene mas lógica para números.

numero = 333;
console.log(numero + 555);
console.log(numero.toString() + 555);

let cadena4 = "    tengo espacios      ";

console.log("Cadena: "+cadena4);

console.log("Espacios eliminados: "+cadena4.trim()); //Elimina todos los espacios en blanco al inicio y final de la cadena

console.log("Espacios eliminados al inicio: "+cadena4.trimStart()); //Elimina todos los espacios en blanco al inicio de la cadena

console.log("Espacios eliminados al final: "+cadena4.trimEnd()); //Elimina todos los espacios en blanco al final de la cadena