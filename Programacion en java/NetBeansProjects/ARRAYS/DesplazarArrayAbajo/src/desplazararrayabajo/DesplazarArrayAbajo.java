/*
Ejercicio 9: Crear un programa que lea por
teclado una tabla de 10 números enteros y la
desplace una posición hacia abajo: el primero
pasa a ser el segundo, el segundo pasa a ser el|
tercero y así sucesivamente. El último pasa a ser
el primero.
 */
package desplazararrayabajo;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class DesplazarArrayAbajo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner in = new Scanner(System.in);

        int[] A = new int[10];

        System.out.println("Llena el array a continuación: ");

        for (int i = 0; i < A.length; i++) {
            System.out.print("Posición [" + i + "]: ");
            A[i] = in.nextInt();
        }

        System.out.println("Visualización del array: ");
        for (int i : A) {
            System.out.print("[" + i + "]");
        }

        System.out.println("/// Moviendo el array una posición a la derecha...");

        int tmp = A[A.length - 1];

        for (int i = A.length - 2; i >= 0; i--) {
            A[i + 1] = A[i];
        }
        
        A[0]=tmp;
        
        System.out.println("Hecho satisfactoriamente");
        for (int i : A) {
            System.out.print("[" + i + "]");
        }
        
        

    }
}
