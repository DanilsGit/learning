/*
 * Pedir dos numeros y decir cual es el mayor, menor o si son iguales
 */
package numeromayormenoriguales;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class NumeroMayorMenorIguales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JOptionPane.showMessageDialog(null, "Programa que pide dos números y dice cual es el mayor, cual el menor o si son iguales");
        
        int n1,n2;
        
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número"));
        
        if(n1>n2){
            JOptionPane.showMessageDialog(null, n1+" Es el número mayor y "+n2+" es el número menor");
        }else{
            if(n2>n1){
                JOptionPane.showMessageDialog(null, n2+" Es el número mayor y "+n1+" es el número menor");
            }else{
                if(n1==n2){
                    JOptionPane.showMessageDialog(null, "Ambos números son iguales");
                }else{
                    JOptionPane.showMessageDialog(null, "Error inesperado, digite números válidos");
                }
            }
        }
        
    }
    
}
