/*
 * 
 */
package juntararrays_dificultad2;

/**
 *
 * @author Daniel
 */
public class JuntarArrays_dificultad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int A[], B[], C[], D[];
        
        A = new int[12];
        B = new int[12];
        C = new int[12];
        D = new int[A.length+B.length+C.length];
        
        for(int i=0; i<A.length;i++){
            A[i]=i; B[i]=i+12; C[i]=i+24;
        }
        
        for(int i : A){
            System.out.print("["+i+"]");
        }
        System.out.println("\n///");
        for(int i : B){
            System.out.print("["+i+"]");
        }
         System.out.println("\n///");
        for(int i : C){
            System.out.print("["+i+"]");
        }
        
        int j=0;
        
        for(int i=0;i<12;i++){
            D[j]=A[i]; // °1A
            j++;//j=1
            D[j]=B[i]; // 1°B
            j++;//j=2
            D[j]=C[i]; // 1°C
            j++;//j=3
        }
        
        
        System.out.println("\n/// Combinados 3 primeros, 3 segundos, 3 terceros....");
        for(int i:D){
            System.out.print("["+i+"]");
        }
        
    }
    
}
