/*
Ejercicio 12: Leer por teclado una
tabla de 10 elementos numéricos enteros
y una posición (entre 0 y 9). Eliminar el
elemento situado en la posición dada sin
dejar huecos.
 */
package eliminarnumerodeunarray;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class EliminarNumeroDeUnArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
     
        int[] A = new int[10];
        int[] B = new int[9];
        
        for(int i=0;i<A.length;i++){
            System.out.print("Digite en ["+i+"]: "); A[i]=in.nextInt();
        }
        
        int tmp;
        
        System.out.print("Digite qué espacio desea eliminar del array: "); tmp=in.nextInt();
     
        //Ordenar el array, "desapareciendo" el número del espacio
        
        for(int i=(0+tmp);i<A.length-1;i++){
            A[i]=A[i+1];
        }
        
        System.arraycopy(A, 0, B, 0, A.length-1);
        
        
        System.out.println("Array original: ");
        
        for(int i : A){
            System.out.print("["+i+"]");
        }
        
        System.out.println("\nArray con posición eliminada: ");
        
        for(int i : B){
            System.out.print("["+i+"]");
        }
        
    }
    
}
