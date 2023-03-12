/*A shop during festival season offers a discount 10% for purchase made up to
Rs.1,000,
12% for purchase value of Rs.1,000 or more up to Rs 1,500 and 15% for
purchase value
of Rs.1,500 or more. Write a program to implement the above scheme for a
given sales
and print out the sales and print out the sales value, discount and net amount
payable by
a customer. Create necessary methods and constructors.*/

import java.util.Scanner;

class Shop
{
	float netValue, discount, salesvalue;

	Shop(float v,int pieces)
	{
		salesvalue=v*pieces;
	}	

	void calcNetValue()
	{
		if (salesvalue < 1000)
		{
			discount = 10f;
		}

		else if (salesvalue < 1500)
		{
			discount = 12f;
		}

		else
		{
			discount = 15f;
		}

		netValue = salesvalue - (salesvalue * discount / 100);

		System.out.println("____________________________________");
		System.out.println("Sales Value \t\t " + salesvalue);
		System.out.println("Discount \t\t " + discount + "%");
		System.out.println("____________________________________");
		System.out.println("Net Value \t\t " + netValue);
		System.out.println("____________________________________");
	}

}

class JavaU1Q8
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("_________________________________________________________");
		System.out.println("Code \t\t Name Of Product \t\t Price");
		System.out.println("_________________________________________________________");
		System.out.println("1 \t\t Seat Covers \t\t\t 2000");
		System.out.println("2 \t\t Steering Wheel Covers \t\t 500");
		System.out.println("3 \t\t Car Lightning \t\t\t 1100");

		System.out.print("Enter code of the product you want to buy: ");
		float choice = sc.nextFloat();

		System.out.print("Enter amount of pieces: ");
		int pieces = sc.nextInt();

		if (choice == 1)
		{
			Shop shop = new Shop(300f,pieces);
			shop.calcNetValue();
		}
		else if (choice == 2)
		{
			Shop shop = new Shop(500f,pieces);
			shop.calcNetValue();
		} 
		else if (choice == 3)
		{
			Shop shop = new Shop(700f,pieces);
			shop.calcNetValue();
		}
		else
		{
			System.out.println("Invalid choice.");
			return;
		}
	}
}