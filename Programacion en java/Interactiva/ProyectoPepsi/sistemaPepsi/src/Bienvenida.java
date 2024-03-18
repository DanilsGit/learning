import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Bienvenida extends JFrame implements ActionListener {

    private JLabel img1, lbl1, lbl2, lbl3;
    private JTextField filltxt = new JTextField();
    private JButton ingresar = new JButton("Ingresar");

    

    public static String nombre="";

    Bienvenida() {
        // Propiedades
        setLayout(null);
        setTitle("Bienvenido");
        setSize(500, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setBackground(new Color(0, 92, 184));
        setIconImage(new ImageIcon(getClass().getResource("imagenes/icono1.png")).getImage());
        setDefaultCloseOperation(3);

        // Componentes

        // Imagen 
        ImageIcon imagen = new ImageIcon(getClass().getResource("imagenes/img1.png"));
        img1 = new JLabel(imagen);
        add(img1);
        img1.setBounds(118, 20, 250, 200);

        // Texto 1
        lbl1 = new JLabel("Sistema de control vacacional");
        add(lbl1);
        lbl1.setBounds(100, 230, 300, 30);
        lbl1.setFont(new Font("Andale Mono", 3, 20));
        lbl1.setForeground(new Color(255, 255, 255));

        // Texto sobre campo de texto
        lbl2 = new JLabel("Ingrese su usuario: ");
        add(lbl2);
        lbl2.setBounds(92, 310, 200, 30);
        lbl2.setFont(new Font("Andale Mono", 1, 15));
        lbl2.setForeground(new Color(255, 255, 255));

        // Campo de texto
        add(filltxt);
        filltxt.setBounds(92, 340, 300, 30);
        filltxt.setBackground(new Color(220, 220, 220));
        filltxt.setFont(new Font("Andale Mono", 1, 15));
        filltxt.setForeground(new Color(39, 81, 184));

        // Boton
        add(ingresar);
        ingresar.setBounds(182, 380, 120, 35);
        ingresar.setBackground(new Color(220, 220, 220));
        ingresar.setForeground(new Color(39, 81, 184));
        ingresar.setFont(new Font("Andale Mono", 1, 15));
        ingresar.addActionListener(this);

        // Copyright
        lbl3 = new JLabel("© 2022 The Pepsi Company");
        add(lbl3);
        lbl3.setBounds(125, 530, 235, 30);
        lbl3.setFont(new Font("Andale Mono", 3, 18));
        lbl3.setForeground(new Color(255, 255, 255));

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        int seguro=1;

        if (e.getSource() == ingresar) {

            nombre = filltxt.getText().trim();
            if(nombre.equals("")){
                JOptionPane.showMessageDialog(null, "Debes ingresar un nombre", "Campo vacío", 2);
            }else{
                seguro = JOptionPane.showConfirmDialog(null, "¿Desea continuar como "+nombre+"?", "Confirmación", JOptionPane.OK_CANCEL_OPTION);
                
                if(seguro==0){
                    Terminos vterminos = new Terminos();
                    this.setVisible(false);
                }
            }

        }
    }

}

