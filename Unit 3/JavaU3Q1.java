import P.PackClass;
import java.util.Scanner;

/*Create a package P and within that package create class PackClass which have 
method called findmax( ) which find maximum value from three numbers. Now 
import the package within another class DemoClass and now display the 
maximum number.*/

public class JavaU3Q1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		PackClass pc=new PackClass();

		System.out.print("Enter number 1:");
		float num1=sc.nextFloat();
		System.out.print("Enter number 2:");
		float num2=sc.nextFloat();
		System.out.print("Enter number 3:");
		float num3=sc.nextFloat();

		float max=pc.findmax(num1,num2,num3);

		System.out.println("Maximum number is:"+max);		
	}
}