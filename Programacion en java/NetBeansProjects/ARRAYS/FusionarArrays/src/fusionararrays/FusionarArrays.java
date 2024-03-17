/*
Ejercicio 14: Leer dos series de 10 enteros,
que estarán ordenados crecientemente.
Copiar (fusionar) las dos tablas en una tercera, de forma
que sigan ordenados.

 */
package fusionararrays;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class FusionarArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner in = new Scanner(System.in);

        int A[], B[], C[];

        A = new int[10];
        B = new int[10];
        C = new int[20];

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

        System.out.println("\nCambio de array");

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite en la posición B[" + i + "]: ");
            B[i] = in.nextInt();

            if (i > 0) {
                do {
                    if (B[i - 1] >= B[i]) {
                        System.out.print("Digite un número que sea creciente en B[" + i + "]: ");
                        B[i] = in.nextInt();
                    }
                } while (B[i - 1] >= B[i]);
            }

        }

        //FUSIONAR A Y B EN C.
        int a = 0, b = 0, c = 0;

        while (a < 10 && b < 10) { //Cuando A se menor a 10 y ademas B menor a 10
            if (A[a] < B[b]) { //Cuando arreglo1 sea menor que arreglo2
                C[c] = A[a];
                a++;//para la siguiente posición de A
                c++;//para la siguiente posición de C
            } else {//Cuando arreglo2 sea menor que arreglo1
                C[c] = B[b];
                b++;//para la siguiente posición de B
                c++;//para la siguiente posición de C
            }
        }
        //resto de arreglo1 y arreglo2
        if (a == 10) { //si A es igual a 10
            while (b < 10) {
                C[c] = B[b];
                b++;
                c++;
            }
        } else {
            while (a < 10) {
                C[c] = A[a];
                a++;
                c++;
            }
        }

        System.out.println("\nA[]");
        for (int i : A) {
            System.out.print("[" + i + "]");
        }
        System.out.println("\nB[]");
        for (int i : B) {
            System.out.print("[" + i + "]");
        }
        System.out.println("\nC[]");
        for (int i : C) {
            System.out.print("[" + i + "]");
        }

    }

}
