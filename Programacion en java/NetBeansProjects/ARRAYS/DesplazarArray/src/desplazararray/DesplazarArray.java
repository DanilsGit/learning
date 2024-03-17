/*
Ejercicio 8: Diseñar una aplicación que
declare una tabla de 10 elementos
enteros. Leer mediante el teclado 8
números. Después se debe pedir un
número y una posición, insertarlo en la
posición indicada, desplazando los qte
estén detrás.
 */
package desplazararray;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class DesplazarArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Programa que de un array se desplazan los números para colocar otro");

        Scanner in = new Scanner(System.in);

        int A[] = new int[10];

        for (int i = 2; i < A.length; i++) {
            System.out.print("Digite el número. [" + i + "]: ");
            A[i] = in.nextInt();
        }

        for (int i : A) {
            System.out.print("[" + i + "]");
        }

        int n;
        byte p;

        System.out.print("\n\nDigite el número que desea adicionar en el array: ");
        n = in.nextInt();
        System.out.print("\nDigite en qué posición del array A[n] desea poner " + n + ": ");
        p = in.nextByte();
        do {

            if (p < 0 || p > 9) {
                System.out.print("\nPosición incorrecta, escoge una entre [0] y [9] para poner " + n + ": ");
                p = in.nextByte();
            }

        } while (p < 0 || p > 9);

        if (p < 2) {
            A[p] = n;
            System.out.println("Aicionado correctamente: ");
            for (int i : A) {
                System.out.print("[" + i + "]");
            }
        } else {

            for (int i = 2; i <= p; i++) {
                A[i - 1] = A[i];

                if (i == p) {
                    A[i] = n;
                }
            }
            System.out.println("Aicionado correctamente: \n");
            
            for (int i : A) {
                System.out.print("[" + i + "]");
            }
        }

    }

}