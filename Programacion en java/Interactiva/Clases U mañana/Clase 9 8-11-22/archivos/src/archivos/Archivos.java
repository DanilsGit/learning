/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author usuario
 */
public class Archivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Leer_archivo lector = new Leer_archivo();
        
        lector.escribir();
        
        
    }
    
}

class Leer_archivo{

    public void leer(){
        
        try{
            FileReader reader = new FileReader("C:\\Users\\usuario\\Documents\\AppDocuments\\prueba.txt");
            
            int c = 0;
            int contador=0;
            
            
            while(c!=-1){
                c = reader.read();
                System.out.println(c);
                contador++;
                
                char letra = (char)(c);
                System.out.println(letra);
            }
           
            reader.close();
            
        }catch(IOException e){
            System.out.println("No se encontró el archivo");
        }
        
        
        
    }

    public void escribir(){

        FileWriter miArchivo = null;
        PrintWriter writer  = null;
        
        try {

            
            miArchivo = new FileWriter("C:\\Users\\Danils\\Desktop\\xd.txt");
            writer = new PrintWriter(miArchivo);
            
            writer.println("Archivo de texto creado por código");
            writer.println("Párrafo de prueba aquí.");

            writer.print("XDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
            
            miArchivo.close();
            
            
            
        } catch (IOException ex) {
            System.out.println("Ruta no encontrada "+ ex.getMessage());
            
        }
        
    }

}