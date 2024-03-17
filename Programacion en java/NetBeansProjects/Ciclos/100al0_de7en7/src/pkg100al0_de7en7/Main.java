/*
 * Escribir todos los numeros del 100 al 0 de 7 en 7
 */
package pkg100al0_de7en7;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Programa que muestra todos los numeros del 100 al 0 de 7 en 7");
        
        
        for(int i=100;i>=0;i-=7){
            System.out.println(i);
        }
        
    }
    
}
