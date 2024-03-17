/*
 Ejercicio 13: Pedir 10 números.
Mostrar la media de los números
positivos, la media de los
números negativos y la cantidad de ceros.

 */

package promedios_cantidad_de_0;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */

public class Promedios_cantidad_de_0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JOptionPane.showMessageDialog(null, "Programa que a partir de 20 números muestra el promedio de los negativos, positivos y la cantidad de ceros");
        
        float n=0, cN=0, sumaN=0, cP=0, sumaP=0, c0=0;
        
        float promedioN, promedioP;
        
        for(int i=0;i<20;i++){
            
            n=Integer.parseInt(JOptionPane.showInputDialog("Digite el n°"+(i+1)));
            
            if(n==0){
                c0++;
            }else if(n<0){
                cN++;
                sumaN+=n;
            }else if(n>0){
                cP++;
                sumaP+=n;
            }
        }
        
        promedioN=sumaN/cN;
        promedioP=sumaP/cP;
        
        JOptionPane.showMessageDialog(null, "La cantidad de ceros es: "+c0);
        JOptionPane.showMessageDialog(null, "El promedio de negativos es: "+promedioN);
        JOptionPane.showMessageDialog(null, "El promedio de negativos es: "+promedioP);
        
        
    } 
}
