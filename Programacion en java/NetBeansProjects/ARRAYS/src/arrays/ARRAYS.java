/*
 * ARRAYS
 */
package arrays;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class ARRAYS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ///////////////////ARRAYS UNIDIMENSIONALES//////////////////////////////
        
        /* CREAR UN ARRAY
        
        - Tipo[] nombre = new tipo[tamaño]; /EJ/ int numeros = new int[3];
        
        //////////////////////////DAR VALORES AL ARRAY
        
        nombre[posicion]; = valor /EJ/ numeros[0]=3; numeros[1]=7; numeros[2]=9;
        
        Para agilizar es posible conbinar ambos
        
        int[] numeros = {3,7,9} 

        */
        
        
        /////////////LLEBAR ARREGLOS DINAMICAMENTE///////////////////////
        
        int tam;
        
        tam=Integer.parseInt(JOptionPane.showInputDialog("De qué tamaño desea el arreglo?"));
        
        char[] letras = new char[tam];
        
        for(int i=0;i<tam;i++){
            letras[i]=JOptionPane.showInputDialog("Digite para letras["+i+"]").charAt(0);
        }
        
        for(int i=0;i<tam;i++){
            System.out.print(letras[i]);
        }
        
    }
    
}
