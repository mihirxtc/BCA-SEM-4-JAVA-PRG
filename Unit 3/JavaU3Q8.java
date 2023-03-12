/*Write a program which takes the age of 5 persons from command line and find 
the average age of all persons. The program should handle exception if the 
argument is not correctly formatted and custom exception if the age is not 
between 1 to 100.*/

class RangeException extends Exception
{
	public String getMessage()
	{
		return "Range exception:age is not between 0 and 100";
	}
}

class JavaU3Q8
{
	public static void main(String args[])
	{
		int age[]=new int[5];

		for(int i=0;i<5;i++)
		{
			try
			{
				age[i]=Integer.parseInt(args[i]);

				if( !(age[i]>=0 && age[i]<=100) )	
				{
					throw new RangeException();
				}
			}

			catch(RangeException re)
			{
				System.out.println( re.getMessage() );
			}

			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
		int sum=age[0]+age[1]+age[2]+age[3]+age[4];
		float average=(float)sum/5;
		System.out.println("Average of age is : "+average);
	}
}