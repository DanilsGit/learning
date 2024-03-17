
// A) Cotla entrô a una tienda que vende celulares porque le pareció bastante bueno comprarse un nuevo celular,
// De todos los modelos que hay disponibles en esa tienda, a Cofla le 11 amaron la atención 3 telefonos especificamente,
// El problema es que ningun vendedor sabe nada al respecto entonces no pueden recomendarle absolutaente nada... pero claro:
// el antes de comprar esos celulares quiere ver las cualidades y comportamientos de cada uno para poder comprarlos, ahi
// entramos nosotros.
// CREAR SOLUCIONES
// Crear un sistema para mostrarle a cofla las particularidades de los 3 celulares
// Cada celular debe tener color, peso, resolución de pantalla, resolución de camara y memoria ram
// Cada celular debe poder prender, reiniciar, apagar, tomar fotos y grabar

class Celular{
    constructor(nombre,color,peso,resolucionP,resolucionC,ram){
        this.nombre = nombre;
        this.color = color;
        this.peso = peso;
        this.resolucionP = resolucionP;
        this.resolucionC = resolucionC;
        this.ram = ram;
        this.encendido = false;
    }

    botonPower(){
        if(!this.encendido){
            this.encendido = true;
            alert(`Celular encendido`);
        }else{
            this.encendido = false;
            alert(`Celular apagado`);
        }
    } 

    reiniciar(){
        if(this.encendido){
            alert(`Celular reiniciando`);
        }else{
            alert(`Celular en estado 'apagado'`);
        }
    }

    tomarFoto(){
        alert(`${this.nombre} Tomó foto en una resolucion de ${this.resolucionC}`);
    }

    grabar(){
        alert(`${this.nombre} Grabando video en resolucion de ${this.resolucionC}`);
    }

    toString(){
        return `Nombre: <b>${this.nombre}</b><br>
        Color: <b>${this.color}</b><br>
        Peso:<b> ${this.peso}</b><br>
        Resolución de pantalla: <b>${this.resolucionP}</b><br>
        Resolución de camara: <b>${this.resolucionC}</b><br>`;
    }

}

class CelularAltaGama extends Celular{
    constructor(nombre,color,peso,resolucionP,resolucionC,ram, resolucionCExtra){
        super(nombre,color,peso,resolucionP,resolucionC,ram);
        this.resolucionCExtra = resolucionCExtra;
    }

    grabarLento(){
        alert(`${this.nombre} Grabando lento`);
    }
    reconocimientoFacial(){
        alert(`${this.nombre} hizo reconocimiento facial`);
    }

    //Sobrescrito
    toString(){
        return `Nombre: <b>${this.nombre}</b><br>
        Color: <b>${this.color}</b><br>
        Peso:<b> ${this.peso}</b><br>
        Resolución de pantalla: <b>${this.resolucionP}</b><br>
        Resolución de camara: <b>${this.resolucionC}</b><br>
        Resolución de camara extra: <b>${this.resolucionCExtra}</b><br>`;
    }

}

//Pruebas

const celular1 = new Celular("Samsung a4","rojo","500g", "5p","hd","2Gb");
const celular2 = new Celular("Samsung j5","negro","450g", "5,5p","full hd","3Gb");
const celular3 = new Celular("Xiaomi Mi a2","rojo","300g","4,5p","full hd","4Gb");

// celular1.botonPower();
// celular1.tomarFoto();
// celular1.grabar();
// celular1.reiniciar();

document.write(celular1.toString() + "<br>");
document.write(celular2.toString() + "<br>");
document.write(celular3.toString() + "<br>");

const celularAltaGama1 = new CelularAltaGama("Xiaomi Mi 10","azul","550g","6p","2k","8Gb", "full hd");
const celularAltaGama2 = new CelularAltaGama("Iphone 14 pro max","blanco","600g","6,5p","4k","6Gb", "2k");

document.write(celularAltaGama1.toString() + "<br>");
document.write(celularAltaGama2.toString() + "<br>");


class Juego {
    constructor(nombre,cantidadDescargas,puntuacion,peso){
        this.nombre = nombre;
        this.cantidadDescargas = cantidadDescargas;
        this.puntuacion = puntuacion;
        this.peso = peso;
        this.iniciado = false;
        this.instalado = false;
    }

    instalar(){
        if(!this.instalado){
            this.instalado = true;
            alert("Juego instalado");
        }else{
            alert("Juego ya instalado");
        }
    }

    abrir(){
        if(!this.iniciado){
            this.iniciado = true;
            alert("Juego abierto");
        }
    }

    cerrar(){
        if(this.iniciado){
            this.iniciado = false;
            alert("Juego cerrado");
        }
    }

    desinstalar(){
        if(this.instalado){
            this.instalado = false;
            alert("Juego desinstalado");
        }else{
            alert("Juego no encontrado");
        }
    }

    toString(){
        return `Nombre: <b>${this.nombre}</b><br>
        Cantidad de descargas: <b>${this.cantidadDescargas}</b><br>
        Puntuación: <b>${this.puntuacion}</b><br>
        Peso: <b>${this.peso}</b><br>`;
    }
}

const juego1 = new Juego("globosxd","15k", "3.5", "100Mb");
const juego2 = new Juego("minecraft","4M", "5", "2Gb");

juego1.desinstalar();
juego1.instalar();
juego1.abrir();
juego1.cerrar();
juego1.desinstalar();

document.write(juego1.toString() + "<br>");
document.write(juego2.toString() + "<br>");