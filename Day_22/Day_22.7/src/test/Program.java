package test;

public class Program {
	public static void main(String[] args) {
		byte[] bs = new byte[ ] { 97, 98, 99 };
		String str = new String(bs);
		System.out.println(str);
	}
	public static void main1(String[] args) {
		String str = "ABC";
		byte[] bs = str.getBytes();
		for (byte b : bs) {
			System.out.println(b);
		}
	}
}
