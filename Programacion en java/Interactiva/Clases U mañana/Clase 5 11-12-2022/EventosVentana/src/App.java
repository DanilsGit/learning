import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App {
    public static void main(String[] args) throws Exception {
        Marco miMarco = new Marco();
        miMarco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        miMarco.setTitle("Ventana 1");

        Marco miMarco2 = new Marco();
        miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        miMarco2.setTitle("Ventana 2");

    }
}

class Marco extends JFrame{

    VentanaEscucha eventosVentana = new VentanaEscucha();

    public Marco(){
        setSize(500,500);

        add(eventosVentana);                //Añadir al marco
        addWindowListener(eventosVentana); //Ponerlo a funcionar

        setVisible(true);
        
    }
}

class VentanaEscucha extends JPanel implements WindowListener{


    public VentanaEscucha(){

    }


    @Override
    public void windowOpened(WindowEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Se ha abierto la ventana");

    }

    @Override
    public void windowClosing(WindowEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Se está cerrando la ventana");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Se cerró la ventana");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        // TODO Auto-generated method stub
        System.out.println("La ventana se minimizó");
        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        // TODO Auto-generated method stub
        System.out.println("La ventana se ha abierto desde la hotbar");
        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        // TODO Auto-generated method stub
        setBackground(Color.white);
        System.out.println("La ventana está activada - en blanco");
        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        // TODO Auto-generated method stub
        setBackground(Color.black);
        System.out.println("La ventana está en segundo plano");
        
    }

}