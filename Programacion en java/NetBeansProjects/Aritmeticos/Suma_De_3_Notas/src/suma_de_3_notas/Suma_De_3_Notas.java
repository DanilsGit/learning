/*
 * SUMA DE 3 NOTAS - EJERCICIO
 */
package suma_de_3_notas;

import java.util.Scanner; //Necesario por Scanner

/**
 *
 * @author Danils
 */
public class Suma_De_3_Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Pedir datos al usuatio. Primero empezar Scanner
        Scanner entrada = new Scanner(System.in);
        //
        float nota1, nota2, nota3, suma;
        
        System.out.println("Ingrese las 3 calificaciones del estudiante: ");
        System.out.print("Nota 1: "); nota1=entrada.nextFloat();
        System.out.print("Nota 2: "); nota2=entrada.nextFloat();
        System.out.print("Nota 3: "); nota3=entrada.nextFloat();
        suma=nota1+nota2+nota3;
                
        System.out.println("\nLas notas fueron: ");
        System.out.println("Nota 1: "+nota1+" Nota 2: "+nota2+" Nota 3: "+nota3);
        System.out.println("\nLa suma de las notas es: "+suma);
        
    }
    
}
