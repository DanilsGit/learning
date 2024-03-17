/*
 *
Ejercicio 13: Hacer un programa que simule un
cajero automático con un saldo inicial de 1000
Dólares, con el siguiente menú de opciones:
1. Ingresar dinero a la cuenta
2. Retirar dinero de la cuenta
0. Salir
 */
package cajeroautomatico;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class CajeroAutomatico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JOptionPane.showMessageDialog(null, "Programa con funciones de cajero automático");
        byte opc;
        
        opc=Byte.parseByte(JOptionPane.showInputDialog("Bienvenido, ¿Qué desea realizar?\nMarque una de las siguientes opciones"
                + "\n\n1.Ingresar dinero al cajero\n2.Retirar dinero del cajero\n0.Salir del programa"));
        
        double disponible=1000, retiro;
        
        switch(opc){
            case 1: disponible+=Double.parseDouble(JOptionPane.showInputDialog("Digite la cantidad a ingresar al cajero"));
                    JOptionPane.showMessageDialog(null, "Cantidad actual del cajero: "+disponible); break;
            case 2: retiro=Double.parseDouble(JOptionPane.showInputDialog("DIgite la cantidad a retirar del cajero"));
                    if(retiro>1000){
                        JOptionPane.showMessageDialog(null, "Cantidad de dinero excedida, cantidad disponible en el cajero: "+1000); break;
                    }else{
                        disponible-=retiro;
                        JOptionPane.showMessageDialog(null, "Cantidad actual del cajero: "+disponible); break;
                    }
            case 0: JOptionPane.showMessageDialog(null, "Gracias por usar el programa, adios."); break;
            default: JOptionPane.showMessageDialog(null, "Opción incorrecta, intentalo nuevamente"); break;
        }
        
    }
    
}
