import java.awt.GraphicsEnvironment;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);

        String [] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        System.out.println("Digite el nombre de una fuente para verificar su usabilidad");
        String tmpfuente = in.nextLine();
        System.out.println();


        for(String fuente : nombresDeFuentes){

            if(tmpfuente.equalsIgnoreCase(fuente)){
                System.out.println("La fuente "+fuente+" se puede usar");
                break;
            }else{
                System.out.println("no se puede encontrar la fuente "+tmpfuente);
                break;
            }
            
        }


    }
}
