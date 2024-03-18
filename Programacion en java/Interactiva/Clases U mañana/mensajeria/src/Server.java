import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {

    public static void main(String[] args) {
        Server servidor = new Server();
        servidor.start(5577);
    }
    
    private List<PrintWriter> clients;

    public void start(int port) {
        // Inicializar la lista de clientes
        clients = new ArrayList<>();
    
        // Iniciar el servidor en el puerto especificado
        try (ServerSocket serverSocket = new ServerSocket(port, 0, InetAddress.getByName("127.0.0.1"));) {
            System.out.println("El servidor está escuchando en el puerto " + port);
    
            // Aceptar conexiones entrantes
            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Nuevo cliente conectado: " + clientSocket);
    
                // Crear un nuevo hilo para manejar la comunicación con el cliente
                Thread t = new Thread(new ClientHandler(clientSocket));
                t.start();
            }
        } catch (IOException e) {
            System.out.println("Error al iniciar el servidor: " + e);
        }
    }


    private class ClientHandler implements Runnable {
        private Socket clientSocket;
    
        public ClientHandler(Socket socket) {
            this.clientSocket = socket;
        }
    
        @Override
        public void run() {
            
            try {

                // Agregar el nuevo cliente a la lista de clientes
                clients.add(new PrintWriter(clientSocket.getOutputStream(), true)); 

                // Crear un lector de entrada para recibir mensajes del cliente
                BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    
                // Leer mensajes del cliente hasta que se desconecte
                while (true) {
                    String message = input.readLine();
                    if (message == null) {
                        break;
                    }
    
                    // Enviar el mensaje a todos los clientes
                    for (PrintWriter client : clients) {
                        client.println(message);
                    }
                }
            } catch (IOException e) {
                System.out.println("Error al leer del cliente: " + e);
            } finally {
                // Eliminar al cliente de la lista de clientes
                try {
                    clients.remove(new PrintWriter(clientSocket.getOutputStream(), true));
                    clientSocket.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar la conexión con el cliente: " + e);
                }
            }
        }
    }
}    


