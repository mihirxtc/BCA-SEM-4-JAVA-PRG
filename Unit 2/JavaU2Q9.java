/*Create class calculation with an abstract method area( ). Create Rectangle and
Triangle subclasses of calculation and find area of rectangle and triangle.*/

import java.util.Scanner;

abstract class Calculation
{
	abstract void area();
}

class Rectangle
{
	float length,width;
	Rectangle(float l,float w)
	{
		length=l;
		width=w;
	}
	void area()
	{
		System.out.println("\nArea of rectangle is: "+(length*width));
	}
}

class Triangle
{
	float base,height;
	Triangle(float b,float h)
	{
		base=b;
		height=h;
	}
	void area()
	{
		System.out.println("Area of triangle is: "+((base*height)/2));
	}
}

class JavaU1Q9
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter length of rectangle: ");
		float l=sc.nextFloat();
		System.out.print("Enter width of rectangle: ");
		float w=sc.nextFloat();
		Rectangle rec=new Rectangle(l,w);

		System.out.print("Enter base of triangle: ");
		float b=sc.nextFloat();
		System.out.print("Enter height of triangle: ");
		float h=sc.nextFloat();
		Triangle tri=new Triangle(b,h);

		rec.area();
		tri.area();
	}
}