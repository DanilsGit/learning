/*
 *
Ejercicio 1: Leer un número y
mostrar su cuadrado, repetir el
proceso hasta que se introduzca
un número negativ0.
 */
package cuadradosdenumeros;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class CuadradosDeNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JOptionPane.showMessageDialog(null, "Programa que muestra el cuadrado de un número, hasta que se introduzca un número negativo");
        
        int a;
        
        do{
            a=Integer.parseInt(JOptionPane.showInputDialog("Digite el número"));
            
            if(a>=0){
                JOptionPane.showMessageDialog(null, "El cuadrado es: "+(int)Math.pow(a, 2));
            }else{
                JOptionPane.showMessageDialog(null, "Numero negativo, programa deteniendose...");
            }
            
        }while(a>=0);
        
    }
    
}
