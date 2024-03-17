
import javax.swing.JOptionPane;

/*
 * Leer un caractér y determinar si es mayúscula o minúscula
package letramayusculaominuscula;

/**
 *
 * @author Daniel
 */
public class LetraMayusculaOMinuscula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JOptionPane.showMessageDialog(null, "Programa que lee un caractér y determina si es mayúscula o minúscula");
        
        char letra;
        
        letra = JOptionPane.showInputDialog("Digite una letra").charAt(0);
        
        if(Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null, "La letra es mayúscula 👍");
        }else{
            JOptionPane.showMessageDialog(null, "La letra es minúscula 👎");

        }
        
    }
    
}
