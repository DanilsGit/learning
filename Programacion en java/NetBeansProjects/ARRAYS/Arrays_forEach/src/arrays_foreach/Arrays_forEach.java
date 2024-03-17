/*
 * Bucle for each
 */
package arrays_foreach;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Arrays_forEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JOptionPane.showMessageDialog(null, "Programa que muestra la funcion del for each");
        
        String[] nombres = {"Daniel", "Jhoan", "Luis", "Juan", "Esteban", "Julian", "Alejandro"};
        
        /*
        
        for(TipoDeDato iteradorNombre : Nombre del arreglo)
        
        */
        
        for(String i : nombres){
            System.out.println(i);
            if(i==i){
                System.out.println("Hola");
            }
        }
        
        
        /*for(int i=0;i<nombres.length;i++){        Viejo
        System.out.println(nombres[i]);
        }*/
        
    }
    
}
