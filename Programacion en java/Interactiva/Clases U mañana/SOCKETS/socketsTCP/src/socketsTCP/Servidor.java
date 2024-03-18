package socketsTCP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ServerSocket servidor = null;
		Socket Scliente = null;
		DataInputStream in;
		DataOutputStream out;
		
		final int PUERTO = 5000;
		
		int nClientes=0;
		
		try {
			
			servidor = new  ServerSocket(PUERTO);
			System.out.println("Conexión abierta");
			
			while(true) {
				//Experamos que se conecte alguien
				Scliente = servidor.accept();
				nClientes++;
				System.out.println("Cliente "+nClientes+" conectado");
				
				
				in = new DataInputStream(Scliente.getInputStream());
				out = new DataOutputStream(Scliente.getOutputStream());
				
				//Mensaje leido por el servidor
				String mensaje = in.readUTF();
				System.out.println(mensaje);
				
				//Mensaje enviado del servidor al cliente
				out.writeUTF("hola! cliente "+nClientes+" - desde el servidor TCP");
				
				//Cerrar Socket
				Scliente.close();
				System.out.println("Cierre del Socket con el cliente "+nClientes+"\n");
			}
			
		}catch(IOException ex) {
			System.out.println("Conexión fallida "+ex.getMessage());
		}
		
	}

}
