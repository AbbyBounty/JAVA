package test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Program {
	public static void main(String[] args) {
		try {
			InetAddress localhost = InetAddress.getByName("localhost");
			String hostName = localhost.getHostName();
			String hostAddress =  localhost.getHostAddress();
			System.out.println("Host Name	:	"+hostName);
			System.out.println("Host Address	:	"+hostAddress);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	public static void main1(String[] args) {
		try {
			InetAddress localhost = InetAddress.getLocalHost();
			String hostName = localhost.getHostName();
			String hostAddress =  localhost.getHostAddress();
			System.out.println("Host Name	:	"+hostName);
			System.out.println("Host Address	:	"+hostAddress);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
