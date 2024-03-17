/*
 * Clase Math
- Conjunto de métodos para realizar infinidad de operaciones matemáticas.
 */
package clase.math;

/**
 *
 * @author Danils
 */
public class ClaseMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //////////////////////////RAIZ CUADRADA////////////////////////////////////////////////
        double raiz = Math.sqrt(25); // Se debe ingresar un double en el método
        System.out.println("Raiz es: "+raiz);
        
        //En el caso de querer el resultado en int se fuerza la conversion así:
        int raiz2 = (int)Math.sqrt(10);
        System.out.println("Raiz de 10 en Int es: "+raiz2);
        //Para tener un mejor resultado es preferible manejar double como lo pide
        
        System.out.println("");
        ///////////////////////ELEVAR NUMERO///////////////////////////////////////
        double base=4, exponente=2;
        double resultado=Math.pow(base, exponente);
        System.out.println(base+" a la "+exponente+" es: "+resultado);
        
        System.out.println("");
        ////////////////////REDONDEAR UN NÚMERO///////////////////////////////////
        double numero=3.14159;
        long resultadoAprox=Math.round(numero); 
        //Se guarda en long si el numero es un double
        //Se guarda en int si el número es un float
        System.out.println("El número "+numero+" redondeado es: "+resultadoAprox);
        
        System.out.println("");
        ////////////////////CREAR UN NÚMERO RANDOM////////////////////////////////////
        double nRandom = Math.random();
        //Entrega un número random por debajo de 0.
        System.out.println(nRandom);
        
        System.out.println("");
        ////////////////////////////////////////////////////////////////////////
    }
    
}
