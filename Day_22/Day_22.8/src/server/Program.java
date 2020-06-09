package server;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Scanner;

public class Program {
	public static int PORT = 6021;

	public static void main(String[] args) {
		try (DatagramSocket ds = new DatagramSocket(PORT); Scanner sc = new Scanner(System.in);) {

			String text;
			byte[] buff;
			while (true) {
				buff = new byte[1024];
				DatagramPacket receivePacket = new DatagramPacket(buff, buff.length);
				ds.receive(receivePacket);
				text = new String(receivePacket.getData());
				System.out.println("S:Client	:	" + text);

				System.out.print("S:Server	:	");
				text = sc.nextLine();
				buff = text.getBytes();
				DatagramPacket sendPacket = new DatagramPacket(buff, buff.length, receivePacket.getAddress(),
						receivePacket.getPort());
				ds.send(sendPacket);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
