import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Client {

    private JFrame frame;
    private JTextField messageField;
    private JTextArea messageArea;
    private JButton sendButton;
    private JPanel southPanel;
    private JPanel centerPanel;

    private boolean oprimido=false;
    private String message="Anónimo";

    private String name = "";

    public static void main(String[] args) {
        Client cliente = new Client("Jorge");
        cliente.gui();
        cliente.connect("127.0.0.1", 5577);

    }

    Client(String n){
        if(!n.equals("")){
            name=n;
        }else{
            name="Anonimo";
        }
    }
    Client(){
        name="Anonimo";
    }

    public void gui(){
        //Inicializar el JFrame y darle propiedades
        frame = new JFrame();
        frame.setSize(500,600);
        frame.setLayout(new BorderLayout(0,20));
        frame.setDefaultCloseOperation(3);

        //Inicializar los JPanel
        southPanel = new JPanel();
        centerPanel = new JPanel();

        //Inicializar los componentes y añadirlos a los paneles correspondientes

        //Zona zur
        messageField = new JTextField(30);
        sendButton = new JButton("  Enviar  ");
        southPanel.add(messageField);
        southPanel.add(sendButton);
        sendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(!messageField.getText().equals("")){
                    message=name+": "+messageField.getText();
                    oprimido=true;
                    messageField.setText("");
                }
            }
        });

        //Zona central

        centerPanel.setPreferredSize(new Dimension(300, 200));
        centerPanel.setLayout(new BorderLayout());

        messageArea = new JTextArea();
        messageArea.setLineWrap(true);
        messageArea.setEditable(false);
        JScrollPane chat = new JScrollPane(messageArea);
        
        //Border para el panel
        LineBorder lineBorder = new LineBorder(Color.BLACK, 2, true);
        centerPanel.setBorder(new TitledBorder(lineBorder,"Conversación"));
        centerPanel.add(chat, "Center");


        
        //Añadir los paneles al frame
        frame.add(southPanel,"South");
        frame.add(centerPanel,"Center");

        frame.setVisible(true);
    }

    public void connect(String serverAddress, int port) {

        try {

            // Crear un socket para conectarse al servidor
            Socket socket = new Socket(serverAddress, port);
            
            // Crear un lector de entrada para recibir mensajes del servidor
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Crear un escritor de salida para enviar mensajes al servidor
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            // Crear un hilo para leer mensajes del servidor
            Thread t = new Thread(new ServerHandler(input));
            t.start();

            while (true) {

                if(oprimido){
                    output.println(message);
                    System.out.println("Envié el mensaje "+message);
                    oprimido=false;
                }
                

            }
            
            
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("Error al conectarse con el servidor " + e);
        }
    }

    private class ServerHandler implements Runnable {
        private BufferedReader input;

        public ServerHandler(BufferedReader input) {
            this.input = input;
        }

        @Override
        public void run() {
            // Leer mensajes del servidor y mostrarlos en la consola
            try {
                while (true) {

                    String messageIn = input.readLine();
                    if (messageIn == null) {
                        break;
                    }

                    messageArea.setText(messageArea.getText() + messageIn + "\n");

                    System.out.println(messageArea);
                }
            } catch (IOException e) {
                System.out.println("Error al leer del servidor: " + e);
            }
        }
    }
}
