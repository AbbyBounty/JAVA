package test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Program {
	public static void main(String[] args) {
		Integer number = new Integer(0);
		Class<?> c = number.getClass();
		Program.printTypeInfo( c );
		Program.printFieldInfo( c );
		Program.printConstructorInfo( c );
		Program.printMethodInfo(c);
	}
	private static void printMethodInfo(Class<?> c) {
		if(c != null ) {
			Method[] methods = c.getMethods();
			for (Method method : methods)
				System.out.println(method.toString());
			System.out.println();
		}
	}
	private static void printConstructorInfo(Class<?> c) {
		if( c != null ) {
			Constructor<?>[] ctors = c.getConstructors();
			for (Constructor<?> constructor : ctors) 
				System.out.println(constructor.toString());
			System.out.println();
		}
	}
	private static void printFieldInfo(Class<?> c) {
		if( c != null ) {
			Field[] fields = c.getFields();
			for (Field field : fields) 
				System.out.println(field.toString());
			System.out.println();
		}
	}
	private static void printTypeInfo(Class<?> c) {
		if( c != null ) {
			System.out.println("Package Name	:	"+c.getPackage().getName());
			System.out.println("Type Name	:	"+c.getSimpleName());
			System.out.println("Type Modifiers	:	"+Modifier.toString(c.getModifiers()));
			System.out.println("Super Class	:	"+c.getSuperclass().getSimpleName());
			System.out.println();
		}
	}
}
