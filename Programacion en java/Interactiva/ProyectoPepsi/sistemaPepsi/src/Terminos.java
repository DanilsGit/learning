import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Terminos extends JFrame implements ActionListener, ChangeListener {

    private JLabel img1, lbl1;
    private JCheckBox casilla1;
    private JButton btn1, btn2;
    private JScrollPane scroll1;
    private JTextArea txtArea = new JTextArea();;

    private String texto = "";

    String txtTerminos = "\n\n          TÉRMINOS Y CONDICIONES"

            + "\n\n          Limitación de responsabilidad"
            + "\n          EN NINGÚN CASO Y BAJO NINGUNA TEORÍA LEGAL O EQUITATIVA, YA SEA POR AGRAVIO,"
            + "\n          CONTRATO, RESPONSABILIDAD ESTRICTA U OTRO TIPO, PEPSICO SERÁ RESPONSABLE DE "
            + "\n          CUALQUIER DAÑO DIRECTO, INDIRECTO, ESPECIAL, INCIDENTAL O CONSECUENTE QUE "
            + "\n          SURJA DEL USO DE LA INFORMACIÓN CONTENIDA EN EL PRESENTE DOCUMENTO, "
            + "\n          INCLUYENDO , SIN LIMITACIÓN, DAÑOS POR PÉRDIDA DE BENEFICIOS, PÉRDIDA DE FONDO "
            + "\n          DE COMERCIO, PÉRDIDA DE DATOS, PARALIZACIÓN DEL TRABAJO, EXACTITUD DE LOS "
            + "\n          RESULTADOS O FALLA O MAL FUNCIONAMIENTO DE LA COMPUTADORA."

            + "\n\n          USTED RECONOCE Y ACEPTA ESPECÍFICAMENTE QUE NI PEPSICO NI SUS PROVEEDORES "
            + "\n          SERÁN RESPONSABLES DE CUALQUIER CONDUCTA DIFAMATORIA, OFENSIVA O ILEGAL DE "
            + "\n          CUALQUIER USUARIO DEL SITIO. SU ÚNICO Y EXCLUSIVO RECURSO PARA CUALQUIERA DE "
            + "\n          LAS RECLAMACIONES ANTERIORES O CUALQUIER DISPUTA CON PEPSICO ES DEJAR DE "
            + "\n          UTILIZAR EL SITIO. USTED Y PEPSICO ACEPTAN QUE CUALQUIER CAUSA DE ACCIÓN QUE "
            + "\n          SURJA O ESTÉ RELACIONADA CON EL SITIO DEBE COMENZAR DENTRO DE UN (1) AÑO "
            + "\n          DESPUÉS DE QUE LA CAUSA DE LA ACCIÓN SE ACUMULE O LA CAUSA DE LA ACCIÓN SE "
            + "\n          PROHIBA PERMANENTEMENTE. DEBIDO A QUE ALGUNAS JURISDICCIONES NO PERMITEN "
            + "\n          LIMITACIONES SOBRE LA DURACIÓN DE UNA GARANTÍA IMPLÍCITA, O LA EXCLUSIÓN "
            + "\n          O LIMITACIÓN DE RESPONSABILIDAD POR DAÑOS CONSECUENTES O INCIDENTALES, "
            + "\n          LA TOTALIDAD O UNA PARTE DE LA LIMITACIÓN ANTERIOR PUEDE NO APLICAR EN SU CASO."

            + "\n\n          Indemnización"
            + "\n          Usted acepta defender, indemnizar y eximir a PepsiCo de cualquier reclamo, daño, costo y gasto, "
            + "\n          incluidos los honorarios de abogados, que surjan y estén relacionados con su uso de la aplicación."

            + "\n\n          Aviso de copyright"
            + "\n          A menos que se indique lo contrario, las imágenes gráficas, los botones y el texto contenidos en"
            + "\n          este Sitio son propiedad exclusiva de PepsiCo y sus subsidiarias. Excepto para uso personal, estos"
            + "\n          elementos no pueden copiarse, distribuirse, mostrarse, reproducirse ni transmitirse de ninguna"
            + "\n          forma ni por ningún medio, ya sea electrónico, mecánico, fotocopiado, grabación o cualquier otro"
            + "\n          sin el permiso previo por escrito de PepsiCo."

            + "\n\n          Marcas registradas"
            + "\n          Esta aplicación presenta logotipos, identidades de marca y otras marcas comerciales y marcas de "
            + "\n          servicio (colectivamente, las 'Marcas') que son propiedad de PepsiCo y sus subsidiarias o sus "
            + "\n          otorgantes de licencias o proveedores de contenido. Todas estas Marcas son propiedad de sus "
            + "\n          respectivos dueños. Nada de lo contenido en esta aplicación debe interpretarse como una "
            + "\n          concesión,  por implicación, impedimento legal o de otro modo, de cualquier licencia o derecho "
            + "\n          para usar cualquier Marca que se muestre en este Sitio sin el permiso por escrito de PepsiCo "
            + "\n          o de cualquier tercero que pueda ser propietario de una Marca que se muestre en la aplicación. "
            + "\n          PepsiCo se reserva todos los derechos no otorgados expresamente en y para la aplicación y su "
            + "\n          contenido. Esta aplicación y todo su contenido, incluidos, entre otros, texto, diseño, gráficos, "
            + "\n          interfaces y código, y la selección y disposición de los mismos\n\n";

    Terminos() {
        // Propiedades
        setLayout(null);
        setTitle("TÉRMINOS DE USO");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("imagenes/icono1.png")).getImage());
        setDefaultCloseOperation(3);

        texto = Bienvenida.nombre;

        // Componentes

        // Texto 1
        lbl1 = new JLabel("TÉRMINOS Y CONDICIONES");
        lbl1.setBounds(208, 10, 268, 30);
        lbl1.setFont(new Font("Andale Mono", 1, 20));
        lbl1.setForeground(new Color(0, 0, 0));
        add(lbl1);

        // Area de texto
        txtArea.setText(txtTerminos);
        txtArea.setFont(new Font("Andale Mono", 0, 12));
        txtArea.setEditable(false);
        scroll1 = new JScrollPane(txtArea);
        scroll1.setBounds(43, 50, 600, 300);
        add(scroll1);
        txtArea.setSelectionStart(0);
        txtArea.setSelectionEnd(0);
        

        // Casilla 1
        casilla1 = new JCheckBox("Yo "+texto+" acepto");
        casilla1.setBounds(43, 360, 330, 20);
        casilla1.setFont(new Font("Andale Mono", 1, 13));
        add(casilla1);
        casilla1.addChangeListener(this);

        // Boton para continuar
        btn1 = new JButton("Continuar");
        btn1.setBounds(43, 400, 150, 30);
        btn1.setFont(new Font("Andale Mono", 1, 13));
        btn1.setEnabled(false);
        add(btn1);
        btn1.addActionListener(this);

        // Boton para no aceptar
        btn2 = new JButton("No aceptar");
        btn2.setBounds(210, 400, 150, 30);
        btn2.setFont(new Font("Andale Mono", 1, 13));
        add(btn2);
        btn2.addActionListener(this);

        // Imagen
        ImageIcon imagen = new ImageIcon(getClass().getResource("imagenes/terminos.png"));
        img1 = new JLabel(imagen);
        add(img1);
        img1.setBounds(400, 355, 250, 100);

        setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        // TODO Auto-generated method stub
        if (casilla1.isSelected()) {
            btn1.setEnabled(true);
            btn2.setEnabled(false);
        } else {
            btn1.setEnabled(false);
            btn2.setEnabled(true);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        if(e.getSource() == btn1){
            Principal vPrincipal = new Principal();
            this.setVisible(false);
        }
        else if(e.getSource() == btn2){
            Bienvenida vBienvenida = new Bienvenida();
            this.setVisible(false);
        }

    }

}

