
document.write("While: ");
//While

let numero = 0;

while(numero < 10){
    numero++;
    document.write(numero+" ")
}

document.write("<br><br> For: ");

//For

for (let i = 0; i <= 5; i++) {
    
    if(i === 3){
        continue;
    }

    document.write(i + " ");
    
}

document.write("<br><br> For in: ");

//For in

let animales = ["gato","perro","vaca","caballo","cerdo","gallina","paloma"];

for (pos in animales) {
    document.write(pos);
}

document.write("<br><br> For of: ");

//for of

for (animal of animales) {
    document.write(animal + " ");
}

document.write("<br><br> combiancion: <br><br>");

//Pruebas

nombres1 = ["Daniel","Carlos","José"];
nombres2 = ["Camilo", "Joan", nombres1, "jejeje"];

principalfor:
for (let i in nombres2) {
    if(i == 2){

        for(let i of nombres1){
            break principalfor;
            document.write(i+"<br>");
        }

    }else{
        document.write(nombres2[i]+"<br>");
    }
}
//
document.write("<br><br>");

frase1 = ["hola","como","estás"];
frase1.tam = 2;

for(i in frase1){
    if(frase1.tam == i){
        document.write(frase1[i]+"?");
        break;
    }else{
        document.write(frase1[i]+" ");
    }
}
//

