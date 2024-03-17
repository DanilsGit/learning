const getInfo = async () => {
    try {
        res = await axios('documento.txt');
        res = res.data
        console.log(res);
        document.querySelector('.numAprobados').innerHTML = res.aprobados;
        document.querySelector('.numDesaprobados').innerHTML = res.desaprobados;
    } catch (error) {
        const resHtml = document.querySelector('.resultado');
        resHtml.innerHTML = `<p>ERROR</p>
                            <p>Código: <b>${error.code}</b></p>
                            <p>Error: <b>${error.message}</b></p>
                            <p>De tipo: <b>${error.name}</b></p>`;

        
        console.log(error);
    }

}

document.querySelector('#getInfo').addEventListener('click', getInfo);