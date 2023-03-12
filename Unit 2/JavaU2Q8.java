/*Write an interface called Exam with a method Pass(int mark) that returns a 
Boolean. Write another interface called Classify with a method Division(int 
average) which returns a string. Write a class called Result which implements 
both Exam and Classify. The pass method should return true if the marks is 
greater than or equal to 35 else false. The division method must return “First” 
when the parameter average is 60 or more, “second” when average is 50 or 
more but below 60, “no division” when average is less than 50. */

import java.util.Scanner;

interface Exam
{
	public boolean Pass(int mark);
}

interface Classify
{
	public String Division(int average);
}

class Result implements Exam,Classify
{
	public boolean Pass(int marks)
	{
		if(marks>35)
			return (true);
		else
			return (false);
	}

	public String Division(int average)
	{
		if(average>=60)
			return ("First");
		else if(average<60 && average>=50)
			return ("Second");
		else
			return ("no division");

	}
}

class JavaU2Q8
{
	public static void main(String args[])
	{
		Result result=new Result();
		System.out.print("Enter your marks:");
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();

		boolean res=result.Pass(marks);
	
		if(res==true)
			System.out.println("You are Pass!");
		else
			System.out.println("You are Fail!");

		System.out.print("Enter your average:");
		int average=sc.nextInt();

		String classify=result.Division(average);
		System.out.println("Your Divison:"+classify);
	}	 
}


