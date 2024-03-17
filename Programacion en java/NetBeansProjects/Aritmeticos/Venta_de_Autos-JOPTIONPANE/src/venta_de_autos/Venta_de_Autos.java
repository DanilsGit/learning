/*
 * Una compañia de venta de carros usados, paga a su personal de ventas un salario
de $1000 mensuales , más una comisión de $150, más el 5% del valor de la venta 
por el carro. Hacer un programa que que caulcule e imprima el salario mensual del vendedor
dado
*/
package venta_de_autos;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Danils
 */
public class Venta_de_Autos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null, """
                                            Una compañia de venta de carros usados, paga a su personal de ventas un salario
                                            de $1000 mensuales \nMás una comisión de $150 por venta \nMás el 5% del valor de la venta por carro.
                                            \nDigite los datos de un vendedor de la compañía a continuación para calcular su salario. """);
        
        //
        String nombre;
        nombre= JOptionPane.showInputDialog("Digite el nombre del trabajador");
        double salario, ventas, precioCarros;
        ventas=Double.parseDouble(JOptionPane.showInputDialog("Digite la cantidad de autos vendidos"));
        precioCarros=Double.parseDouble(JOptionPane.showInputDialog("Digite el precio en DÓLARES en el que se vendieron los autos, SIN comas ni puntos"));
        salario=(1000)+(150*ventas)+((precioCarros*ventas)*0.05);
        
         DecimalFormat formateador = new DecimalFormat("###,###.##"); 

        
        JOptionPane.showMessageDialog(null, "Nobre del vendedor: "+nombre
                +"\nAutos vendidos: "+(int)ventas
                +"\nPrecio en el que se vendió cada uno de los autos: $"+formateador.format(precioCarros)
                +"\nComisión del 5% por carro: $"+formateador.format(((precioCarros)*0.05))
                +"\nComisión total del 5% por todos los carros: $"+formateador.format(((precioCarros*ventas)*0.05))
                +"\nComisión total de $150 por todos los carros carro: $"+formateador.format(ventas*150)
                +"\n\nSalario mensual sin comisiones: $1.000"
                +"\nSalario final mensual incluido las comisiones de ventas: $"+formateador.format(salario));

        JOptionPane.showMessageDialog(null, "Gracias por utilizar el programa");
    }
    
}
