import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class App {
    public static void main(String[] args) throws Exception {
        Marco marco1 = new Marco();
        marco1.setTitle("Ventana");
    }
}

class Marco extends JFrame implements ActionListener{

    JComboBox R = new JComboBox<>();
    JComboBox G = new JComboBox<>();
    JComboBox B = new JComboBox<>();

    JButton boton = new JButton("Seleccionar Color");

    JLabel r = new JLabel("R :");
    JLabel g = new JLabel("G :");
    JLabel b = new JLabel("B :");

    Marco(){
        //Propiedades
        setLayout(null);
        setSize(500,200);
        setDefaultCloseOperation(3);
        setResizable(false);

        //Componentes

        add(r);
        r.setBounds(35,20,50,30);
        add(g);
        g.setBounds(35,60,50,30);
        add(b);
        b.setBounds(35,100,50,30);


        add(R);
        R.setBounds(60, 20, 100, 30);
        add(G);
        G.setBounds(60, 60, 100, 30);
        add(B);
        B.setBounds(60, 100, 100, 30);

        add(boton);
        boton.setBounds(300, 50, 150, 40);
        boton.addActionListener(this);

        //Items/elementos/texto para el combobox
        for(int i=1;i<=250;i++){
            R.addItem(i);
            G.addItem(i);
            B.addItem(i);
        }
        



        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == boton){
            boton.setBackground(new Color((int)(R.getSelectedItem()),(int)(G.getSelectedItem()),(int)(B.getSelectedItem())));
            boton.setForeground(Color.white);
        }
        
    }
}