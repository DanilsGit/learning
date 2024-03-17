/*
 * Programa que a partir de horas calcula semanas, dias y horas
 */
package calculartiempo;

import java.util.Scanner;

/**
 *
 * @author Danils
 */
public class CalcularTiempo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int semanas, dias, horas, horasPedidas;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese un número de horas: "); horasPedidas=entrada.nextInt();
        
        semanas=horasPedidas/168;
        dias=(horasPedidas%168)/24;
        horas=(horasPedidas%168)%24;
        
        System.out.println("\nSemanas: "+semanas+"\nDias: "+dias+"\nHoras: "+horas+"\n");
    }
    
}
