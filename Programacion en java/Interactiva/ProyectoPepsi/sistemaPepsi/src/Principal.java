import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Principal extends JFrame implements ActionListener, MouseListener {

    private JMenuBar barraNav;
    private JMenu menuOpc, menuAcerca, menuColorFondo;
    private JMenuItem nuevo, salir, cRojo, cAzul, cMorado, version, creador;

    private JLabel lblLogo, lblBienvenido, lblBienvenidoNombre, lblTitulo, lblNombre, lblPA, lblSA, lblDepartamento, lblAntiguedad, lblResultado, lblFooter;

    private JTextField txtNombre, txtPA, txtSA;

    private JComboBox boxDepartamento, boxAntiguedad;

    private JButton calcularV = new JButton("Calcular Vacaciones");

    private JScrollPane scroll1;
    private JTextArea txtArea1;

    private String texto = "";

    Principal() {
        // Propiedades
        setLayout(null);
        setTitle("Cálculo de vacaciones");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setBackground(new Color(0, 92, 184));
        setIconImage(new ImageIcon(getClass().getResource("imagenes/icono1.png")).getImage());
        setDefaultCloseOperation(3);

        texto = Bienvenida.nombre;

        //Componentes

        //MENÚS ------------------------------------------------------------

        //Barra de navegacion
        barraNav = new JMenuBar();
        barraNav.setBackground(new Color(39, 81, 184));
        setJMenuBar(barraNav);

        //Menu de opciones
        menuOpc = new JMenu("Opciones");
        menuOpc.setBackground(new Color(39, 81, 184));
        menuOpc.setFont(new Font("Andale Mono", 1, 15));
        menuOpc.setForeground(new Color(255,255,255));
        barraNav.add(menuOpc); menuOpc.addMouseListener(this);

        //Submenu en opciones
        menuColorFondo = new JMenu("Color de fondo");
        menuColorFondo.setFont(new Font("Andale Mono", 1, 15));
        menuColorFondo.setForeground(new Color(39,81,184));
        menuOpc.add(menuColorFondo);

        //Items en submenu menuColorFondo

        //Rojo
        cRojo = new JMenuItem("Rojo");
        cRojo.setFont(new Font("Andale Mono", 1, 15));
        cRojo.setForeground(new Color(39,81,184));
        menuColorFondo.add(cRojo); cRojo.addActionListener(this);

        //Azul
        cAzul = new JMenuItem("Azul");
        cAzul.setFont(new Font("Andale Mono", 1, 15));
        cAzul.setForeground(new Color(39,81,184));
        menuColorFondo.add(cAzul); cAzul.addActionListener(this);

        //Morado
        cMorado = new JMenuItem("Morado");
        cMorado.setFont(new Font("Andale Mono", 1, 15));
        cMorado.setForeground(new Color(39,81,184));
        menuColorFondo.add(cMorado); cMorado.addActionListener(this);

        //Items en menu de opciones
        
        //Nuevo
        nuevo = new JMenuItem("Nuevo");
        nuevo.setFont(new Font("Andale Mono", 1, 15));
        nuevo.setForeground(new Color(39,81,184));
        menuOpc.add(nuevo); nuevo.addActionListener(this);

        //Salir
        salir = new JMenuItem("Cerrar sesión");
        salir.setFont(new Font("Andale Mono", 1, 15));
        salir.setForeground(new Color(39,81,184));
        menuOpc.add(salir); salir.addActionListener(this);

        //Menu Acerca de
        menuAcerca = new JMenu("Acerca de");
        menuAcerca.setBackground(new Color(39, 81, 184));
        menuAcerca.setFont(new Font("Andale Mono", 1, 15));
        menuAcerca.setForeground(new Color(255,255,255));
        barraNav.add(menuAcerca); menuAcerca.addMouseListener(this);

        //Items en Acerca de

        //Version
        version = new JMenuItem("Versión");
        version.setFont(new Font("Andale Mono", 1, 15));
        version.setForeground(new Color(39,81,184));
        menuAcerca.add(version); version.addActionListener(this);

        //Creador
        creador = new JMenuItem("Creador");
        creador.setFont(new Font("Andale Mono", 1, 15));
        creador.setForeground(new Color(39,81,184));
        menuAcerca.add(creador); creador.addActionListener(this);

        // IMAGENES Y ETIQUETAS ----------------------------------------------------

        //Imgen
        ImageIcon imagen = new ImageIcon(getClass().getResource("imagenes/principal.png"));
        lblLogo = new JLabel(imagen);
        add(lblLogo);
        lblLogo.setBounds(10, 10, 400, 153);

        //lblBienvenido
        lblBienvenido = new JLabel("Bienvenido");
        add(lblBienvenido);
        lblBienvenido.setFont(new Font("Andale Mono", 1, 40));
        lblBienvenido.setBounds(420, 20, 400, 40);
        lblBienvenido.setForeground(new Color(255,255,255));

        //lblBienvenidoNombre
        lblBienvenidoNombre = new JLabel(texto);
        add(lblBienvenidoNombre);
        lblBienvenidoNombre.setFont(new Font("Andale Mono", 1, 25));
        lblBienvenidoNombre.setBounds(420, 80, 400, 40);
        lblBienvenidoNombre.setForeground(new Color(255,255,255));



        //lblTitulo
        lblTitulo = new JLabel("CALCULAR VACACIONES DEL TRABAJADOR");
        add(lblTitulo);
        lblTitulo.setFont(new Font("Andale Mono", 1, 20));
        lblTitulo.setBounds(180, 180, 426, 30);
        lblTitulo.setForeground(new Color(255,255,255));

        //Lbl y txtfield de nombre
        lblNombre = new JLabel("Nombre: ");
        add(lblNombre);
        lblNombre.setFont(new Font("Andale Mono", 1, 14));
        lblNombre.setBounds(30, 250, 200, 20);
        lblNombre.setForeground(new Color(255,255,255));

        txtNombre = new JTextField();
        add(txtNombre);
        txtNombre.setFont(new Font("Andale Mono", 1, 15));
        txtNombre.setBounds(30, 270, 210, 25);
        txtNombre.setForeground(new Color(39,81,184));

        //Lbl y txtfield de Primer Apellido
        lblPA = new JLabel("Primer apellido: ");
        add(lblPA);
        lblPA.setFont(new Font("Andale Mono", 1, 14));
        lblPA.setBounds(280, 250, 200, 20);
        lblPA.setForeground(new Color(255,255,255));

        txtPA = new JTextField();
        add(txtPA);
        txtPA.setFont(new Font("Andale Mono", 1, 15));
        txtPA.setBounds(280, 270, 210, 25);
        txtPA.setForeground(new Color(39,81,184));

        //Lbl y txtfield de Segundo Apellido
        lblSA = new JLabel("Segundo apellido: ");
        add(lblSA);
        lblSA.setFont(new Font("Andale Mono", 1, 14));
        lblSA.setBounds(530, 250, 200, 20);
        lblSA.setForeground(new Color(255,255,255));

        txtSA = new JTextField();
        add(txtSA);
        txtSA.setFont(new Font("Andale Mono", 1, 15));
        txtSA.setBounds(530, 270, 210, 25);
        txtSA.setForeground(new Color(39,81,184));

        //Lbl y combobox de departamento
        lblDepartamento = new JLabel("Departamento de trabajo: ");
        add(lblDepartamento);
        lblDepartamento.setFont(new Font("Andale Mono", 1, 14));
        lblDepartamento.setBounds(30, 310, 200, 20);
        lblDepartamento.setForeground(new Color(255,255,255));

        boxDepartamento = new JComboBox<>();
        add(boxDepartamento);
        boxDepartamento.setFont(new Font("Andale Mono", 1, 15));
        boxDepartamento.setBounds(30, 330, 210, 25);
        boxDepartamento.setForeground(new Color(39,81,184));
        boxDepartamento.addItem("");
        boxDepartamento.addItem("Atención al cliente");
        boxDepartamento.addItem("Departamento de logística");
        boxDepartamento.addItem("Departamento de Gerencia");

        //Lbl y combobox de antiguedad
        lblAntiguedad = new JLabel("Antiguedad en la empresa: ");
        add(lblAntiguedad);
        lblAntiguedad.setFont(new Font("Andale Mono", 1, 14));
        lblAntiguedad.setBounds(280, 310, 200, 20);
        lblAntiguedad.setForeground(new Color(255,255,255));

        boxAntiguedad = new JComboBox<>();
        add(boxAntiguedad);
        boxAntiguedad.setFont(new Font("Andale Mono", 1, 15));
        boxAntiguedad.setBounds(280, 330, 210, 25);
        boxAntiguedad.setForeground(new Color(39,81,184));
        boxAntiguedad.addItem("");
        boxAntiguedad.addItem("1 año de servicio");
        boxAntiguedad.addItem("2 a 6 años de servicio");
        boxAntiguedad.addItem("7 o más años de servicio");

        //Lbl y txtArea del resultado
        lblResultado = new JLabel("Resultado para sus vacaciones: ");
        add(lblResultado);
        lblResultado.setFont(new Font("Andale Mono", 1, 14));
        lblResultado.setBounds(30, 370, 300, 20);
        lblResultado.setForeground(new Color(255,255,255));

        txtArea1 = new JTextArea();
        txtArea1.setEditable(false);
        txtArea1.setFont(new Font("Andale Mono", 1, 15));
        txtArea1.setForeground(new Color(39,81,184));
        txtArea1.setText("\n\n        Aquí aparecerá el calculo de sus vacaciones.");

        scroll1 = new JScrollPane(txtArea1);
        add(scroll1);
        scroll1.setBounds(30, 390, 600, 100);

        //Boton para calcular
        calcularV = new JButton("Calcular");
        add(calcularV);
        calcularV.setBounds(560, 320, 150, 40);
        calcularV.setFont(new Font("Andale Mono", 1, 14));
        calcularV.setForeground(new Color(39,81,184));
        calcularV.addActionListener(this);


        //lbl footer
        lblFooter = new JLabel("©2022 The Pepsi Company | Todos los derechos reservados");
        add(lblFooter);
        lblFooter.setFont(new Font("Andale Mono", 1, 16));
        lblFooter.setBounds(163, 510, 460, 20);
        lblFooter.setForeground(new Color(255,255,255));


        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
        if(e.getSource() == calcularV){

            String nombreT = txtNombre.getText();
            String PA = txtPA.getText();
            String SA = txtSA.getText();
            String departamento = boxDepartamento.getSelectedItem().toString();
            String antiguedad = boxAntiguedad.getSelectedItem().toString();

            if(nombreT.equals("") || PA.equals("") || SA.equals("") || departamento.equals("") || antiguedad.equals("")){

                JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos", "Campos sin llenar", 2);

            }else{

                if(departamento.equals("Atención al cliente")){

                    if(antiguedad.equals("1 año de servicio")){

                        txtArea1.setText("\n   El trabajador "+nombreT+" "+PA+" "+SA+" "
                                        +"\n   quien labora en "+departamento+" con "+antiguedad
                                        +"\n   recibe 6 días de vacaciones");

                    }
                    if(antiguedad.equals("2 a 6 años de servicio")){

                        txtArea1.setText("\n   El trabajador "+nombreT+" "+PA+" "+SA+" "
                                        +"\n   quien labora en "+departamento+" con "+antiguedad
                                        +"\n   recibe 14 días de vacaciones");

                    }
                    if(antiguedad.equals("7 o más años de servicio")){

                        txtArea1.setText("\n   El trabajador "+nombreT+" "+PA+" "+SA+" "
                                        +"\n   quien labora en "+departamento+" con "+antiguedad
                                        +"\n   recibe 20 días de vacaciones");

                    }

                }
                if(departamento.equals("Departamento de logística")){

                    if(antiguedad.equals("1 año de servicio")){

                        txtArea1.setText("\n   El trabajador "+nombreT+" "+PA+" "+SA+" "
                                        +"\n   quien labora en "+departamento+" con "+antiguedad
                                        +"\n   recibe 9 días de vacaciones");

                    }
                    if(antiguedad.equals("2 a 6 años de servicio")){

                        txtArea1.setText("\n   El trabajador "+nombreT+" "+PA+" "+SA+" "
                                        +"\n   quien labora en "+departamento+" con "+antiguedad
                                        +"\n   recibe 19 días de vacaciones");

                    }
                    if(antiguedad.equals("7 o más años de servicio")){

                        txtArea1.setText("\n   El trabajador "+nombreT+" "+PA+" "+SA+" "
                                        +"\n   quien labora en "+departamento+" con "+antiguedad
                                        +"\n   recibe 27 días de vacaciones");

                    }
                    
                }
                if(departamento.equals("Departamento de Gerencia")){

                    if(antiguedad.equals("1 año de servicio")){

                        txtArea1.setText("\n   El trabajador "+nombreT+" "+PA+" "+SA+" "
                                        +"\n   quien labora en "+departamento+" con "+antiguedad
                                        +"\n   recibe 13 días de vacaciones");

                    }
                    if(antiguedad.equals("2 a 6 años de servicio")){

                        txtArea1.setText("\n   El trabajador "+nombreT+" "+PA+" "+SA+" "
                                        +"\n   quien labora en "+departamento+" con "+antiguedad
                                        +"\n   recibe 24 días de vacaciones");

                    }
                    if(antiguedad.equals("7 o más años de servicio")){

                        txtArea1.setText("\n   El trabajador "+nombreT+" "+PA+" "+SA+" "
                                        +"\n   quien labora en "+departamento+" con "+antiguedad
                                        +"\n   recibe 30 días de vacaciones");

                    }
                    
                }

            }


        }
        
        if(e.getSource() == nuevo){
            txtNombre.setText("");
            txtPA.setText("");
            txtSA.setText("");
            boxDepartamento.setSelectedIndex(0);
            boxAntiguedad.setSelectedIndex(0);
            txtArea1.setText("\n\n        Aquí aparecerá el calculo de sus vacaciones.");
        }
        
        if(e.getSource() == salir){
            Bienvenida vBienvenida = new Bienvenida();
            this.setVisible(false);
        }
        
        if(e.getSource() == cRojo){
            getContentPane().setBackground(new Color(201,0,44));
        }
        
        if(e.getSource() == cAzul){
            getContentPane().setBackground(new Color(0, 92, 184));
        }
        
        if(e.getSource() == cMorado){
            getContentPane().setBackground(new Color(51,0,51));
        }
        
        if(e.getSource() == version){
            JOptionPane.showMessageDialog(null, "Versión 1.0 de la aplicación, creada el 16 de octubre de 2022", "Versión",1);
        }
        
        if(e.getSource() == creador){
            JOptionPane.showMessageDialog(null, "Aplicación hecha por Daniel Esteban Marquez Upegui", "Creador",1);
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == menuOpc){
            menuOpc.setForeground(new Color(30, 140, 200));
        }
        if(e.getSource() == menuAcerca){
            menuAcerca.setForeground(new Color(30, 140, 184));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == menuOpc){
            menuOpc.setForeground(new Color(255,255,255));
        }
        if(e.getSource() == menuAcerca){
            menuAcerca.setForeground(new Color(255,255,255));
        }
        
    }

}

