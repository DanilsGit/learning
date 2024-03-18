import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class App {
    public static void main(String[] args) throws Exception {
        Marco ventana = new Marco();
        ventana.setVisible(true);
    }
}

class Marco extends JFrame {

    JLabel titulo;

    JLabel labelNotaEstudiante;
    JTextField fieldNotaEstudiante;

    JLabel labelIdAsignatura;
    JTextField fieldIdAsignatura;

    JLabel labelIdEstudiante;
    JTextField fieldIdEstudiante;

    JLabel labelTituloEstudiantes;

    JLabel labelTituloAsignaturas;

    JLabel labelNombreAsignatura;
    JTextField fieldNombreAsignatura;

    JLabel labelIdProfesor;
    JTextField fieldIdProfesor;

    JLabel labelTituloProfesores;

    JLabel labelNombreProfesor;
    JTextField fieldNombreProfesor;

    JButton addNota, addAsignatura, addProfesor;

    JPanel centralGrid, registroEstudiantes, registroAsignatiras, registroProfesores;

    Container containerTitulo;

    Marco() {
        setSize(1000, 300);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(0, 15));

        // Componentes
        containerTitulo = new Container();
        containerTitulo.setLayout(new FlowLayout(FlowLayout.CENTER));
        titulo = new JLabel("SISTEMA PARA ALMACENAR NOTAS, PROFESORES Y ASIGNATURAS");
        containerTitulo.add(titulo);
        add(containerTitulo, "North");

        ////////////////////////////////////////////////////////////////////
        centralGrid = new JPanel();
        centralGrid.setLayout(new GridLayout(3, 1, 5, 20));
        ////////////////////////////////////////////////////////////////////
        registroEstudiantes = new JPanel();
        registroEstudiantes.setLayout(new FlowLayout());

        labelTituloEstudiantes = new JLabel("REGISTRO DE NOTAS");

        labelNotaEstudiante = new JLabel("Nota :");
        fieldNotaEstudiante = new JTextField(5);

        labelIdEstudiante = new JLabel("Id del estudiante :");
        fieldIdEstudiante = new JTextField(7);

        labelIdAsignatura = new JLabel("Id de asignatura :");
        fieldIdAsignatura = new JTextField(7);

        registroEstudiantes.add(labelTituloEstudiantes);

        registroEstudiantes.add(labelNotaEstudiante);
        registroEstudiantes.add(fieldNotaEstudiante);

        registroEstudiantes.add(labelIdEstudiante);
        registroEstudiantes.add(fieldIdEstudiante);

        registroEstudiantes.add(labelIdAsignatura);
        registroEstudiantes.add(fieldIdAsignatura);

        addNota = new JButton("Añadir nota");
        addNota.addActionListener(new Acciones());

        registroEstudiantes.add(addNota);

        centralGrid.add(registroEstudiantes);
        //////////////////////////////////////////////////////////////////
        registroAsignatiras = new JPanel();
        registroAsignatiras.setLayout(new FlowLayout());

        labelTituloAsignaturas = new JLabel(" REGISTRAR ASIGNATURAS ");

        labelNombreAsignatura = new JLabel("Nombre de la asignatura :");
        fieldNombreAsignatura = new JTextField(20);

        labelIdProfesor = new JLabel("Id del profesor que la da :");
        fieldIdProfesor = new JTextField(7);

        registroAsignatiras.add(labelTituloAsignaturas);

        registroAsignatiras.add(labelNombreAsignatura);
        registroAsignatiras.add(fieldNombreAsignatura);

        registroAsignatiras.add(labelIdProfesor);
        registroAsignatiras.add(fieldIdProfesor);

        addAsignatura = new JButton("Añadir asignatura");
        addAsignatura.addActionListener(new Acciones());

        registroAsignatiras.add(addAsignatura);

        centralGrid.add(registroAsignatiras);
        ////////////////////////////////////////////////////////////////////
        registroProfesores = new JPanel();
        registroProfesores.setLayout(new FlowLayout());

        labelTituloProfesores = new JLabel(" REGISTRAR PROFESORES ");

        labelNombreProfesor = new JLabel("Nombre del profesor :");
        fieldNombreProfesor = new JTextField(20);

        registroProfesores.add(labelTituloProfesores);

        registroProfesores.add(labelNombreProfesor);
        registroProfesores.add(fieldNombreProfesor);

        addProfesor = new JButton("Añadir profesor");
        addProfesor.addActionListener(new Acciones());

        registroProfesores.add(addProfesor);

        centralGrid.add(registroProfesores);
        //

        add(centralGrid, "Center");
    }

    class Acciones implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            BDconnect miBD = new BDconnect();

            if (addNota == e.getSource()) {
                try{
                    float nota;
                    int idAsignatura, idEstudiante;
    
                    nota = Float.parseFloat(fieldNotaEstudiante.getText());
                    idEstudiante = Integer.parseInt(fieldIdEstudiante.getText());
                    idAsignatura = Integer.parseInt(fieldIdAsignatura.getText());
    
                    miBD.insertNota(nota, idEstudiante, idAsignatura);

                    fieldNotaEstudiante.setText("");
                    fieldIdEstudiante.setText("");
                    fieldIdAsignatura.setText("");
                    
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Carácteres inválidos en las casillas", "ERROR", 2);
                }

            }
            if (addAsignatura == e.getSource()) {

                try{
                    String nombre = fieldNombreAsignatura.getText();
                    int idProfesor = Integer.parseInt(fieldIdProfesor.getText());
    
                    miBD.insertAsignatura(nombre,idProfesor );

                    fieldNombreAsignatura.setText("");
                    fieldIdProfesor.setText("");
                    
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Carácteres inválidos en las casillas", "ERROR", 2);
                }

            }
            if (addProfesor == e.getSource()) {

                try{
                    String nombreProfesor = fieldNombreProfesor.getText();
    
                    miBD.insertProfesor(nombreProfesor);

                    fieldNombreProfesor.setText("");
                    
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Carácteres inválidos en las casillas", "ERROR", 2);
                }
            }

        }

    }

}

class BDconnect {

    Connection connect = null;
    Statement state = null;

    String request;

    BDconnect() {
        try {
            connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/BDalumnos", "postgres", "univalle");
            connect.setAutoCommit(false);
            state = connect.createStatement();
            System.out.println("Se ha establecido la conección con la BD");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void insertNota(float nota, int idEst, int idAsig) {

        // INSERTAR REGISTROS
        request = "INSERT INTO notas (nota, estudiante_id, asignatura_id) VALUES (?, ?, ?);";
        try {

            PreparedStatement pstate = connect.prepareStatement(request);
            pstate.setFloat(1, nota);
            pstate.setInt(2, idEst);
            pstate.setInt(3, idAsig);

            pstate.executeUpdate();
            connect.commit();
            JOptionPane.showMessageDialog(null,
                    "Se le ha agregado la nota " + nota + " al estudiante con id " + idEst + " correctamente",
                    "NOTA AGREGADA", 3);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Revisa nuevamente los campos ", "ERROR", 2);
        }

    }

    public void insertAsignatura(String nombreAsig, int idProfe) {

        // INSERTAR REGISTROS
        request = "INSERT INTO asignaturas (nombre, profesor_id) VALUES (?, ?);";
        try {

            PreparedStatement pstate = connect.prepareStatement(request);
            pstate.setString(1, nombreAsig);
            pstate.setInt(2, idProfe);

            pstate.executeUpdate();
            connect.commit();
            JOptionPane.showMessageDialog(null,
                    "Se le ha agregado la asignatura " + nombreAsig + " dada por el profesor con id " + idProfe + " correctamente",
                    "ASIGNATURA  AGREGADA", 3);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Revisa nuevamente los campos ", "ERROR", 2);
        }

    }

    public void insertProfesor(String nombreProfe) {

        // INSERTAR REGISTROS
        request = "INSERT INTO profesores (nombre) VALUES (?);";
        try {

            PreparedStatement pstate = connect.prepareStatement(request);
            pstate.setString(1, nombreProfe);

            pstate.executeUpdate();
            connect.commit();
            JOptionPane.showMessageDialog(null,
                    "Se le ha agregado el profesor " + nombreProfe + " correctamente",
                    "PROFESOR  AGREGADO", 3);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Revisa nuevamente los campos ", "ERROR", 2);
        }

    }




}