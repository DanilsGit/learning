/*
 * Pedir tres números y mostrarlos de menor a mayor
 */
package mayormenor;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class MayorMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JOptionPane.showMessageDialog(null, "Programa que al digitar 3 números, los muestra de mayor a menor");
        
        int n1,n2,n3;
        
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite primer número"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite segundo número"));
        n3=Integer.parseInt(JOptionPane.showInputDialog("Digite tercero número"));
        
        if(n1>n2 && n1>n3){
            if(n2>n3){
                JOptionPane.showMessageDialog(null, "Ordenados son: "+n1+" - "+n2+" - "+n3);
            }else{
                JOptionPane.showMessageDialog(null, "Ordenados son: "+n1+" - "+n3+" - "+n2);
            }
        }
        
        if(n2>n1 && n2>n3){
            if(n1>n3){
                JOptionPane.showMessageDialog(null, "Ordenados son: "+n2+" - "+n1+" - "+n3);
            }else{
                JOptionPane.showMessageDialog(null, "Ordenados son: "+n2+" - "+n3+" - "+n1);
            }
        }
        
        if(n3>n1 && n3>n2){
            if(n1>n2){
                JOptionPane.showMessageDialog(null, "Ordenados son: "+n3+" - "+n1+" - "+n2);
            }else{
                JOptionPane.showMessageDialog(null, "Ordenados son: "+n3+" - "+n2+" - "+n1);
            }
        }
        
    }
    
}
