/*
 Ejercicio 15: Dadas las edades y
alturas de 5 alumnos, mostrar la edad y
la estatura media, la cantidad de alumnos mayores de 18 años,
y la cantidad de alumnos que miden más de 1.75

 */
package datosestudiantes_altura_edad;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class DatosEstudiantes_altura_edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JOptionPane.showMessageDialog(null, "Programa que a partir de los datos de 5 estudiantes muestra distintas estadisticas");

        float edadP, alturaP, cMayores=0, cMidenmas=0;
        
        float sumaE=0, sumaA=0, e,a;
        
        for(int i=0;i<5;i++){
            e=Float.parseFloat(JOptionPane.showInputDialog("Digite la edad del estudiante n°"+(i+1)));
            a=Float.parseFloat(JOptionPane.showInputDialog("Digite la altura del estudiante n°"+(i+1)+"\n\nEj: 1.70"));
            
            sumaE+=e;
            sumaA+=a;
            
            if(e>=18){
                cMayores++;
            }
            if(a>=1.75){
                cMidenmas++;
            }
            
        }
        
        edadP=sumaE/5;
        alturaP=sumaA/5;
        
        JOptionPane.showMessageDialog(null, "La edad promedio de los estudiantes es: "+edadP+"\nLa estatura promedio de "
                + "los estudiantes es: "+alturaP+"\nLa cantidad de estudiantes mayores de edad son: "+cMayores+"\nLa "
                        + "cantidad de estudiantes con estatura mayor a 1.75 son: "+cMidenmas+"\n\nGracias por utilizar el programa");
        
        
    }
    
}
