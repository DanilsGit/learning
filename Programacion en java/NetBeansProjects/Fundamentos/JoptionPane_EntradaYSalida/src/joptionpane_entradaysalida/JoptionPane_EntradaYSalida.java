package joptionpane_entradaysalida;

import javax.swing.JOptionPane; // Se utiliza para los dialogos en pantalla

/**
 *
 * @author Danils
 */
public class JoptionPane_EntradaYSalida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena="--";
        int entero=0;
        char caracter='*';
        double decimal=0.0;
        
        //Leer cadena:
        cadena= JOptionPane.showInputDialog("Digite una cadena: ");
        
        //Leer entero:
        //Error así: entero=JOptionPane.showInputDialog("Digite un número entero: ");
        //Hay que transformar el showInpuDialog en entero:
        entero= Integer.parseInt(JOptionPane.showInputDialog("Digite un número entero: "));
       
        //Leer char: EL unico cambio es el metodo .charAt(0) el cual coge el primer caracter de la cadena
        caracter=JOptionPane.showInputDialog("Ingrese un caracter: ").charAt(0);
        
        //Leer decimal:
        //Igual que con un numero entero, debe ser transformado:
        decimal=Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));
        //Lo mismo con float, Float.parseFloat(cadena);
        
        //Mostrar los datos en pantalla: ///////////////////////////
        
        JOptionPane.showMessageDialog(null, "La cadena escrita fue: "+cadena);
        JOptionPane.showMessageDialog(null, "El número ingresado fue: "+entero);
        JOptionPane.showMessageDialog(null, "El caracter ingresado fue: "+caracter);
        JOptionPane.showMessageDialog(null, "El décimal ingresado fue: "+decimal);

        
        
        
    }
    
}
