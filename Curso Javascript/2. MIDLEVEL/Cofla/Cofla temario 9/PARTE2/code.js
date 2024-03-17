let students = [
    {
        name: "Daniel Marquez",
        email: "danilssjsjs@gmail.com",
        course: "Programación"
    },
    {
        name: "Santiago Ramos",
        email: "floresxdxd@gmail.com",
        course: "matemática"
    },
    {
        name: "Juan Alarcón",
        email: "alarconxd@gmail.com",
        course: "Filosofia"
    },
    {
        name: "Joan Jaramillo",
        email: "jaramillo@gmail.com",
        course: "matemática"
    },
    {
        name: "Juan Manuel",
        email: "manuel22@gmail.com",
        course: "matemática"
    },
    {
        name: "Jose Perez",
        email: "Jose@gmail.com",
        course: "Discretas"
    },
    {
        name: "Samuel Mendoza",
        email: "Mendoza@gmail.com",
        course: "Cálculo"
    },
    {
        name: "Jorge Capo",
        email: "Jorge9@gmail.com",
        course: "Física"
    }
];

const button = document.querySelector(".confirm-button");
const contenedor = document.querySelector(".grid-container");

button.addEventListener("click",()=>{
    let verify = confirm("¿Realmente quieres confirmar?");

    if(verify){
        document.body.removeChild(button);

        let elements = document.querySelectorAll(".week");
        let week_choices = document.querySelectorAll(".week-choice");
    
        for (element in elements){
            console.log(element);
            week = elements[element];
            week.innerHTML = week_choices[element].value;
        }
    }
});

let htmlCode = ``;

for (const student of students) {
    let data = student;
    let name = data["name"];
    let email = data["email"];
    let course = data["course"];
    htmlCode += 
    `
    <div class="name grid-item">${name}</div>
    <div class="email grid-item">${email}</div>
    <div class="course grid-item">${course}</div>
    <div class="week grid-item">
        <select class="week-choice">
            <option value="Semana 1">Semana 1</option>
            <option value="Semana 2">Semana 2</option>
        </select>
    </div>`;
    
} 
contenedor.innerHTML = htmlCode;
