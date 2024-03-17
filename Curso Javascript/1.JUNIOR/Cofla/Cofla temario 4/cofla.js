
let materias = {
        fisica: ["Wilson","Daniel","Juan","Joan","Nicolas","Dalto","Juanfe"],
        programacion: ["William","Daniel","Juan","Nicolas","Dalto"],
        logica: ["Isebas","Daniel","Juan","Joan"],
        quimica: ["Carlos","Joan","Nicolas","Dalto","Daniel"]
}

const inscription = (alumno,materia) => {

    let listado = materias[materia];

    if(listado.length-1 >= 7) {
        document.write(`Lo sentimos <b style='color:blue'>${alumno}</b> la materia <b>${materia}</b> ya está llena <br>`);
    }else{

        listado.push(alumno);

        if (materia === "fisica") {
            materias = {
                fisica: listado,
                programacion: materias["programacion"],
                logica: materias["logica"],
                quimica: materias["quimica"],
        }

        }
        if (materia === "programacion") {
            materias = {
                fisica: materias["fisica"],
                programacion: listado,
                logica: materias["logica"],
                quimica: materias["quimica"],
        }

        }
        if (materia === "logica") {
            materias = {
                fisica: materias["fisica"],
                programacion: materias["programacion"],
                logica: listado,
                quimica: materias["quimica"],
        }

        }
        if (materia === "quimica") {
            materias = {
                fisica: materias["fisica"],
                programacion: materias["programacion"],
                logica: materias["logica"],
                quimica: listado,
        }
        }

        document.write(`Alumno <b style='color:blue'>${alumno}</b> se registró <b>correctamente</b><br>`)

    }

}
document.write(materias["fisica"] + "<br>");
inscription("cofla","fisica");
document.write(materias["fisica"] + "<br><br>");

document.write(materias["programacion"] + "<br>");
inscription("Andres","programacion");
document.write(materias["programacion"] + "<br><br>");

document.write(materias["logica"] + "<br>");
inscription("Loro","logica");
document.write(materias["logica"] + "<br><br>");

document.write(materias["quimica"] + "<br>");
inscription("Pato","quimica");
document.write(materias["quimica"] + "<br><br>");