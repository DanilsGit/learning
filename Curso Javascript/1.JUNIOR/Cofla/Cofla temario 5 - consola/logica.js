const materias = {
    fisica: [95,7,4],
    logica: [80,8,4],
    quimica: [50,8,3],
    programacion: [60,9,2],
    matematica: [90,6,1],
    basedatos: [90,4,2],
    algebra: [80,6,2],
    calculo: [100,9,4]
}

const aprobar = () => {
    for(materia in materias){
        let asistencias = materias[materia][0];
        let promedio = materias[materia][1];
        let trabajos = materias[materia][2];
        
        console.log(materia);

        if(asistencias >= 90){
            console.log("%c  Asistencias en orden","color:green");
        }else{
            console.log("%c  Asistencias desaprobadas","color:red");
        }

        if (promedio >= 7) {
            console.log("%c  Promedio aprobado","color:green");
        }else{
            console.log("%c  Promedio menor que 7","color:red");
        }

        if (trabajos >= 3) {
            console.log("%c  Trabajos entregados","color:green");
        }else{
            console.log("%c  Faltan trabajos por entregar","color:red");
        }
    }
}

aprobar();