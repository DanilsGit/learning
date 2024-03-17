/*
 *
Ejercicio 3: Leer números hasta
que se introduzca un 0. Para
cada uno indicar si es par O
impar.
*/

package paroimparciclo;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class ParOImparCiclo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JOptionPane.showMessageDialog(null, "Programa que determina si un número es par o no hasta que se le digita 0");
        
        int a;
        
        do{
            a=Integer.parseInt(JOptionPane.showInputDialog("Digite el número"));
            
            if(a!=0){
                
                if(a%2==0){
                    JOptionPane.showMessageDialog(null, "El número "+a+" es par");
                }else{
                    JOptionPane.showMessageDialog(null, "El número "+a+" es impar");
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "El número es 0, programa deteniendose...");
            }
            
        }while(a!=0);
        
    }
    
}
