/*
Ejercicio 11: Leer 5 elementos numéricos
que se introducirán ordenados de forma
creciente. Estos los guardaremos en una
tabla de tamaño 10. Leer un número N, e
insertarlo en el lugar adecuado para que la
tabla continúe ordenada.
 */
package arraycreciente_insertarordenado;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class ArrayCreciente_insertarOrdenado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        
        int A[] = new int[10];
        
        for(int i=0; i<5;i++){
            A[i]=((i+1)*2);
        }
        
        int tmp;
        
        
        System.out.println("Visualización del array: ");
        for(int i : A){
            System.out.print("["+i+"]");
        }
        
        /*        System.out.print("\n\nDigite el número para introcudir en el array: "); tmp=in.nextInt();
        int c=0;
        for(int i=1; i<=A.length;i++){
        
        if(A[i-1]>tmp){
        for(int e=A.length-1;e>(0+c);e--){
        A[e]=A[e-1];
        }
        break;
        }else{
        c++;
        }
        
        }
        A[c]=tmp;*/
        
        
        
        System.out.print("\n\nDigite el número para introcudir en el array: "); tmp=in.nextInt();
        
        //Darnos cuenta en que posicion va a estar
        int c=0;
        while(A[c]<tmp && c<A.length-1){
            c++;
        }
        
        //Organizar los datos para liberar el espacio
        for(int i=A.length-2;i>=(0+c);i--){
        A[i+1]=A[i];
        }
        
        //Insertar el numero
        A[c]=tmp;
        
        
        System.out.println("\nEl array ha quedado de esta manera: "); 
        for(int i : A){
            System.out.print("["+i+"]");
        }
        
        
    }
    
}
