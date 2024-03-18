import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Container;
import java.awt.Color;

public class App {
    public static void main(String[] args) throws Exception {
        Marco ventana = new Marco();
        ventana.setTitle("Ventana de menú");
    }
}

class Marco extends JFrame implements ActionListener{

    //Contenedor
    
    //Barra de navegacion
    private JMenuBar barramenu = new JMenuBar();

    //Desplegable 1
    private JMenu menu1 = new JMenu("Opciones");
    private JMenuItem NuevoA, AbrirA, Guardar, GuardarC;
    //Desplegable 2
    private JMenu menu2 = new JMenu("Configuración");
    private JMenuItem ColorF, NombreV, tamV, Reiniciar;
    //Desplegable 3
    private JMenu menu3 = new JMenu("Ayuda");
    private JMenuItem Sobre, Creador;

    Container fondo = this.getContentPane();

    Marco(){
        //Propiedades
        setLayout(null);
        setBounds(0, 0, 500, 500);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);

        //Componentes
        setJMenuBar(barramenu);
        barramenu.add(menu1);
        barramenu.add(menu2);
        barramenu.add(menu3);

        //Menu 1
        NuevoA = new JMenuItem("Nuevo archivo");        
        menu1.add(NuevoA);  

        AbrirA = new JMenuItem("Abrir archivo");        
        menu1.add(AbrirA);  

        Guardar = new JMenuItem("Guardar");             
        menu1.add(Guardar);

        GuardarC = new JMenuItem("Guardar como...");    
        menu1.add(GuardarC);

        //Menu2
        ColorF = new JMenuItem("Color de fondo");               
        menu2.add(ColorF); ColorF.addActionListener(this);

        NombreV = new JMenuItem("Nombre de la ventana");        
        menu2.add(NombreV); NombreV.addActionListener(this);

        tamV = new JMenuItem("Tamaño de la ventana");           
        menu2.add(tamV); tamV.addActionListener(this);

        Reiniciar = new JMenuItem("Reiniciar configuracion");   
        menu2.add(Reiniciar); Reiniciar.addActionListener(this);

        //Menu3
        Sobre = new JMenuItem("Acerca de...");  
        menu3.add(Sobre); Sobre.addActionListener(this);

        Creador = new JMenuItem("Creador");     
        menu3.add(Creador); Creador.addActionListener(this);


        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
        if(e.getSource() == ColorF){
            
            try{
                int n = Integer.parseInt(JOptionPane.showInputDialog("Digite el color que desea para el fondo: \n 1. Rojo \n 2. Verde \n 3. Azul \n 4. Blanco \n 5. Negro"));
            
                Color color = new Color(238,238,238);

                switch(n){
                    case 1: color = new Color(250,0,0); break; //Rojo
                    case 2: color = new Color(0,250,0); break; //Verde
                    case 3: color = new Color(0,0,250); break; //Azul
                    case 4: color = new Color(250,250,250); break; //Blanco
                    case 5: color = new Color(0,0,0); break; //Negro
                    default: JOptionPane.showMessageDialog(null, "Color no reconocido", "ERROR", 2); break;
                }
                fondo.setBackground(color);
            
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Ingrese un valor válido", "ERROR", 2);
            }
            

            
        }
        
        if(e.getSource() == NombreV){
            String tmp = JOptionPane.showInputDialog(null,"Digite el nuevo nombre de la ventana","Nombre de la ventana",1);
            if(!(tmp.equals(""))){
                setTitle(tmp);
            }
            
            
        }

        if(e.getSource() == tamV){
            int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la anchura", "Anchura de la ventana",1));
            int h = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la altura", "Altura de la ventana",1));
            setSize(a,h);
            setLocationRelativeTo(null);

        }

        if(e.getSource() == Reiniciar){
            setTitle("Ventana de menú");
            setSize(500,500);
            fondo.setBackground(new Color(238,238,238));
            setLocationRelativeTo(null);
        }

        if(e.getSource() == Sobre){
            JOptionPane.showMessageDialog(null, "Versión de la ventana 1.0 \nCreada el 14 de octubre de 2022","Acerca de la ventana",1);
        }

        if(e.getSource() == Creador){
            JOptionPane.showMessageDialog(null, "Ventana creada por Daniel Esteban Marquez Upegui","Creador de la venana",1);
        }
        
        
        
    }

}
