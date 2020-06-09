package server;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Program {
	public static final int PORT = 6620;

	public static void main(String[] args) {
		try (ServerSocket ss = new ServerSocket(PORT);
				Socket socket = ss.accept();
				DataInputStream inputStream = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
				DataOutputStream outputStream = new DataOutputStream(
						new BufferedOutputStream(socket.getOutputStream()));
				Scanner sc = new Scanner(System.in);) {
			String text = "";
			do {
				System.out.print("S:Sever	:	");
				text = sc.nextLine();
				outputStream.writeUTF(text);
				outputStream.flush();

				text = inputStream.readUTF();
				System.out.println("S:Client	:	" + text);
			} while (!text.equalsIgnoreCase("end"));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
