/*
Ejercicio 7: Pedir números hasta
que se introduzca uno negativo, y
calcular la media.
 */
package promedioden_numeros;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class PromedioDeN_Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JOptionPane.showMessageDialog(null, "Programa que saca promedio de los números introducidos hasta que se introduzca un negativo");
        
        float n,e=0, promedio,i=0;
        
        do{
            n=Integer.parseInt(JOptionPane.showInputDialog("Digite un número, van "+(int)i+" numeros\n\nDigite un negativo cuando desee terminar"));
            
            if(n<0){
                promedio=e/i;
                JOptionPane.showMessageDialog(null, "El promedio de los números introducidos es de: "+(int)promedio);
            }else{
                e+=n;
                i++;
            }
            
        }while(n>=0);
        
    }
    
}
