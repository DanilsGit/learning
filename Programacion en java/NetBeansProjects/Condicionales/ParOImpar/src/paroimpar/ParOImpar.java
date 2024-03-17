/*
 * Hacer un programa que tome dos numeros y diga si ambos son pares o impares
 */
package paroimpar;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class ParOImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JOptionPane.showMessageDialog(null, "Programa que toma dos numeros  y muestra si son pares o impares");
        
        int n1,n2;
        
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número"));
        
        if(n1%2==0 && n2%2==0){
            JOptionPane.showMessageDialog(null, "Ambos números son pares");
        }else{
            if(n1%2!=0 && n2%2!=0){
                JOptionPane.showMessageDialog(null, "Ambos números son impares");
            }else{
                if(n1%2==0 && n2%2!=0){
                    JOptionPane.showMessageDialog(null, n1+" Es par y "+n2+" es impar");
                }else{
                    JOptionPane.showMessageDialog(null, n2+" Es par y "+n1+" es impar");
                }
            }
        }
        
    }
    
}
