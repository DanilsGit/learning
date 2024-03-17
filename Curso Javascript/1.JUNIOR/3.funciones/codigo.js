
// forma 1
function saludar() {

    let respuesta = prompt("Hola, como te fue hoy?");
    if (respuesta == "bien") {
        alert("Me alegro!");
    } else {
        alert("ummm");
    }
      
}

// forma 2
let saludar2 = function(){

    let respuesta = prompt("Holaaaaaaaa, si o no?");
    if (respuesta == "si") {
        alert("pues si xd");
    } else {
        alert("jejejeje");
    }
      
}

//Funciones con return

// function esMayor() {
//     let edad = parseInt(prompt("Ingrese su edad"));
//     if(edad>=18){
//         return true;
//     }else{
//         return false
//     }
// }

// let resultado = esMayor();

// if(resultado){
//     alert("Puedes entrar jijiji");
// }else{
//     alert("No puedes entrar n.n");
// }

// document.write(resultado);

// Funciones flecha


const saludar3 = (nombre) => {
    document.write(`Hola ${nombre}, ¿Qué tal estás?`);
}

saludar3("daniel");