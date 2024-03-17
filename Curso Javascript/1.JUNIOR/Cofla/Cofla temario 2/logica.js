// A) Un joven muy afortunado logró ganar el primer premio de Ia loteria.. . 
// exacto, estamos hablando del pobre al que cofla le
// dió una mano, este pobre decide hacer una fiesta para festejar que salió de la pobreza con
// este mil1llonario compró una máquina que deja pasar solamente a los mayores de edad, entre otras cosas.


// - Dejar pasar solo a los mayores de edad
// - La primer persona que entre despues de las 2 AM, no paga.

// let paseFree = false;

// const validarCliente = (tiempo) => {
//     let edad = prompt("¿Cuál es tu edad?");
//     if (edad < 18) {
//         alert("No puedes pasar");
//     }
//     else {

//         if (tiempo >= 2 && tiempo <= 7 && !paseFree) {
//             alert("Puedes pasar gratis porque son las " + tiempo);
//             paseFree = true;
//         } else {
//             alert("Puedes pasar, pero pagando");
//         }

//     }
// }

// validarCliente(3);
// validarCliente(2);


// B) Cofla vuelve de la comisaria exausto y por lo cansado que estaba se fue a dormir...
// Al otro dia comienzan las clases del ciclo básico de la universidad (porque cofla quiere ser programador y se incribió en la
// facultad de ingeniería para estudiar desarrollo de software).
// En su curso en total son 19 alumnos, pero surgió un problema que complicó un poco a la facultad:
// se rompió el sistema de registro de asistencias y durante los próximos 30 dias no se podrán hacer registros de datos de
// ningun tipo, por ende las clases no podrán comenzar hasta que esto este solucionado.

// - Crear mini-sistema que nos permita registrar los alumnos que estan presentes (P) y ausentes (A) en clase.
// - Pasados los 30 dias mostrar la situación final de todos los alumnos (Nro total de presentes y ausentes).
// - Se puede tener un maximo de 10% de ausencias por semestre, si se tienen mas aclarar que está reprobado.

// let cantidadAlumnos = parseInt(prompt("Alumnos totales"));

// let listaAlumnos = [];

// for (i = 0; i < cantidadAlumnos; i++) {
//     listaAlumnos[i] = [prompt("Nombre del alumno " + (i + 1)), 0];
//     // [nombre,asistencia]
// }

// const asistencia = (nombre, posicionLista,dia) => {
//     let presencia = prompt(`¿${nombre} está presente (p) o ausente (a) en el día ${dia}?`);

//     if (presencia == 'p' || presencia == 'P') listaAlumnos[posicionLista][1]++;


// }

// for (i = 0; i < 30; i++) {
//     for (const alumno in listaAlumnos) {
//         asistencia(listaAlumnos[alumno][0], alumno,(i+1));
//         //nombre,posicion en la matriz
//     }
// }

// for (const alumno in listaAlumnos) {
//     let resultado = `${listaAlumnos[alumno][0]}: <br>
//     _____Asistencias: <b>${listaAlumnos[alumno][1]}</b> <br>
//     ______Ausencias: <b>${30-listaAlumnos[alumno][1]}</b> <br>`;

//     if(30-listaAlumnos[alumno][1] > 18)
//             resultado+=`<b style="color:red">Reprobado por inasistencias</b><br><br>`;
//     else    resultado+=`<br><br>`;

//     document.write(resultado);
// }


// C) Calculadora

alert("calculadora");
let eleccion = prompt("¿Qué desea realizar? 1: Suma, 2: Resta, 3: Multiplicación, 4:División");

const suma = (n1, n2) => {
    return parseInt(n1)+parseInt(n2);
}
const resta = (n1, n2) => {
    return parseInt(n1)-parseInt(n2);
}
const multiplicacion = (n1, n2) => {
    return parseInt(n1)*parseInt(n2);
}
const division = (n1, n2) => {
    return parseInt(n1)/parseInt(n2);
}
if (eleccion > 4 || eleccion < 1){
    alert("No se ha encontrado la eleccion");
}else{
    let num1 = prompt("Digite numero 1");
    let num2 = prompt("Digite numero 2");
}
if (eleccion == 1) {
    alert(suma(num1,num2));
}
if (eleccion == 2) {
    alert(resta(num1,num2));
}
if (eleccion == 3) {
    alert(multiplicacion(num1,num2));
}
if (eleccion == 4) {
    alert(division(num1,num2));
}


