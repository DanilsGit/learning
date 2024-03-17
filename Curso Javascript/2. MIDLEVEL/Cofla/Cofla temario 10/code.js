const sendButton = document.getElementById('btn-enviar');

sendButton.addEventListener('click', () => {
    let resultado, mensaje, resultadoFinal,span;
    try {
        mensaje = "Nota introducida";
        resultado = parseInt(document.getElementById('nota').value);

        if (isNaN(resultado)) {
            throw new Error("No es un número");
        }
        if (resultado < 0 || resultado > 10) {
            throw new Error("Fuera del rango");
        }

        resultadoFinal = validation(resultado);
        span = promedio_final(5,8,resultado);


    } catch (e) {
        resultado = "Número no válido";
        mensaje = e.message;
    }

    abrirModal(span,mensaje);
});

promedio_final = (a,b,c) => {
    let nota = (a + b + c) / 3;
    if (nota>=7) {
        return `<span style="color: green;" class='text_nota'>Aprobado con nota promedio \n ${Math.round(nota)}</span>`;
    } else {
        return `<span style="color: red;" class='text_nota'>Desaprobado con nota promedio \n ${Math.round(nota)}</span>`;
    }
}

validation = (resultado) => {
    if (resultado >= 7) {
        resultado = "Aprobado";
    } else {
        resultado = "Reprobado";
    }
    return resultado;
}

const abrirModal = (resultado,mensaje) => {
    document.querySelector('.resultado').innerHTML = resultado;
    document.querySelector('.mensaje').innerHTML = mensaje;
    const modal_bg = document.querySelector('.modal-bg');
    modal_bg.style.display = "flex";
    modal_bg.style.animation = "aparecer 1s forwards";
}


const cerrar_btn = document.getElementById('cerrar_btn');

cerrar_btn.addEventListener('click', () => {
    cerrarModal();
})

const cerrarModal = () => {
    const modal_bg = document.querySelector('.modal-bg');
    modal_bg.style.animation = "desaparecer 1s forwards";
}




