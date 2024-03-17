/*
 * 
 */
package juntararrays;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class JuntarArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        
        int[] A = new int[10];
        int[] B = new int[10];
        
        for(int i=0;i<A.length;i++){
            A[i]=i;
            B[i]=i+B.length;
        }
        
        for(int i: A){
            System.out.print("["+i+"]");
        }
        
        System.out.println("\n///");
        
        for(int i: B){
            System.out.print("["+i+"]");
        }
        
        System.out.println("\n///");
        
        int[] C = new int[A.length+B.length];
        
        
        int ca=0, cb=1;
        
        for(int i=0;i<10;i++){
            C[ca]=A[i];
            C[cb]=B[i];
            ca+=2;
            cb+=2;
        }
        
        for(int i : C){
            System.out.print("["+i+"]");
        }
        
        
    }
    
}
