/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package no_primitivos_cadenas;

/**
 *
 * @author Danils
 */
public class No_primitivos_Cadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Datos no primitivos pueden utilizar metodos
        
        // Null es un espacio de memoria vacio
        
        int entero=10; //No puede registrarse NULL
        
        Integer entero2=null; //Integer si puede porque es no primitivo
        
        System.out.println("Numero entero: "+entero);
        System.out.println("Numero vacio: "+entero2);
        
        ////////////////////CADENAS//////////////////////////////////////
        //String es no primitivo
        
        String palabra = "Hola";
        System.out.println(palabra);
    }
    
}
