/*
 * Ejercicio 4: En MegaPlaza se hace un 20% de descuento a los clientes Cuya compra supere los $300.
Cuál será la cantidad que pagará una persona por compra?
 */
package megaplaza;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class MegaPlaza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JOptionPane.showMessageDialog(null, """
                                            Programa de MegaPlaza que realiza un 20% de descuento a los clientes cuya compra supere los 300$.
                                            
                                            Ingresar los datos de un cliente para verificar el precio final de la compra""");
        
        double precio;
        String nombre;
        nombre=JOptionPane.showInputDialog("Digite el nombre del cliente");
        precio=Double.parseDouble(JOptionPane.showInputDialog("Digite el precio en dólares de la compra de "+nombre));
        
        if(precio>300){
            precio=precio-(precio*0.20);
            JOptionPane.showMessageDialog(null, "El precio final después del descuento por superar los 300$ de "+nombre+" es: $"+precio);
        }else{
            JOptionPane.showMessageDialog(null, "El precio final sin descuento por no superar los 300$ de "+nombre+" es: $"+precio);
        }
        
        
        
    }
    
}
