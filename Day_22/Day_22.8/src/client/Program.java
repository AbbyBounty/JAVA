package client;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Program {
	public static int PORT = 6021;

	public static void main(String[] args) {
		try (DatagramSocket ds = new DatagramSocket(); Scanner sc = new Scanner(System.in);) {

			String text;
			byte[] buff;
			while (true) {
				System.out.print("C:Client	:	");
				text = sc.nextLine();
				buff = text.getBytes();
				DatagramPacket sendPacket = new DatagramPacket(buff, buff.length, InetAddress.getLocalHost(), PORT);
				ds.send(sendPacket);

				buff = new byte[1024];
				DatagramPacket receivePacket = new DatagramPacket(buff, buff.length);
				ds.receive(receivePacket);
				text = new String(receivePacket.getData());
				System.out.println("C:Server	:	" + text);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
