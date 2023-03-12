/*Write a program that creates three different classes in three different packages 
and access them from default package. All the three packages should be at the 
same level.
*/
import p1.P1C1;
import p2.P2C1;
import p3.P3C1;

class JavaU3Q2
{
	public static void main(String args[])
	{
		P1C1 c1=new P1C1();
		P2C1 c2=new P2C1();
		P3C1 c3=new P3C1();
		c1.print1();
		c2.print2();
		c3.print3();
	}
}