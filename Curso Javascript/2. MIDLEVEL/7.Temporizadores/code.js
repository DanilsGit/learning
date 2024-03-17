//Los temporizadores nos permiten trabajar con tiempo

//setTimeout, ejecuta una función esperando un tiempo determinado
// en milisegundos
const temporizador = setTimeout(() => {
    document.write("hola")
}, 2000);
//Esta función a los 2s escribe "hola"

//clearTimeout, si no se ha ejecutado el setTimeout
// esta función hace que nunca se ejecute
clearTimeout(temporizador);

//setInterval, ejecuta una función constantemente esperando
// un tiempo determinado cada ejecución
let contador = 0;
const temporizador2 = setInterval(() => {
    contador++;
    document.write(`<br>${contador}s. Hola, me voy a repetir cada segundo`);

}, 1000);
//Es como un while pero con espera entre ejecución.

//Para pararlo se usa la función clearInterval();
//en este caso lo pondré en un setTimeout para que se pare en x segundos
setTimeout(() => {
    clearInterval(temporizador2);
    document.write(`<br>Se ha parado la repetición en 5 segundos`);
    
}, 5000);
//Pero aquí no va a funcionar, porque todavía está ejecutándose
//Es por ello que la condición de parada está en el if de la función
