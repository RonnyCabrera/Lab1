package ec.edu.epn.redes.tcp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTCP {

	private static int PORT = 9090;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ServerSocket serverSocket = new ServerSocket (PORT); 	
		System.out.println("Servidor escuchando en puerto: " + PORT);
	
		try {
			while (true) {
				Socket socket = serverSocket.accept();
				
				try {
					PrintWriter output = new PrintWriter(socket.getOutputStream(),true);
					output.println("Ronny");
				}
				finally { 
					socket.close();
				}
			}
		}
		 finally{
			 serverSocket.close();
		 }
	}

}
