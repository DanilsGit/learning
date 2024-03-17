/*
 Pedir numero entre el 1 y el 10 y mostrar su tabla de multiplicar
 */
package tablademultiplicar;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class TablaDeMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JOptionPane.showMessageDialog(null, "Programa que pide un número del 1 al 10 y muestra su tabla de multiplicar");
        
        byte n;
        
        n=Byte.parseByte(JOptionPane.showInputDialog("Ingrese el número entre 1 y 10"));
        
        do{
            if(n<1 || n>10){
                n=Byte.parseByte(JOptionPane.showInputDialog("Error. Ingrese un número válido entre 1 y 10"));
            }       
                    
        }while(n<1 || n>10);
        
        
        for(int i=1;i<=12;i++){
            System.out.println(n+" * "+i+" = "+(n*i));
        }
        
    }
    
}
