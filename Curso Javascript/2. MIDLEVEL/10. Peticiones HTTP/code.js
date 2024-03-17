//Los arrays asociativos son objetos
//Los JSON son objetos

//Objeto
objeto = {
    variable: "valor",
    variable2: "valor2",
};

console.log(objeto);

//formato json

json = {
    "variable": "valor",
    "variable2": "valor2",
};

console.log(json);

//El json está serializado cuando está en formato texto

jsonSerializado = '{"variable": "valor", "variable2": "valor2"}';

console.log(jsonSerializado);

//Para convertir un objeto en un json serializado
objeto = JSON.stringify(objeto);
console.log(objeto);


//Para convertir un json serializado en un objeto
objeto = JSON.parse(jsonSerializado);
console.log(objeto);