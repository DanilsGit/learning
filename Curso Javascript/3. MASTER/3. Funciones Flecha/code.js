//funcion flecha

const saludar = () => {
    console.log("Hola mundo");
}

saludar();

//Si hay solo una expresión se puede omitir las llaves y el return
//retorna el valor de la expresión
const nombre = () => cadena = "Juan";
console.log(nombre());

//Con funciones tradicionales
const nombre2 = function(){
    return cadena = "Juan2";
}
console.log(nombre2());

//Si hay solo un parámetro se pueden omitir los paréntesis
const cuadrado = n => n * n;
console.log(cuadrado(5));

//No son recomendadas para funcionar como método de un objeto
const persona = {
    nombre: "Juan",
    apellido: "Perez",
    edad: 25,
    saludar: () => console.log(`hola ${this.nombre}`)
}
window.nombre = "Daniel"; //window es el objeto global
persona.saludar();
//this no funciona en funciones flecha porque no tiene contexto de ejecución
//this se refiere al objeto global
console.log(this);

//En funciones tradicionales this se refiere al objeto que la contiene

//Funciones flecha no pueden ser usadas como constructoras
//No se puede usar new
const constructorFlecha = (nombre, apellido) => {
    this.nombre = nombre;
    this.apellido = apellido;
}
const persona2 = new constructorFlecha("Juan","Perez"); //Error
console.log(persona2); 


//Con funciones tradicionales
function constructorPersona(nombre,apellido){
    this.nombre = nombre;
    this.apellido = apellido;
}
const persona1 = new constructorPersona("Juan","Perez");
console.log(persona1);

