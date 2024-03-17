
// class Calculadora {


//     constructor() {

//     }

//     suma = (n1, n2) => {
//         return parseInt(n1) + parseInt(n2);
//     }
//     resta = (n1, n2) => {
//         return parseInt(n1) - parseInt(n2);
//     }
//     multiplicacion = (n1, n2) => {
//         return parseInt(n1) * parseInt(n2);
//     }
//     division = (n1, n2) => {
//         return parseInt(n1) / parseInt(n2);
//     }
//     potencias = (n1, n2) => {
//         return n1**n2;
//     }
//     raizCuadrada = (n1) => {
//         return Math.sqrt(n1);
//     }
//     raizCubica = (n1) => {
//         return Math.cbrt(n1);
//     }

// }


// alert("calculadora");
// let e = prompt("¿Qué desea realizar? 1: Suma, 2: Resta, 3: Multiplicación, 4: División, 5: Potenciación, 6: Raíz cuadrada, 7: RaizCúbica");
// const calcul = new Calculadora();

// if (!(e < 1 || e > 5 )) {

//     let num1 = prompt("Digite numero 1");
//     let num2 = prompt("Digite numero 2");

//     if (e == 1) {
//         alert(calcul.suma(num1, num2));
//     }
//     if (e == 2) {
//         alert(calcul.resta(num1, num2));
//     }
//     if (e == 3) {
//         alert(calcul.multiplicacion(num1, num2));
//     }
//     if (e == 4) {
//         alert(calcul.division(num1, num2));
//     }
//     if (e == 5) {
//         alert(calcul.potencias(num1, num2));
//     }

// } else {
//     if (!(e < 5 || e > 7 )) {
//         let num1 = prompt("Digite numero");
//         if (e == 6) {
//             alert(calcul.raizCuadrada(num1));
//         }
//         if (e == 7) {
//             alert(calcul.raizCubica(num1));
//         }
//     }else{
//         alert("No se ha encontrado la elección");
//     }
// }

//Punto B


const consultarInformacion = (nombreMateria) => {

    materias = {
        fisica: ["Wilson","Daniel","Juan","Joan","Nicolas","Dalto","Juanfe"],
        programacion: ["William","Daniel","Juan","Nicolas","Dalto"],
        logica: ["Isebas","Daniel","Juan","Joan","Nicolas","Perez"],
        quimica: ["Carlos","Joan","Nicolas","Dalto","Daniel"]
    }

    if(materias[nombreMateria] !== undefined){
        return [materias[nombreMateria],nombreMateria,materias];
    }else{
        return materias;
    }

}

const mostrarInformacion = (materia) => {

    let informacion = consultarInformacion(materia);

if (informacion !== materias){
    let profesor = informacion[0][0];
    informacion[0].shift();
    let alumnos = informacion[0];

    document.write(`Profesor de <b>${informacion[1]}:</b> <b style="color:red">${profesor}</b><br>
    Los alumnos son: <b style="color:blue">${alumnos}</b><br><br>`);
    
}

}

mostrarInformacion("fisica");
mostrarInformacion("programacion");
mostrarInformacion("logica");
mostrarInformacion("quimica");



const cantidadClases = (alumno) => {

    let informacion = consultarInformacion();
    let cantidad = 0;
    let clasesPresentes = [];

    for (info in informacion) {
        if (informacion[info].includes(alumno)) {
            cantidad++;
            clasesPresentes.push(info)
            
        }
    }

    ordenado = clasesPresentes.join("<br>");

    if(cantidad>0){
        document.write(`El alumno <b style='color:blue'>${alumno}</b> está en <b>${cantidad}</b> clases <br>
        las cuales son: <br> <b style='color:purple'>${ordenado}</b> <br><br>`);
    }else{
        document.write(`El alumno <b style='color:blue'>${alumno}</b> no está en ninguna clase <br>`);
    }
}

cantidadClases("Daniel");
cantidadClases("Juanfe");
cantidadClases("Dalto");
cantidadClases("Joan");

