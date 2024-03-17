//APIS
//Objeto Date
const fecha = new Date();
console.log(fecha);

//Metodos
//getFullYear()
console.log("año " + fecha.getFullYear());
//getMonth()
console.log("mes del año " + fecha.getMonth());
//getDate()
console.log("dia del mes " + fecha.getDate());
//getDay()
console.log("dia de la semana " + fecha.getDay());
//getYear()
console.log("año - 1900 " + fecha.getYear());
//getHours()
console.log("hora " + fecha.getHours());
//getMinutes()
console.log("minutos " + fecha.getMinutes());
//getSeconds()
console.log("segundos " + fecha.getSeconds());
console.log(`hora actual ${fecha.getHours()}:${fecha.getMinutes()}:${fecha.getSeconds()}`);
//getMilliseconds()
console.log("milisegundos " + fecha.getMilliseconds());
//getTime()
console.log("time " + fecha.getTime());
// Date.now() devuelve el tiempo en milisegundos desde 1970 hasta la fecha actual
console.log(Date.now());
// igual que getTime(), pero no es necesario crear un objeto Date

//Ejemplo de uso, Reloj
const actualizarHora = () => {
    const time = new Date();
    let hora = addZero(time.getHours());
    let minutos = addZero(time.getMinutes());
    let segundos = addZero(time.getSeconds());
    document.querySelector(".hora").textContent = hora;
    document.querySelector(".min").textContent = minutos;
    document.querySelector(".seg").textContent = segundos;
}

const addZero = (num) => { return (num < 10) ? (`0${num}`) : num; }

//temporizador
actualizarHora();
setInterval(actualizarHora, 1000);
//setInterval() consume muchos recursos. Se suele usar otras librerías como moment.js

const actualizarFecha = () => {
    const time = new Date();
    let dia = addZero(time.getDate());
    let mes = addZero(time.getMonth() + 1);
    let ano = addZero(time.getFullYear());
    document.querySelector(".dia").textContent = dia;
    document.querySelector(".mes").textContent = mes;
    document.querySelector(".ano").textContent = ano;
}
actualizarFecha();