const materiasHTML = document.querySelector('.materias');
const verMaterias = document.getElementById('btn-materias_ver');
const cerrarMaterias = document.getElementById('btn-materias_cerrar');

//Array de objetos
const materias = [
    {
        nombre : 'Programación 4',
        nota : 10
    },
    {
        nombre : 'Calculo 3',
        nota : 4
    },
    {
        nombre : 'Fisica 2',
        nota : 3
    },
    {
        nombre : 'Historia',
        nota : 7
    },
    {
        nombre : 'Ciencias',
        nota : 8
    }
];

const obtenerMateria = (id) => {
    return new Promise((resolve, reject) => {
        const materia = materias[id];
        if(materia == undefined){
            reject('La materia no existe');
    }else{
        setTimeout(() => {
            resolve(materia);
        }, Math.random() * 1000);
    }
})};

// const devolverMaterias = async () => {
//     let arrayMaterias = [];
//     for(let i = 0; i < materias.length; i++){
//         let materia = await obtenerMateria(i);
//         arrayMaterias.push(materia);
//     }
//     return arrayMaterias;
// }

// console.log(devolverMaterias());

const devolverMaterias = async () => {
    let arrayMaterias = [];
    for(let i = 0; i < materias.length; i++){
        let materia = await obtenerMateria(i);
        arrayMaterias.push(materia);
        let materiaHTML =
        `
        <div class="materia">
                <div class="nombre">${materia.nombre}</div>
                <div class="nota">${materia.nota}</div>
        </div>
        `;
        materiasHTML.innerHTML += materiaHTML;
    }
    return arrayMaterias;
}

let activo = false;

verMaterias.addEventListener('click', async () => {
    if (!activo) {
        devolverMaterias();
    }
});

cerrarMaterias.addEventListener('click', () => {
    materiasHTML.innerHTML = '';
    activo = false;
});