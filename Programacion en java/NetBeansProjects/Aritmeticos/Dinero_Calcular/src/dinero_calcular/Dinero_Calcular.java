/*
 * Guillermo tiene N dolares. Luis tiene la mitad de lo que posee Guillermo.
Juan tiene la mitad de lo que poseen Luis y Guillermo juntos.
Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los tres
 */
package dinero_calcular;

import java.util.Scanner;

/**
 *
 * @author Danils
 */
public class Dinero_Calcular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Leer datos
        Scanner entrada = new Scanner(System.in);
        //
        float dGuillermo, dLuis, dJuan, suma;
        
        System.out.print("Ingrese la cantidad de dinero que tiene Guillermo: ");
        dGuillermo=entrada.nextFloat();
        dLuis=dGuillermo/2;
        dJuan=(dLuis+dGuillermo)/2;
        
        suma=dGuillermo+dLuis+dJuan;
        
        System.out.println("\nEl dinero que cada uno tiene es");
        System.out.println("Guillermo: "+dGuillermo);
        System.out.println("Luis: "+dLuis);
        System.out.println("Juan: "+dJuan);
        
        System.out.println("La suma de dinero de los tres es: "+suma);
    }
    
}
