package Ej_interfaces;

import Ej_interfaces.Clases.Carro;

public class MainInterfaces {

    public static void main(String[] args) {
        
        Carro miCarro = new Carro();
        miCarro.avanzar();
        miCarro.deneter();
        miCarro.cambiarEmisora();
        miCarro.girarDerecha();

    }
    
}
