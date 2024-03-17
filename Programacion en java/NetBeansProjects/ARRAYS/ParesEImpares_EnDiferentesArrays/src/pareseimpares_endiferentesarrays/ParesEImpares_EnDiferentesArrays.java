/*
Ejercicio 13: Leer 10 enteros en
una tabla. Guardar en otra tabla los
elementos pares de la primera, y a
continuación los elementos impares.
 */
package pareseimpares_endiferentesarrays;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class ParesEImpares_EnDiferentesArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner in = new Scanner(System.in);

        int pares[], impares[], todos[];

        todos = new int[10];

        for (int i = 0; i < todos.length; i++) {
            System.out.print("Digite en la posición [" + i + "]: ");
            todos[i] = in.nextInt();
        }

        //Creador de pares e impares
        int cpares = 0, cimpares = 0;
        for (int i = 0; i < todos.length; i++) {

            if (todos[i] % 2 == 0) {
                cpares++;
            } else {
                cimpares++;
            }
        }

        pares = new int[cpares];
        impares = new int[cimpares];

        int p = 0, e = 0;

        for (int i = 0; i < todos.length; i++) {

            if (todos[i] % 2 == 0) {
                pares[p] = todos[i];
                p++;
            } else {
                impares[e] = todos[i];
                e++;
            }

        }

        System.out.println("\nArray original: ");
        for(int i : todos){
            System.out.print("[" + i + "]");
        }
        
        System.out.println("\nArray con pares: ");
        for(int i : pares){
            System.out.print("[" + i + "]");
        }
        
        System.out.println("\nArray impares: ");
        for(int i : impares){
            System.out.print("[" + i + "]");
        }
        
    }

}
