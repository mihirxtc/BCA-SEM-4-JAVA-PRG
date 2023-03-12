/*Write an application that accepts marks of three different subject from user. 
Marks should be between 0 to 100, if marks of any of the subject is not belong 
to this range, generate custom exception out of RangeException. If marks of 
each subjects are greater than or equal to 40 then display message PASS along 
with percentage, otherwise display message FAIL. Also write exception 
handling code to catch all the possible runtime exceptions likely to be generated 
in the program. */

class RangeException extends Exception
{
	public String getMessage()
	{
		return "Range exception";
	}
}

class JavaU3Q7
{
	public static void main(String args[])
	{
		int marks[]=new int[3];

		for(int i=0;i<3;i++)
		{
			try
			{
				marks[i]=Integer.parseInt(args[i]);

				if( !(marks[i]>=0 && marks[i]<=100) )	
				{
					throw new RangeException();
				}
			}
			catch(RangeException re)
			{
				System.out.println( re.getMessage() );
			}

		}
		if( marks[0]>=40 && marks[1]>=40 && marks[2]>=40)
		{
			int sum=marks[0]+marks[1]+marks[2];
			float percentage=(float)sum/3;
			System.out.println("PASS");
			System.out.println("Percentage: "+percentage);
		}

		else
		{
			System.out.println("FAIL");
		}
	}
}