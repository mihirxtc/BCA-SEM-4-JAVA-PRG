/*Write a Java program to input n integer numbers and display lowest and second 
lowest number. Also handle the different exceptions possible to be thrown 
during execution.*/

import java.util.Scanner;

class JavaU3Q5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		try
		{
			System.out.println("How many numbers you want to enter:");
			int number=sc.nextInt();

			int numbers[]=new int[number];
			int tmp;
		
			for(int i=0;i<numbers.length;i++)
			{
				System.out.println("Enter number "+(i+1)+": ");
				numbers[i]=sc.nextInt();
			}

			for(int i=0;i<numbers.length;i++)
			{
				for(int j=i+1;j<numbers.length;j++)
				{
					if(numbers[i]>numbers[j])
					{
						tmp=numbers[i];
						numbers[i]=numbers[j];
						numbers[j]=tmp;
					}
				}
			}
			System.out.println("Lowest number: "+numbers[0]+" Second lowest number: "+numbers[1]);
		}
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }

        catch(NumberFormatException e)
        {
            System.out.println(e);
        }

        catch(Exception e)
        {
            System.out.println(e);
        }
	}
}