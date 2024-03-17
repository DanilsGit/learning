import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class App{
    public static void main(String[] args) throws Exception {
        new Ventana();
    }
}


class Ventana extends JFrame{

    JLabel mensaje;

    Font fuente;

    JButton si;

    MovingButton no;

    Ventana(){
        setLayout(null);
        setSize(500, 400);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        setResizable(false);

        fuente = new Font("Brush Script MTf", 1, 35);

        mensaje = new JLabel("Te gustaria ser mi elfa uwu?");
        mensaje.setFont(fuente);
        mensaje.setBounds(0, 0, getWidth(), 100);

        si = new JButton("zi papu");
        si.setBounds(46, 250, 110, 25);

        no = new MovingButton();
        no.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "asd", "xd", 1);
                
            }
            
        });
        no.setText("no soporto :c");
        no.setBounds(325, 250, 130, 25);
        
        add(mensaje);
        add(si);
        add(no);
        setVisible(true);
    }

}

class MovingButton extends JButton {

    public MovingButton() {
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int mouseX = e.getX();
                int mouseY = e.getY();
                int buttonX = getX();
                int buttonY = getY();
                int PX = getWidth()/2;
                int PY =  getHeight()/2;

                System.out.println("Mouse: "+mouseX +","+mouseY +"\n P:"+PX+","+PY);

                if(mouseY < PY && mouseX < PX){
                    setLocation(buttonX+5,buttonY+5);
                }
                else if(mouseY > PY && mouseX < PX){
                    setLocation(buttonX+5,buttonY-5);
                }
                else if(mouseY < PY && mouseX > PX){
                    setLocation(buttonX-5,buttonY+5);
                }
                else if(mouseY > PY && mouseX > PX){
                    setLocation(buttonX-5,buttonY-5);
                }
                System.out.println("En pantalla: "+buttonX+","+buttonY);

                if(buttonY <= -20){
                    setLocation(buttonX,330);
                }
                if(buttonY >= 350){
                    setLocation(buttonX,10);
                }
                if(buttonX <= -100){
                    setLocation(370,buttonY);
                }
                if(buttonX >= 475){
                    setLocation(10,buttonY);
                }

            }
        });
    }
}
