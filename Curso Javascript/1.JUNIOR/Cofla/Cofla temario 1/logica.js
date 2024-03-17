/*
A) 3 chicos de 23 años perfectamente normales entran a una heladeria a comprar un helado 
pero hay un problema: los precios no estan al lado de cada estante con su respectivo helado.
Ellos quieren comprar el helado mas caro que puedan con la plata que tienen, asi que... 
veamos como podemos ayudarlos.

Roberto tiene $1.5 USD
Pedro tiene $1.7 USD
Cofla tiene $3 USD

Los precios de helados son los siguientes:
Palito de helado de agua: $0.6 USDD
Palito de helado de crema: $1 USD
Bombón helado marca heladix: $1.6 USD
Bombón helado marca heladovich: $ 1.7 USD
Bombón helado marca helardo: $1.8 USD
Potecito de helado con confites: $2.9 USD
Pote de 1/4 KG - $2.9 USD
*/

let dineroRoberto = parseFloat(prompt('¿Cuánto dinero tiene Roberto?'));
let dineroPedro = parseFloat(prompt('¿Cuánto dinero tiene Pedro?'));
let dineroCofla = parseFloat(prompt('¿Cuánto dinero tiene Cofla?'));

//Roberto
{
    if (dineroRoberto >= 2.9) {
        document.writeln("<h2>Roberto puede comprar:</h2>");
        document.writeln("- Pote de 1/4 KG - o ");
        document.writeln("- Potecito de helado con confites -");
    } else if (dineroRoberto >= 1.8) {
        document.writeln("<h2>Roberto puede comprar:</h2>");
        document.writeln("Bombón helado marca helardo");
    } else if (dineroRoberto >= 1.7) {
        document.writeln("<h2>Roberto puede comprar:</h2>");
        document.writeln("Bombón helado marca heladovich");
    } else if (dineroRoberto >= 1.6) {
        document.writeln("<h2>Roberto puede comprar:</h2>");
        document.writeln("Bombón helado marca heladix");
    } else if (dineroRoberto >= 1) {
        document.writeln("<h2>Roberto puede comprar:</h2>");
        document.writeln("Palito de helado de crema");
    } else if (dineroRoberto >= 0.6) {
        document.writeln("<h2>Roberto puede comprar:</h2>");
        document.writeln("Palito de helado de agua");
    } else {
        document.writeln("<h2>Roberto no puede comprar nada :(</h2>");
    }
}

//Pedro
{
    if (dineroPedro >= 2.9) {
        document.writeln("<h2>Pedro puede comprar:</h2>");
        document.writeln("- Pote de 1/4 KG - o ");
        document.writeln("- Potecito de helado con confites -");
    } else if (dineroPedro >= 1.8) {
        document.writeln("<h2>Pedro puede comprar:</h2>");
        document.writeln("Bombón helado marca helardo");
    } else if (dineroPedro >= 1.7) {
        document.writeln("<h2>Pedro puede comprar:</h2>");
        document.writeln("Bombón helado marca heladovich");
    } else if (dineroPedro >= 1.6) {
        document.writeln("<h2>Pedro puede comprar:</h2>");
        document.writeln("Bombón helado marca heladix");
    } else if (dineroPedro >= 1) {
        document.writeln("<h2>Pedro puede comprar:</h2>");
        document.writeln("Palito de helado de crema");
    } else if (dineroPedro >= 0.6) {
        document.writeln("<h2>Pedro puede comprar:</h2>");
        document.writeln("Palito de helado de agua");
    } else {
        document.writeln("<h2>Pedro no puede comprar nada :(</h2>");
    }
}

//Cofla
{
    if (dineroCofla >= 2.9) {
        document.writeln("<h2>Cofla puede comprar:</h2>");
        document.writeln("- Pote de 1/4 KG - o ");
        document.writeln("- Potecito de helado con confites -");
        dineroCofla -= 2.9;
    } else if (dineroCofla >= 1.8) {
        document.writeln("<h2>Cofla puede comprar:</h2>");
        document.writeln("Bombón helado marca helardo");
        dineroCofla -= 1.8;
    } else if (dineroCofla >= 1.7) {
        document.writeln("<h2>Cofla puede comprar:</h2>");
        document.writeln("Bombón helado marca heladovich");
        dineroCofla -= 1.7;
    } else if (dineroCofla >= 1.6) {
        document.writeln("<h2>Cofla puede comprar:</h2>");
        document.writeln("Bombón helado marca heladix");
        dineroCofla -= 1.6;
    } else if (dineroCofla >= 1) {
        document.writeln("<h2>Cofla puede comprar:</h2>");
        document.writeln("Palito de helado de crema");
        dineroCofla -= 1;
    } else if (dineroCofla >= 0.6) {
        document.writeln("<h2>Cofla puede comprar:</h2>");
        document.writeln("Palito de helado de agua");
        dineroCofla -= 0.6;
    } else {
        document.writeln("<h2>Cofla no puede comprar nada :(</h2>");
    }

    document.write(`<p style="display:block;">A cofla le sobra ${dineroCofla} </p>`);
}

