class Animal {
    constructor(especie, edad, color) {
        this.especie = especie;
        this.edad = edad;
        this.color = color;
        this.info = `Mi especie es ${especie}, tengo ${edad} años, y mi color es ${color} <br><br>`;
    }

    verInfo = () => {
        document.write(this.info);
    }

    getEspecie = () => {
        return this.especie;
    };
    getEdad = () => {
        return this.edad;
    };
    getColor(){
        return this.color;
    };

    set setEspecie(especie){
        this.especie = especie;
    };
    set setEdad(edad){
        this.edad = edad;
    };
    set setColor(color){
        this.color = color;
    };



}

class Perro extends Animal {
    constructor(especie, edad, color, raza) {
        super(especie, edad, color);
        this.raza = raza;
    }

    ladrar(){
        alert(`WOW!`);
    };

    verInfoP(){
        document.write(`Mi especie es ${this.especie}, tengo ${this.edad} años, mi color es ${this.color} y mi raza es ${this.raza} <br><br>`);
    }

    get getRaza(){
        return this.raza;
    };

    set setRaza(raza){
        this.raza = raza;
    };


}

// Pruebas

const perro = new Perro("canina", 10, "rojo","pastor aleman");
const pajaro = new Animal("ave", 2, "rojo");


perro.verInfoP();

perro.setRaza = "labrador";
perro.verInfoP();

pajaro.verInfo();
