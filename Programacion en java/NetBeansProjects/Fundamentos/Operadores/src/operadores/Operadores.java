/*
 * OPERADORES
*/
package operadores;

import java.util.Scanner; //Libreria necesaria para Scanner

/**
 *
 * @author Danils
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //EN  ESTA LECCIÓN SE USARÁ UNICAMENTE LA CONSOLA
        Scanner entrada= new Scanner(System.in);
        float numero1, numero2, suma, resta, multi, divi, modulo;
        
        System.out.println("Digite dos números");
        System.out.print("Primer número: ");
        numero1=entrada.nextFloat();
        System.out.print("Segundo número: ");
        numero2=entrada.nextFloat();
        
        suma=numero1+numero2;
        resta=numero1-numero2;
        multi=numero1*numero2;
        divi=numero1/numero2;
        modulo=numero1%numero2;
        
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicación es: "+multi);
        System.out.println("La división es: "+divi);
        System.out.println("El módulo es: "+modulo);
               
        ////////Combinados con asignación//////////////////
        
        int numeroPrueba = 10;
        
        numeroPrueba+=5; //Es igual a ->  numeroPrueba = numeroPrueba + 5;
        //Por lo que el resultado es 15 en este caso
        System.out.println("");
        System.out.println("Numero prueba es: "+numeroPrueba);
        /*
        numeroPrueba-=5;
        numeroPrueba*=5;
        numeroPrueba/=5;
        numeroPrueba%=5;
        
        ADICIONALMENTE PARA INCREMENTO Y DECREMENTO
        
        numeroPrueba++; -> Suma en 1 el valor actual. 10 + 1
        
        numeroPrueba--; -> Resta en 1 el valor actual. 10 - 1
        
        PREFIJOS Y SUFIJOS
        
        x=5 y y=0
        
        y = x++;
        
        El resultado será y=5 , x=6. Porque primero se asigna "x" a "y" y despues se le suma 1 a "x"
        
        En cambuo con:
        
        y = ++x;
        
        Ahora si y=6 , x=6. Porque primero a la "x" se le suma 1 y después se le asigna a "y" 
        
        */
    }
    
}
