let persona1 = {
    nombre: "Daniel",
    edad: 19,
    licencia: true,
};

console.log("xd");

document.write(persona1["nombre"]);
document.write(persona1["edad"]);
document.write(persona1["licencia"]);

//O más organizado xd:

document.write(`<p>Array:
                        nombre: ${persona1["nombre"]},
                        edad: ${persona1["edad"]},
                        licencia: ${persona1["licencia"]}  
                </p>`);


