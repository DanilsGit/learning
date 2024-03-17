/*
 * Ejercicio 11: Construir un programa que simule el funcionamiento de una calculadora 
que puede realizar las cuatro operaciones aritméticas básicas (suma, resta, producto y división) 
con valores numéricos enteros. El usuario debe especificar la operación con el primer carácter del 
primer parámetro de la línea de comandos: S os para la suma, R o r para la resta, P, p, M o m para el producto 
y D o d para la división.
 */
package calculadoracondicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class CalculadoraCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null, "Calculadora básica para dos números");
        
       double n1,n2, suma, multi, divi, resta;
       char opc;
       
       opc=JOptionPane.showInputDialog("Digite la operación al realizar:\nS = Suma\nR = resta\nM = multiplicación\nD = división").charAt(0);
       
       n1=Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número"));
       n2=Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número"));
       
       switch(opc){
           case 's':
           case 'S': suma=n1+n2; JOptionPane.showMessageDialog(null, "La suma es: "+suma); break;
           case 'r':
           case 'R': resta=n1-n2; JOptionPane.showMessageDialog(null, "La resta es: "+resta); break;
           case 'm':
           case 'M': multi=n1*n2; JOptionPane.showMessageDialog(null, "La multiplicacion es: "+multi); break;
           case'd':
           case 'D': divi=n1/n2; JOptionPane.showMessageDialog(null, "La division es: "+divi); break;
           
           default: JOptionPane.showMessageDialog(null, "Digite una operación válida"); break;
               
           
    }
       
    }
    
}
