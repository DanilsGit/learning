import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class App {
    public static void main(String[] args) throws Exception {

        connectBD miBD = new connectBD();
        Thread t = new Thread(miBD);
        t.start();
        t.join();

        miBD.select();

    }
}

class connectBD implements Runnable {

    Connection connect = null;
    Statement state = null;

    String request;
    int n;

    @Override
    public void run() {

        // Conección a la base de datos
        try {
            connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/BDestudiantes", "postgres", "123");
            connect.setAutoCommit(false);
            state = connect.createStatement();
            System.out.println("Se ha establecido la conección con la BD");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void insert() {

        // INSERTAR REGISTROS
        request = "INSERT INTO estudiantes (nombre, nacimiento) VALUES ('raul','20/01/2005');";
        try {
            state.executeUpdate(request);
            connect.commit();
            System.out.println("He insertado");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void select() {
        
        // CONSULTAR REGISTROS
        request = "SELECT id, nombre, nacimiento FROM estudiantes;";
        try {
            ResultSet result = state.executeQuery(request);
            DefaultTableModel template = new DefaultTableModel();
            template.addColumn("id");
            template.addColumn("nombre");
            template.addColumn("Fecha de nacimiento");

            while(result.next()){
                Object row[] = new Object[template.getColumnCount()];
                for (int i = 0; i < row.length; i++) {
                    row[i] = result.getObject(i+1);
                }
                template.addRow(row);
            }

            JTable table = new JTable(template);
            JScrollPane scroll = new JScrollPane(table);
            JOptionPane.showMessageDialog(null, scroll);
            System.out.println("He mostrado la tabla");
        } catch (SQLException e) {
            System.out.println("Error!" + e.getMessage());
        }

    }

    public void modify() {
        // MODIFICAR REGISTROS
        n = 2;
        request = "UPDATE estudiantes SET nombre='gonzalo' WHERE id= " + n + " ;";
        try {
            state.executeUpdate(request);
            connect.commit();
            System.out.println("He modificado");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void delete() {
        // BORRAR REGISTROS
        n = 3;
        //request = "DELETE FROM estudiantes WHERE (id= " + n + " AND nombre='perez') ;";
        request = "DELETE FROM estudiantes WHERE (id > 0 ) ;";
        try {
            state.executeUpdate(request);
            System.out.println("He Borrado");
            connect.commit();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}