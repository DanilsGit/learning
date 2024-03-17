/*
 *
Ejercicio 9: Pedir el dia, mes y
año de una fecha e indicar si la
fecha es correcta. Suponiendo
que todos los meses son de 30
días.
 */
package verificarfecha;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class VerificarFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null, "Programa que pide uan fecha e indica si es correcta");
        
        int dia, mes, ano;
        
        dia=Integer.parseInt(JOptionPane.showInputDialog("Digite el día"));
        mes=Integer.parseInt(JOptionPane.showInputDialog("Digite el mes"));
        ano=Integer.parseInt(JOptionPane.showInputDialog("Digite el año"));
        
        if((dia>0) && (dia<=30)){
            if((mes>0) && (mes<=12)){
                if(ano!=0){
                    JOptionPane.showMessageDialog(null, "Fecha correcta");
                }else{
                    JOptionPane.showMessageDialog(null, "Fecha incorrecta, año incorrecto");
                }  
            }else{
                JOptionPane.showMessageDialog(null, "Fecha incorrecta, mes incorrecto");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Fecha incorrecta, dia incorrecto");
        }
        
    }
    
}
