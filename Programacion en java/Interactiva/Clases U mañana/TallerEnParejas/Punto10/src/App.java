import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception {
        Marco ventana = new Marco();
        ventana.setVisible(true);
    }
}

class Marco extends JFrame implements ActionListener{

    JButton btnN, btnA, btnV, btnClose;

    N vN = new N();
    A vA = new A();
    V vV = new V();

    Marco(){
        setSize(600,600);
        setLayout(new GridLayout(2,2,30,30));
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);

        btnN = new JButton("Ventana negra");
        btnA = new JButton("Ventana amarilla");
        btnV = new JButton("Ventana verde");
        btnClose = new JButton("Cerrar ventanas");

        add(btnN); btnN.addActionListener(this);
        add(btnA); btnA.addActionListener(this);
        add(btnV); btnV.addActionListener(this);
        add(btnClose); btnClose.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        if(e.getSource() == btnN){
            vN.setVisible(true);
        }
        if(e.getSource() == btnA){
            vA.setVisible(true);
        }
        if(e.getSource() == btnV){
            vV.setVisible(true);
        }
        if(e.getSource() == btnClose){
            vN.dispose();
            vA.dispose();
            vV.dispose();
        }
            
    }

}

class N extends JFrame{

    N(){
        setLayout(null);
        setSize(300,300);
        setDefaultCloseOperation(1);
        setLocationRelativeTo(null);

        getContentPane().setBackground(Color.BLACK);

    }

}

class A extends JFrame{

    A(){
        setLayout(null);
        setSize(300,300);
        setDefaultCloseOperation(1);
        setLocationRelativeTo(null);

        getContentPane().setBackground(Color.yellow);

    }

}

class V extends JFrame{

    V(){
        setLayout(null);
        setSize(300,300);
        setDefaultCloseOperation(1);
        setLocationRelativeTo(null);

        getContentPane().setBackground(Color.green);

    }

}