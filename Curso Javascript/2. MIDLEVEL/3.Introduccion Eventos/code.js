//Eventos.
/*
Se pueden realizar directamente en el HTML
usando event handlers, un ejemplo fue con el botón
que posee onclick="código_a_ejecutar";
*/

//También se puede realizar de la siguiente manera:

const btn = document.querySelector('.btn');
btn.onclick = () => {
    alert(`Mi código fue insertado desde JS`);
}
//Aunque no es recomendable por motivos como:
//El elemento podría no reconocer JS
//El usuario podría cancelar la carga de JS.

//Por lo que es más recomendable usar "Event Listeners":

//Funcionan mejor las funciones normales que las flecha.
const btn2 = document.querySelector('.btn2');
btn2.addEventListener("click",saludar);
function saludar(){
    alert(`Hola, he escuchado el evento gracias a un Event Listener`);
}

//Puedes acortar código, escribiendo la función en el evento.
const btn3 = document.querySelector('.btn3');
btn3.addEventListener("click",()=>{
    alert(`Hola, mi código está escrito dentro del Event Listener`);
});

//Objeto Event.
//Se pasa como parámetro en la función con el nombre que queramos
const btn4 = document.querySelector('.btn4');
btn4.addEventListener("click",(event)=>{
    console.log(event);

    //Retorna el outerHTML de quien activó el evento
    console.log(event.target); 
})

//EventFlow, orden en el que se ejecutan los eventos
/**
 * Event Bubbling: Este viene por defecto, primero se ejecutan
    los eventos de los hijos (child) y después el de los padres
    teniendo en cuenta de que estén en un contenedor.

 * Event Capturing: Primero se ejecutan los padres que tengan el
    tercer parámetro en "true". Si solo un padre tiene el "true"
    entonces ese se ejecutará de primero y el resto será de modo
    Event Bubbling

 */

//Event bubbling
const contenedor = document.querySelector(".contenedor");
const btn5 = document.querySelector(".btn5");

contenedor.addEventListener("click",()=>{
    alert("Ha pulsado el contendor");
});
btn5.addEventListener("click",()=>{
    alert("Ha pulsado el botón");
});

//Event Capturing
const div1 = document.querySelector(".div-1");
const div2 = document.querySelector(".div-2");
const btn6 = document.querySelector(".btn6");

btn6.addEventListener("click",(e)=>{
    alert("Ha pulsado el botón");
    e.stopPropagation();
});
div2.addEventListener("click",(e)=>{
    alert("Ha pulsado el contendor azul");
});
div1.addEventListener("click",(e)=>{
    alert("Ha pulsado el contendor rojo");
    
});

/*
    - Si solo div1 tiene true, se activa primero div1
    después btn y por último div2, es decir, primero el padre
    y después de la forma Event bubbling (hijo a padres)

    - Si div1 y div2 tiene true, se activa de primero 
    div1 (por ser padre) y después div2 (por ser hijo)

    - Si div1, div2 y btn tienen true, se activa primero div1
    después div2 y por último div3, es decir, del más padre al hijo

    - Si ninguno tiene true, se ejecuta en Event bubbling
*/

//stopPropagation() evita que los siguientes eventos
//se ejecuten , ya sean de padres o hijos.




