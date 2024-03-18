package Ej_interfaces.Clases;

import Ej_interfaces.Interfaces.Radio;
import Ej_interfaces.Interfaces.Rueda;
import Ej_interfaces.Interfaces.Volante;

public class Carro implements Rueda, Volante, Radio{
    
    public void avanzar(){
        System.out.println("Avanzando*");
    }
    public void deneter(){
        System.out.println("Deteniendose*");
    }

    public void girarDerecha(){
        System.out.println("Girando a la derecha*");
    }

    public void girarIzquierda(){
        System.out.println("Girando a la izquierda*");
    }

    public void subirVolumen(){
        System.out.println("Subiendo volumen de radio*");
    }
    public void bajarVolumen(){
        System.out.println("Bajando volumen de radio*");
    }
    public void cambiarEmisora(){
        System.out.println("Cambiando emisora*");
    }


}
