/*
 *
Ejercicio 4: Leer 10 números
enteros, guardarlos en un arreglo.
Debemos mostrarlos en el siguiente
orden: el primero, el último, el
segundo, el penúltimo, el tercero, etc.
 */
package ordenalternado;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class OrdenAlternado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner in = new Scanner(System.in);

        int[] numeros = new int[11];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("n°" + (i + 1) + ": ");
            numeros[i] = in.nextInt();
        }

        System.out.println("Array normal:");

        for (int i : numeros) {
            System.out.print("[" + i + "]");
        }

        System.out.println("\nArray tipo parcial:");

        int a, e, o;
        boolean d = false;

        a = 0;
        e = numeros.length - 1;
        o = 0;

        do {

            if (!d){

                if (o % 2 == 0) {
                    System.out.print("[" + numeros[a] + "]");
                    a++;
                } else {
                    System.out.print("[" + numeros[e] + "]");
                    e--;
                }
                o++;
                
                if(e==numeros.length/2){
                    System.out.print("[" + numeros[e] + "]");
                    d=true;
                }

            }

        } while (!d);
        
        //Forma facil xd
        
        System.out.println("\nForma facil xd");
        
        for(int i=0; i<(numeros.length)/2;i++){
            System.out.print("["+numeros[i]+"]");
            System.out.print("["+numeros[numeros.length-i-1]+"]");
        }

    }

}
