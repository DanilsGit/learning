/*
Ejercicio 15: Leer 10
ordenados crecientemente. Leer N y
buscarlo en la tabla. Se debe mostrar
la posición en que se encuentra. Si
no está, indicarlo con un mensaje.
enteros
 */
package buscarelementoarray;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class BuscarElementoArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner in = new Scanner(System.in);

        int A[] = new int[10];

        System.out.println("Digite en el array números de forma creciente: ");

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite en la posición A[" + i + "]: ");
            A[i] = in.nextInt();

            if (i > 0) {
                do {
                    if (A[i - 1] >= A[i]) {
                        System.out.print("Digite un número que sea creciente en A[" + i + "]: ");
                        A[i] = in.nextInt();
                    }

                } while (A[i - 1] >= A[i]);
            }
        }
        
        int found, e=0;
        boolean founded=false;
        
        
        System.out.print("Digite el número que desea encontrar en el array: "); found=in.nextInt();
        
        for(int i=0;i<A.length;i++){
            if(found==A[i]){
                founded=true;
                e=i;
                break;
            }

        }
        
        if(founded=true){
                System.out.println("Número encontrado en A["+e+"]");
            }else{
                System.out.println("No se ha encontrado el número");
            }
        
    }
}
