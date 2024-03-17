/*
 * Realizar la operación (a+b) al cuadrado en código
 */
package a.b.al.cuadrado;

import javax.swing.JOptionPane;

/**
 *
 * @author Danils
 */
public class ABAlCuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null, "Programa para resolver (a+b)^2");
        double a, b, resultado;
        a=Double.parseDouble(JOptionPane.showInputDialog("Ingrese 'a'"));
        b=Double.parseDouble(JOptionPane.showInputDialog("Ingrese 'b'"));
        
        resultado=Math.pow(a, 2) + Math.pow(b, b) + 2*a*b;
        
        JOptionPane.showMessageDialog(null, "( "+a+" + "+b+" )"+"^2 es = "+resultado);
    }
    
}
