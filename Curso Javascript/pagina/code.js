const body = document.querySelector('.body');

const header = document.createElement("HEADER");
header.classList.add("header");
body.appendChild(header);

const div = document.createElement("DIV");
div.classList.add("container");
header.appendChild(div);

const ul = document.createElement("UL");

let headerLinks =    [["Inicio","/index.html"],["Servicios","#"],
                ["Productos",""],["Contacto",""]];

const fragment = document.createDocumentFragment();
for (let index = 0; index < 4; index++) {
    const li = document.createElement("LI");
    const a = document.createElement("A");
    a.textContent = headerLinks[index][0];
    a.setAttribute("href",headerLinks[index][1])
    li.appendChild(a);
    fragment.appendChild(li);
}
ul.appendChild(fragment);
div.appendChild(ul);

const content = document.createElement("DIV");
content.classList.add("contenido");
body.appendChild(content);

const footer = document.createElement("FOOTER");
footer.classList.add("footer");

const fragment2 = document.createDocumentFragment();
let footerLinks = [["Linkedin",""],["Facebook",""],["email",""]];

for (let index = 0; index < 3; index++) {
    const li = document.createElement("LI");
    const a = document.createElement("A");
    a.textContent = footerLinks[index][0];
    a.setAttribute("href",footerLinks[index][1])
    li.appendChild(a);
    fragment2.appendChild(li);
}
const ul2 = document.createElement("UL");
ul2.appendChild(fragment2);
footer.appendChild(ul2);
body.appendChild(footer);