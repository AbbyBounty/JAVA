package test;

import java.util.Scanner;

abstract class Shape{
	protected float area;
	public Shape() {
	}
	public abstract void calculateArea();
	public final float getArea() {
		return this.area;
	}
}
class Rectangle extends Shape
{	
	private float length;
	private float breadth;
	public Rectangle() {
	}
	public void setLength(float length) {
		this.length = length;
	}
	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	public void calculateArea() {
		this.area = this.length * this.breadth;
	}
}
class Circle extends Shape {
	private float radius;
	public Circle() {
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public void calculateArea() {
		this.area = (float) (Math.PI * Math.pow(this.radius, 2));
	}
}
class ShapeFactory
{
	public static Shape getInstance( int choice ) {
		switch( choice ){
		case 1:	return new Rectangle();
		case 2:	return  new Circle();
		}
		return null;
	}
}
class ShapeTest
{
	static Scanner sc = new Scanner(System.in);
	private Shape shape;
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	public void acceptRecord( ) {
		if( this.shape != null )
		{
			if( shape instanceof Rectangle )
			{
				Rectangle rect = (Rectangle) shape;
				System.out.print("Length	:	");
				rect.setLength(sc.nextFloat());
				System.out.print("Breadth	:	");
				rect.setBreadth(sc.nextFloat());
			}
			else
			{
				Circle c = (Circle) shape;
				System.out.print("Radius	:	");
				c.setRadius(sc.nextFloat());
			}
			this.shape.calculateArea();//DMD
		}
	}
	public void printRecord( ) {
		if( this.shape != null )
		{
			//System.out.println("Area	:	"+shape.getArea());
			System.out.println("Area of instance of "+shape.getClass().getSimpleName()+" is "+shape.getArea());
		}
	}
	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Rectangle");
		System.out.println("2.Circle");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
}
public class Program{
	
	public static void main(String[] args) {
		int choice;
		ShapeTest test = new ShapeTest();
		while((choice = ShapeTest.menuList( ) ) != 0 )
		{
			test.setShape(ShapeFactory.getInstance(choice));
			test.acceptRecord();
			test.printRecord();
		}
		
	}
}
