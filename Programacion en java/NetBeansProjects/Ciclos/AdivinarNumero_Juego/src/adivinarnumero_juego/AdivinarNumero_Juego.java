/*
 *
Ejercicio 5: Realizar un juego para adivinar un
número. Para ello generar un número aleatorio
entre 0-100, y luego ir pidiendo números
indicando "es mayor" o "es menor" según sea
mayor o menor con respecto a N. El proceso
termina cuando el usuario acierta y mostrar el
número de intentos.
 */
package adivinarnumero_juego;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class AdivinarNumero_Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        JOptionPane.showMessageDialog(null, "Juego!\n\nAdivina el número entero entre 0 a 100 con el menor número de intentos");

        int a, n, i, sino;

        boolean jugar;

        do {
            a=0;
            i=1;

            do {
                a = (int) (Math.random() * 100);
            } while (a < 0 && a > 100);

            n = Integer.parseInt(JOptionPane.showInputDialog("Intento - " + i + " - \n\nDigita el número 👀"));

            while (n != a) {
                i++;
                if (a > n) {
                    n = Integer.parseInt(JOptionPane.showInputDialog("Mala suerte, Intento - " + i + " - \nEl número a encontrar es MAYOR que " + n + "\n\nDigita un nuevo número 👀"));
                } else {
                    n = Integer.parseInt(JOptionPane.showInputDialog("Mala suerte, Intento - " + i + " - \nEl número a encontrar es MENOR que " + n + "\n\nDigita un nuevo número 👀"));
                }
            }

            if (n == a) {
                JOptionPane.showMessageDialog(null, "Felicidades! " + "El número era " + a + "\n\nAcertaste el número en " + i + " Intentos 😎");
            }

            sino = Integer.parseInt(JOptionPane.showInputDialog("¿Desea jugar de nuevo?\nDigite el número que corresponda\n1. Si\n2. No"));
            switch (sino) {
                case 1 -> jugar = true;
                case 2 -> jugar = false;
                default -> {
                    jugar=false;
                    JOptionPane.showMessageDialog(null, "Opción no válida, cerrandoe l juego...");
                }
            }
                   
        } while (jugar);
        
        

    }

}
