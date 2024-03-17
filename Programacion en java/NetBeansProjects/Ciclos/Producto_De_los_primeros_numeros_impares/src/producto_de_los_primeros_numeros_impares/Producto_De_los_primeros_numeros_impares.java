/*
 * Producto de los 10 primeros números impares
 */
package producto_de_los_primeros_numeros_impares;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Producto_De_los_primeros_numeros_impares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        JOptionPane.showMessageDialog(null, "Programa que multiplica los 10 primeros números impares");

        long i = 0, n = 1, e = 0;

        do {
            if (i % 2 != 0) {
                n *= i;
                e++;
            }
            i++;
        } while (e < 10);

        JOptionPane.showMessageDialog(null, n);

    }

}
