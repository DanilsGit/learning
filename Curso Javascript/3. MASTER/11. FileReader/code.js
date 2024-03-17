//FileReader
const archivo = document.getElementById('archivo');
const texto = document.querySelector('.texto');

const leerArchivo = (archivo) =>{
    for (let i = 0; i < archivo.length; i++) {
        const element = archivo[i];
        console.log(element);

        const reader = new FileReader();
        reader.readAsText(archivo[i]);

        reader.addEventListener('load', (e)=>{
            const contenido = e.target.result;
            texto.innerHTML += contenido+"<br>";
            console.log(e.target);
            try {
                obj = JSON.parse(contenido);
                console.log(typeof obj);
                console.log(obj);
            } catch (error) {
                console.log("No es un JSON "+error);
            }
        });
}};

archivo.addEventListener('change', (e)=>{
    leerArchivo(e.target.files);
});


