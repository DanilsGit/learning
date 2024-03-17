/*
 * Condicionales
 */
package condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //////////////////////////////CONDICIONAL IF - ELSE ////////////////////
        
        /*
        if(condicion){
            instruccion1;
        }
        else{
            instruccion2;
        }
        */
        
        JOptionPane.showMessageDialog(null, "CONDICIONALES - PARTE 1 - IF ELSE");
        
        int numero, dato=5;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digita un número"));
        
        if(numero==dato){
            JOptionPane.showMessageDialog(null, "El número es 5");
        }
        else{
            JOptionPane.showMessageDialog(null, "El número digitado es diferente de 5");
        }
     
        /*
           ==  : Igualdad
           !=  : Diferencia
           <   : menor que
           >   : mayor que
           <=  : menor o igual que
           >=  : mayor o igual que
        */
        
        ////////////////////CONDICIONAL SWITCH ////////////////////////////////
        
        /* switch(dato){
        case 1: Intrucciones 1; break;
        ...
        ...
        ...
        case n: intrucciones n; break;
        default: InstruccionesDefalt; break;
        }        
        */
        
        JOptionPane.showMessageDialog(null, "CONDICIONALES - PARTE 2 - SWITCH");
        
        int datoPrueba;
        
        datoPrueba=Integer.parseInt(JOptionPane.showInputDialog("Digite un número entre 1 y 5"));
        
        switch(datoPrueba){
            case 1: JOptionPane.showMessageDialog(null, "El número es 1"); break;
            case 2: JOptionPane.showMessageDialog(null, "El número es 2"); break;
            case 3: JOptionPane.showMessageDialog(null, "El número es 3"); break;
            case 4: JOptionPane.showMessageDialog(null, "El número es 4"); break;
            case 5: JOptionPane.showMessageDialog(null, "El número es 5"); break;
            default: JOptionPane.showMessageDialog(null, "Digite un número válido entre 1 y 5 entero"); break;
        }
        

    }
    
}
