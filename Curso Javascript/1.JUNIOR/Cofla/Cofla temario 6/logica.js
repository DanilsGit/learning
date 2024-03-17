const contenedor = document.querySelector(".flex-container");

const button = document.querySelector(".send-button");
const oldButtonValue = button.value;

function crearLlave(nombre,modelo,precio) {
    img = `<img class="llave-img" src="llaves/llave1.png">`;

    const nombreH2 = document.createElement("H2");
    nombreH2.textContent = nombre;

    const modeloH3 = document.createElement("H3");
    modeloH3.textContent = modelo;

    const precioP = document.createElement("P");
    precioP.innerHTML = `Precio: <b>$${precio}</b>`;


    return [img, nombreH2.outerHTML, modeloH3.outerHTML, precioP.outerHTML];
}

let fragment = document.createDocumentFragment();

for (let index = 1; index <= 20; index++) {
    let precioRandom = Math.round(30+Math.random()*10);
    let modeloRandom = Math.round(Math.random()*1000);
    const llave = crearLlave(`Llave ${index}`,`modelo ${modeloRandom}`,`${precioRandom}`);
    
    let div = document.createElement("DIV");

    div.addEventListener("click", () =>{
        document.querySelector(".key-data").value = modeloRandom;
        button.value = oldButtonValue.toUpperCase() + ` MODELO ${modeloRandom}`;
    });

    div.tabIndex = index;
    div.classList.add("flex-item",`item-${index}`);
    div.innerHTML = llave[0]+llave[1]+llave[2]+llave[3];
    fragment.appendChild(div);
}
contenedor.appendChild(fragment);


