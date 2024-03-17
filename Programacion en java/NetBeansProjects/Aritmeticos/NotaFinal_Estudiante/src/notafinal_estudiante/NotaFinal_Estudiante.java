/*
 * La calificacion final de un estudiante de informatica se calcula con base 
a las calificaciones de cuatro aspectos de su rendimiento académico. 
\n1.Participación 2.Primer parcial 3.Segundo parcial 4.Examen Final 
\nCada nota con los porcentajes 10% 25% 25% y 40% respectialente.
Haga un programa para calcular la nota final del estudiante
 */
package notafinal_estudiante;

import javax.swing.JOptionPane;

/**
 *
 * @author Danils
 */
public class NotaFinal_Estudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        float participacion, parcial1, parcial2, examenFinal, notaFinal;
        
        JOptionPane.showMessageDialog(null, "La calificacion final de un estudiante de informatica se calcula con base "
                + "\n" +"a las calificaciones de cuatro aspectos de su rendimiento académico."
                + "\n" +"1.Participación 2.Primer parcial 3.Segundo parcial 4.Examen Final "
                + "\n" +"Cada nota con los porcentajes 10% 25% 25% y 40% respectialente."
                + "\n" +"\n Ingrese los datos del estudiante a continuación");
        
        nombre=JOptionPane.showInputDialog("Digite el nombre del estudiante");
        participacion=Float.parseFloat(JOptionPane.showInputDialog("Digite la nota de participación"));
        parcial1=Float.parseFloat(JOptionPane.showInputDialog("Digite la nota del primer parcial"));
        parcial2=Float.parseFloat(JOptionPane.showInputDialog("Digite la nota del segundo parcial"));
        examenFinal=Float.parseFloat(JOptionPane.showInputDialog("Digite la nota del examen final"));
        
        notaFinal=(float)((participacion*0.1)+(parcial1*0.25)+(parcial2*0.25)+(examenFinal*0.4));
        
        JOptionPane.showMessageDialog(null, "INFORMACIÓN DEL ESTUDIANTE"
                + "\nNombre: "+nombre
                + "\nNota de la participación: "+participacion
                + "\nNota del primer parcial: "+parcial1
                + "\nNota del segundo parcial: "+parcial2
                + "\nNota del examen final: "+examenFinal
                + "\n\nNota final del estudiante: "+notaFinal);
    }
    
}
