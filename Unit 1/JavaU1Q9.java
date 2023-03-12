/*A bank gives 6.5% per annum interest on deposits made in that bank. Write a
program to calculate the total amount that a person will receive after the end of
5 years for a deposit of Rs.5000 for compound interest. Create necessary
methods and constructors too.*/

import java.util.Scanner;
import java.lang.Math;

class Bank
{
	float deposit,amount;
	Bank(float d)
	{
		deposit=d;
	}

	void showAmount()
	{
		System.out.println("Amount after 5 years is: "+amount);
	}
	
	void calcAmount()
	{
		amount=(float)(deposit*(Math.pow ( 1 + 6.5 / 100 , 5)));
	}	
}

class JavaU1Q9
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.print("Enter deposit: ");
		float deposit=sc.nextFloat();

		Bank b=new Bank(deposit);
		b.calcAmount();
		b.showAmount();
	}
}