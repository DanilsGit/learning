/*
Ejercicio 10: Crear un programna
que lea por teclado una tabla de 10
números enteros y desplace N
posiciones en el arreglo (N es
digitado por el usuario).
*/
package desplazar_n_veces_array;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Desplazar_n_veces_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        
        int A[], tmp[], desplazador;
        
        A = new int[10];
        
        System.out.println("Llene el array a continuación: ");
        
        for(int i=0; i<A.length;i++){
            System.out.print("Ingrese un número en ["+i+"]: "); A[i]=in.nextInt();
        }
        
        System.out.println("\nVisualización del arrray: ");
        
        for(int i : A){
            System.out.print("["+i+"]");
        }
        
        System.out.println("\n///\n");
        
        System.out.print("Cuantos espacios desea desplazar el array: "); desplazador=in.nextInt();
        
        tmp = new int[desplazador];
        
        for(int i=0;i<desplazador;i++){ 
            tmp[i]=A[A.length-1-i]; //[0] [1] [2] tmp
        }
        
        for(int i=0;i<desplazador;i++){
            for(int e=A.length-2;e>=0;e--){
                A[e+1]=A[e];
            }
        }
        
        System.arraycopy(tmp, 0, A, 0, desplazador);
        
        System.out.println("\nDesplazados satisfactoriamente: ");
        
        for(int i : A){
            System.out.print("["+i+"]");
        }
        
        
    }
    
}
