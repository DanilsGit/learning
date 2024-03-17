/*
 * Pedir un número y calcular su factorial
 */
package factorialdeun_numero;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class FactorialDeUn_Numero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JOptionPane.showMessageDialog(null, "Programa que muestra el factorial del número introducido");
        
        long f=1;
        int n;
        
        n=Integer.parseInt(JOptionPane.showInputDialog("Digite el número deseado"));
        
        for(int i=1;i<=n;i++){
            f*=i;
        }
        
        JOptionPane.showMessageDialog(null, "El factorial de "+n+" es: "+f);
        
        
    }
    
}
