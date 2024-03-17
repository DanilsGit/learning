/*

METODOS
- sqrt() Devuelve la raíz cuadrada positiva de un número.
- cbrt() Devuelve la raíz cúbica de un número.
- max() Devuelve el mayor de cero o más números.
- min() Devuelve el más pequeño de cero o más números.
- random() Devuelve un número pseudo-aleatorio entre 0 y 1.
- round() Devuelve el valor de un número redondeado al número entero más cercano.
- fround() Devuelve la representación flotante de precisión simple más cercana de un número.
- floor() Devuelve el mayor entero menor que o igual a un número.
- trunc() Devuelve la parte entera del número x. la eliminación de 1os dígitos fraccionarios.

*/

document.write(`Raíz cuadrada de 25: <b>${Math.sqrt(25)}</b><br>`);
document.write(`Raíz cúbica de 27: <b>${Math.cbrt(27)}</b><br>`);
document.write(`El mayor número entre 31, 2, 10, 24, 1, 30 es: <b>${Math.max(31,2,10,24,1,25,30)}</b><br>`);
document.write(`El menor número entre 31, 2, 10, 24, 1, 30 es: <b>${Math.min(31,2,10,24,1,25,30)}</b><br>`);
document.write(`Numero aleatorio entre 0 y 1: <b>${Math.random()}</b><br>`); 
document.write(`Numero aleatorio entre 0 y 100: <b>${Math.random()*100}</b><br>`); 

let numero = Math.random()*100;
document.write(`Numero aleatorio redondeado entre 0 y 100: <b>${Math.round(numero)}</b><br>`); 

document.write(`El piso de 4.99: <b>${Math.floor(4.99)}</b><br>`); 
document.write(`El techo de 5.1: <b>${Math.ceil(5.1)}</b><br>`); 
document.write(`Decimales eliminados de 3.4552: <b>${Math.trunc(3.4552)}</b><br>`); 

/* PROPIEDADES */

document.write(`Número PI: <b>${Math.PI}</b><br>`);
document.write(`Número Euler: <b>${Math.E}</b><br>`);
document.write(`Número Ln2: <b>${Math.LN2}</b><br>`);
document.write(`Número Ln10: <b>${Math.LN10}</b><br>`);
document.write(`Número Log_2(e), logaritmo base 2 de e: <b>${Math.LOG2E}</b><br>`);
document.write(`Número Log_10(e), logaritmo base 10 de e: <b>${Math.LOG10E}</b><br>`);

