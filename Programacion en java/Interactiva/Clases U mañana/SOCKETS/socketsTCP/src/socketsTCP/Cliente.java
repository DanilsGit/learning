package socketsTCP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String HOST = "127.0.0.1";
		final int PUERTO = 5000;
		
		DataInputStream in;
		DataOutputStream out;
		
		try {
			
			Socket Scliente = new Socket(HOST, PUERTO);
			in = new DataInputStream(Scliente.getInputStream());
			out = new DataOutputStream(Scliente.getOutputStream());
			
			out.writeUTF("Servidor, soy yo xd");
			
			String mensaje = in.readUTF();
			System.out.println(mensaje);
			
			Scliente.close();
			
			
		}catch(IOException ex) {
			System.out.println("Conexi�n fallida "+ex.getMessage());
		}
	}

}
