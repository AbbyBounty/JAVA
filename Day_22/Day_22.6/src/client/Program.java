package client;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Program {
	public static final int PORT = 6620;
	public static final String host = "localhost";

	public static void main(String[] args) {
		try (Socket s = new Socket(host, PORT);
				DataInputStream inputStream = new DataInputStream(new BufferedInputStream(s.getInputStream()));
				DataOutputStream outputStream = new DataOutputStream(new BufferedOutputStream(s.getOutputStream()));
				Scanner sc = new Scanner(System.in);) {
			String text;
			do {
				text = inputStream.readUTF();
				System.out.println("C:Server	:	" + text);

				System.out.print("C:Client	:	");
				text = sc.nextLine();
				outputStream.writeUTF(text);
				outputStream.flush();
			} while (!text.equalsIgnoreCase("end"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
