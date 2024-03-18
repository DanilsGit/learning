
import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.io.*;

public class App {
    public static void main(String[] args) {

        Marco ventana = new Marco();
        ventana.setVisible(true);

    }
}

class Marco extends JFrame{

    Lamina miLamina = new Lamina();

    Marco(){
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);

        
        add(miLamina);
    }

}

class Lamina extends JPanel{

    private Image img;
    
    /*ImageIcon imagen = new ImageIcon(getClass().getResource("imagenes/img1.png"));
    img1 = new JLabel(imagen);
    */
    
    Lamina(){
        try{
            img = ImageIO.read(new File("src/planeta.jpg"));
            repaint();
        }catch(IOException e){
            System.out.println("Error al encontrar/leer la imagen");
        }

        if(img!=null){
            int ancho= img.getWidth(this);
            int alto = img.getHeight(this);

            System.out.println(ancho + " - " + alto);
        }else{
            System.out.println("No es posible determinar las dimensiones de la imagen");
        }
        
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(img,0,0,null);
    }

}