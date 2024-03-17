//Propiedad screen. Devuelve un objeto screen
//Con las propiedades de la pantalla
//width, height,etc
const screen = window.screen;
console.log(screen);

//Propiedad screenLeft.
//Devuelve la distancia horizontal izquierda
//entre el navegador y el borde de la pantalla
const screenLeft = window.screenLeft;
console.log(screenLeft);
document.write(`Separación izquierda: ${screenLeft}<br>`);

//Propiedad screenTop.
//Devuelve la distancia vertical
//entre el navegador y el borde top de la pantalla
const screenTop = window.screenTop;
console.log(screenTop);
document.write(`Separación derecha: ${screenTop}<br><br>`);

//Propiedad scrollX y scrollY
//Devuelve la posición X o Y, del scroll.
for (let index = 0; index < 100; index++) {
    document.write("Haciendo espacio para scrollear<br><br>");
}

const posX = window.scrollX;
const posY = window.scrollY;
document.write(`<br>Desplazamiento en X: ${posX}<br><br>`);
document.write(`Desplazamiento en Y: ${posY}<br><br>`);

//Método scroll()/scrollTo(), nos lleva a las coordenadas puestas.
//scroll(x,y);
window.scroll(0,100);

//Método scrollBy(), permite desplazarse por la ventana
// desde la posición actual
//scroll(x,y);
window.scrollBy(0,300);

//Método resizeBy(), cambia el tamaño de la ventana
//DomException, lo veremos más adelante
window.resizeBy(300,300);

//Método resizeTo()
//Cambia el tamaño dinámicamente a la ventana
window.resizeTo(300,300);

//Método moveBy()
//Mueve la ventana de forma relativa
window.moveBy(300,300);

//Método moveTo()
//Mueve la ventana de forma absoluta
window.moveTo(300,300);

