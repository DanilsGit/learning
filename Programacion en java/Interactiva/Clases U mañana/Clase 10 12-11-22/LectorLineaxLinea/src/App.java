import java.io.BufferedReader;
import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {
        
        LeerLineas miLector = new LeerLineas();

        miLector.leer();

    }
}

class LeerLineas{


    public void leer(){

        try {

            String lineatxt = "";

            FileReader entrada = new FileReader("C:\\Users\\Danils\\Documents\\AppDocuments\\prueba1.txt");
            BufferedReader lector = new BufferedReader(entrada);
    
            while(lineatxt!=null){
                
                lineatxt = lector.readLine();

                if(lineatxt!=null) System.out.println(lineatxt);
                
            }

            lector.close();
    
        } catch (Exception e) {
            System.out.println("No se encuentra el archivo");
        }

    }

}