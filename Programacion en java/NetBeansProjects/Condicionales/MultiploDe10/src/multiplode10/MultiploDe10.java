/*
 * Programa que lea un número entero y muestre si es multiplo de 10
 */
package multiplode10;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class MultiploDe10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        
        JOptionPane.showMessageDialog(null, "Programa que lee un número entero y muestra si es multiplo de 10");
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite el número entero"));
        
        if(numero%10 == 0){
            JOptionPane.showMessageDialog(null, "El número es múltiplo de 10 😁");
        }else{
            JOptionPane.showMessageDialog(null, "El número no es múltiplo de 10 😢");
        }
        
    }
    
}
