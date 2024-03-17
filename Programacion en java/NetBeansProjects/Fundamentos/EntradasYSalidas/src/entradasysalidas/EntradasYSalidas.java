/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entradasysalidas;

import java.util.Scanner; // IMPORTAR PARA LA ENTRADA DE DATOS

/**
 *
 * @author Danils
 */
public class EntradasYSalidas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Entrada de Datos
        Scanner entrada = new Scanner(System.in); //Guarda cualquier dato -> entrada
        int numero;
        System.out.print("Digite un numero: ");
        numero=entrada.nextInt(); //Se usa el metodo .nextInt/float/double/byte/etc...
        
        System.out.println("El numero digitado es: "+numero);
        
        //////////////////////////////////////////////////////////////////////////
        System.out.println("");
        
        Scanner entrada2 = new Scanner(System.in); //Guarda cualquier dato -> entrada
        float numero2;
        System.out.print("Digite un numero: ");
        numero2=entrada2.nextFloat(); // Intentar con punto, sino funciona, con coma
        
        System.out.println("El numero digitado es: "+numero2);
        
        ///////////////////////////GUARDAR CADENAS///////////////////////////////
        System.out.println("");
        
        Scanner entradaCadena = new Scanner(System.in);
        String cadena;
        System.out.print("Escriba una cadena: ");
        cadena=entradaCadena.nextLine();
        //next = Solo guarda una palabra
        //nextLine= Guarda toda la cadena
        System.out.println("La cadena es: "+cadena);
        
        ///////////////////////////GUARDAR CHAR///////////////////////////////
        System.out.println("");
        
        Scanner entradaChar = new Scanner(System.in);
        char caracter2;
        System.out.print("Escriba un caracter: ");
        caracter2=entradaChar.next().charAt(0);
        //next = Solo guarda una palabra
        //nextLine= Guarda toda la cadena
        System.out.println("El caracter es: "+caracter2);
        
        
        
        
        
    }
}
