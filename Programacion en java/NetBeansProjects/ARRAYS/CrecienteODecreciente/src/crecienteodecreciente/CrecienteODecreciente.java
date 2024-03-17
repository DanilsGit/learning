/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crecienteodecreciente;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class CrecienteODecreciente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        JOptionPane.showMessageDialog(null, "Programa que solicita 10 numeros y determina si son crecientes, decrecientes o sin orden");

        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite el n°" + i));
        }

        for (int i : a) {
            System.out.print("[" + i + "]");
        }

        System.out.println("\n///\n");

        boolean creciente = false, decreciente = false, iguales=false;

        for (int i = 0; i < a.length - 1; i++) {

            if (a[i] < a[i + 1]) {
                creciente = true;
            }

            if (a[i] > a[i + 1]) {
                decreciente = true;
            }
            
            if(a[i]==a[i+1]){
                iguales=true;
            }

        }

        if (creciente == true && decreciente == false && iguales == false) {
            JOptionPane.showMessageDialog(null, "La lista de números es creciente");
        }
        
        else if (creciente == false && decreciente == true && iguales == false) {
            JOptionPane.showMessageDialog(null, "La lista de números es decreciente");
        }
        
        else if (creciente == false && decreciente == false && iguales == true) {
            JOptionPane.showMessageDialog(null, "La lista de números es continua");
        }
        
        else if (creciente == true && decreciente == true && iguales == true) {
            JOptionPane.showMessageDialog(null, "La lista de números no tiene orden");
        }
        
        else if(creciente == true && decreciente == false && iguales == true){
            JOptionPane.showMessageDialog(null, "La lista de números no tiene orden");
        }
        
        else if(creciente == false && decreciente == true && iguales == true){
            JOptionPane.showMessageDialog(null, "La lista de números no tiene orden");
        }

        

    }

}
