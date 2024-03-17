/*
 *
Ejercicio 5: Un obrero necesita calcular su salario
semanal, el cual se obtiene de la siguiente manera:
Si trabaja 40 horaso menos se le paga $16 por hora
Si trabaja mas de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora
extra.

 */
package salariosemanalobrero;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class SalarioSemanalObrero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat decimales = new DecimalFormat("###,###.##"); 
        
        JOptionPane.showMessageDialog(null, """
                                            Programa que calcula el salario semanal de un obrero.
                                            - Si trabaja 40 horas o menos se le paga $16 por hora
                                            - Si trabaja mas de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra.
                                            """);
        
        String nombre;
        double salario=0, horas;
        
        nombre=JOptionPane.showInputDialog("Digite el nombre del obrero");
        
        horas=Double.parseDouble(JOptionPane.showInputDialog("Digite las horas trabajadas por "+nombre));
        
        if(horas<=40){
            salario=horas*16;
        }else{
            if(horas>40){
                horas-=40;
                salario=(40*16)+horas*20;
            }
        }
        
        JOptionPane.showMessageDialog(null, "El salario del obrero "+nombre+" es de $"+decimales.format(salario) );
        
    }
    
}
