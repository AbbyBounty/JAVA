package test;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Scanner;

class Convert{
	public static Object changeType( String value, String type ) {
		switch( type ) {
		case "int":
			return Integer.parseInt(value);
		case "float":
			return Float.parseFloat(value);
		case "double":
			return Double.parseDouble(value);
		}
		return null;
	}
}
public class Program {
	public static void main(String[] args) {
		try( Scanner sc = new Scanner(System.in)){
			System.out.print("F.Q. Class Name	:	");
			String className = sc.nextLine();	//math.Calculator
			Class<?> c = Class.forName(className);
			
			System.out.print("Method Name	:	");
			String mathodName = sc.nextLine();
			Method[] methods = c.getMethods();
			for (Method method : methods) {
				if( method.getName().equals(mathodName)) {
					Parameter[] pms = method.getParameters();
					Object[] arr = new Object[ method.getParameterCount() ];
					for( int index = 0; index <method.getParameterCount(); ++ index )
					{
						String type = pms[ index ].getType().getName();
						System.out.print("Enter value for argument of "+type+" : ");
						String value = sc.nextLine();
						arr[ index ] = Convert.changeType(value, type);
					}
					Object result = method.invoke(c.newInstance(), arr);
					System.out.println("Result	:	"+result);
					break;
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
