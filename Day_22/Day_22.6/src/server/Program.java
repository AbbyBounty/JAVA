package server;

import java.net.ServerSocket;
import java.net.Socket;
public class Program {
	public static final int PORT = 6620;

	public static void main(String[] args) {
		try (ServerSocket ss = new ServerSocket(PORT);){
			while( true )
			{
				Socket socket = ss.accept();
				Runnable target = new CommunicationHandler(socket);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
