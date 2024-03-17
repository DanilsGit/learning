/*
 * 
 */
package mostrarmismoordenarray;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class MostrarMismoOrdenArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        int[] numeros = new int[5];
        
        for(int i=0;i<5;i++){
            System.out.print("Digite el número n°"+(i+1)+": ");
            numeros[i]=entrada.nextInt();
        }
        
        System.out.println("Numeros introducidos en orden: ");
        
        for(int i : numeros){
            System.out.println(i);
        }
        
        System.out.println("\nNumeros introducidos al inverso: ");
        
        for(int i=(numeros.length-1);i>=0;i--){
            System.out.println(numeros[i]);
        }
        
    }
    
}
