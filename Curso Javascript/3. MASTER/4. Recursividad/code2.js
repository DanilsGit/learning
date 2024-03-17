"strict mode";
//Clausuras
const cambiarTam = tam => {
    return () => {
        document.querySelector(".text").style.fontSize = `${tam}px`;
    }
}
px10 = cambiarTam(10);
px15 = cambiarTam(15);
px20 = cambiarTam(20);

document.querySelector(".t10").addEventListener("click",px10);
document.querySelector(".t15").addEventListener("click",px15);
document.querySelector(".t20").addEventListener("click",px20);

//Parámetros por defecto
const sumar = (a=0,b=0) => {
    return a+b;
}

//Parámetros rest
const rest = (frase, ...num) => {
    let resultado = 0
    num.forEach(element => {
        resultado += element;
    });
    console.log(`${frase} ${resultado}`);
}
rest("la suma es: ",1,5,7);

//Destructuración
const persona = {
    nombre: "Juan",
    apellido: "Perez",
    edad: 20,
    direccion: {
        calle: "Calle 25",
        numero: 3540
    }
}
//Destrucción de objetos
const {nombre,apellido,edad} = persona;
console.log(nombre,apellido,edad);
//Destrucción de objetos anidados
const {direccion:{calle,numero}} = persona;
console.log(calle,numero);
