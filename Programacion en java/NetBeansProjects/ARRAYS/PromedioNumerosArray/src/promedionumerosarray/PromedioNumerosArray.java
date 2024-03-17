/*
 *
Ejercicio 3: Leer 5 números por
teclado, almacenarlos en un arreglo ya
continuación realizar la media de los
números positivos, la media de los
negativos y contar el número de ceros.
 */
package promedionumerosarray;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class PromedioNumerosArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Programa que lee 10 números y saca el promedio de los positivos, negativos y cnatidad de ceros\n");
        
        double promedioP, promedioN, c0=0, sumaN=0, cN=0, cP=0, sumaP=0;
        
        double[] num = new double[10];
        
        System.out.println("Digite los 10 números: ");
        
        for(int i=0;i<10;i++){
            System.out.print("N°"+(i+1)+": "); num[i]=in.nextDouble();
            if(num[i]<0){
                cN++;
                sumaN+=num[i];
            }else if(num[i]>0){
                cP++;
                sumaP+=num[i];
            }else if(num[i]==0){
                c0++;
            }
        }
        
        promedioP=sumaP/cP;
        promedioN=sumaN/cN;
        
        System.out.println("Promedio de negativos: "+promedioN+"\n"
                + "Promedio de positivos: "+promedioP+"\n"
                        + "Cantidad de ceros: "+c0+"\n");
        
        System.out.println("Array:");
        
        for(double i: num){
            System.out.print("["+i+"]");
        }
        
        
        
    }
    
}
