package archivos;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Archivos {
    public static void main(String[] args) {
        
        Marco ventana = new Marco();
        
        
    }
    
}

class Marco extends JFrame implements ActionListener{

    JTextArea entrada = new JTextArea("");
    JButton crear = new JButton("Crear archivo");

    String txt ="";

    Marco(){
        setLayout(null);
        setSize(600,450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        getContentPane().setBackground(new Color(255, 225, 218));

        
        add(entrada);
        entrada.setBounds(17, 20, 550, 300);

        add(crear);
        crear.addActionListener(this);
        crear.setBounds(217, 350, 150, 30);
        

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        txt=entrada.getText();
        crearArchivo(txt);
        entrada.setText("");
    }

    public void crearArchivo(String e){

        FileWriter miArchivo = null;
        PrintWriter writer  = null;
        
        try {

            
            miArchivo = new FileWriter("C:\\Users\\Danils\\Desktop\\documento.txt");
            writer = new PrintWriter(miArchivo);
            
            writer.println(e);
            
            miArchivo.close();
            
            
            
        } catch (IOException ex) {
            System.out.println("Ruta no encontrada "+ ex.getMessage());
            
        }

    }

}