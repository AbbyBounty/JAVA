package test;
public class Program {
	public static void main(String[] args) {
		String str = "SunBeam";
		str = str.concat("Pune");	
		System.out.println(str);	//SunBeamPune
	}
	public static void main5(String[] args) {
		String str = "SunBeam";
		str = str + "Pune";	
		System.out.println(str);	//SunBeamPune
	}
	public static void main4(String[] args)throws Exception {
		String s1 = "ABC";	//Ok
		String s2 = "ABC";	//Ok
		if( s1.equals(s2) )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Equal
	}
	public static void main3(String[] args)throws Exception {
		String s1 = "ABC";
		String s2 = "ABC";
		if( s1 == s2 )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Equal
	}
	public static void main2(String[] args)throws Exception {
		String s1 = new String( "ABC" );	//Ok
		String s2 = new String( "ABC" );	//Ok
		if( s1.equals(s2) )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Equal
	}
	public static void main1(String[] args)throws Exception {
		String s1 = new String( "ABC" );	//Ok
		String s2 = new String( "ABC" );	//Ok
		if( s1 == s2 )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		//Not Equal
	}
}
