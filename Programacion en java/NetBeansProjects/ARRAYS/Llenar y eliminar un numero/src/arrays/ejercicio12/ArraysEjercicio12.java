/*
 * Leer por teclado una tabla de 10 elementos numéricos enteros y una posición
(entre 0 y 9). Eliminar el elemento situado en la posición dada sin dejar huecos.
 */
package arrays.ejercicio12;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class ArraysEjercicio12 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int numeros[] = new int[10];
        int numerosNuevo[] = new int[9];
        int pos;
        boolean posicionCorrecta;
        
        for(int i=0;i<10;i++){
            //Guardamos los números que introduce el usuario.
            System.out.print("Inserte un número: ");
            numeros[i] = entrada.nextInt();
        }
        
        do{
            //Guardamos la posición que introduce el usuario.
            System.out.print("Elija una posición para borrar entre 0 y 9: ");
            pos = entrada.nextInt();
            
            //Comprobamos que la posición se encuentra entre 0 y 9.
            if(pos>9 || pos<0){
                posicionCorrecta=false;
                System.out.println("La posición que ha elegido no es la correcta.");
            }
            
            else{
                posicionCorrecta=true;
            }
            
        }while(posicionCorrecta==false);
     
        
        for(int i=pos;i<9;i++){
            //Movemos todos los números a partir de la posición
            numeros[i]=numeros[i+1];
        }
        
        //Copiamos el arreglo antiguo de 10 posiciones a uno nuevo de 9 posiciones
        //Indicamos que vamos a copiar 9 elementos de los 10 que tiene
        //a partir de la posición 0 de cada uno
        System.arraycopy(numeros, 0, numerosNuevo, 0, 9);
        
        //Imprimimos el nuevo arreglo
        for(int i:numerosNuevo){
            System.out.println(i);
        }
    }
    
}