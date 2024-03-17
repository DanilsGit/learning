/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposciclos;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class TiposCiclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ////////////////////CLICLO WHILE//////////////////////////////////////
        
        /*
        while(condicion){ 
        instrucciones;
        }
        
        Mientras que condición sea = true, se repite el while
        */
        
        Scanner entrada = new Scanner(System.in);
        
        int i=1, a;
        
        System.out.print("Digite cuantos números desea en pantalla");
        
        a=entrada.nextInt();
        
        while(i<=a){
            System.out.println(i);
            i++;
        }
        
        
        
        
    ///////////////////////CICLO DO WHILE////////////////////////////////////////

    /*
    
    do{
        instrucciones;
    }while(condicion);
    
    Realiza la acción primero y la repetirá si la condicion es cierta.
    
    */
    
        System.out.print("\nIngrese las veces que desea entrar al DO: ");
        
        i=1;
        int e;
        
        e=entrada.nextInt();
    
    do{
        System.out.println("Entraste al do "+i+" veces");
        i++;
    }while(i<=e);
    
    
    
    //////////////////////CICLO FOR//////////////////////////////////////////////
    
    /*
    
    for(inicio;condicion;aumento o decremento){
    instrucciones;
    }
    
    */
    
        System.out.println("\nPrueba el ciclo for imprimiendo un rango de números");
        System.out.print("Ingrese el número mas bajo del rango: ");
        int b,c;
        b=entrada.nextInt();
        System.out.print("Ingrese el número más alto del rango: ");
        c=entrada.nextInt();
        
        for(int iterador=b;b<=c;iterador++){
            System.out.println(b);
        }
    
    
    
    }
     
    
}
