/*
 * Pedir 10 números y sumarlos
 */
package pkg10numerosysumarlos;

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
        
        JOptionPane.showMessageDialog(null, "Programa que recoge 10 números y los suma entre si");
        
        int suma=0, n;
        
        JOptionPane.showMessageDialog(null, "Digite a continuación los números");
        
        for(int i=0;i<10;i++){
            n=Integer.parseInt(JOptionPane.showInputDialog("Digite el número n°"+(i+1)));
            suma+=n;
        }
        
        JOptionPane.showMessageDialog(null, "La suma de los 10 números digitados es: "+suma);
        
        
    }
    
}
