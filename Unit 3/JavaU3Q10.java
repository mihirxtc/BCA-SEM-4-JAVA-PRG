/*Write a program that accepts 5 even numbers from command line , if any of the 
numbers is odd then throw custom exception OddException and count such 
invalid numbers.
*/

class OddException extends Exception
{
	public String getMessage()
	{
		return "Number is odd";
	}
}

class JavaU3Q10
{
	public static void main(String args[])
	{
		int numbers[]=new int[args.length];
		int cnt=0;
		try
		{
			for(int i=0;i<args.length;i++)
			{
				numbers[i]=Integer.parseInt(args[i]);
				if( numbers[i] % 2 != 0)	
				{
					cnt++;
				}
			}

			for(int i=0;i<args.length;i++)
			{
				numbers[i]=Integer.parseInt(args[i]);
				if( numbers[i] % 2 != 0)	
				{
					throw new OddException();
				}
			}
			
		}

		catch(OddException oe)
		{
			System.out.println(oe.getMessage());
			System.out.println("Invalid numbers: "+cnt);
		}

		catch(Exception e)
		{
			System.out.println(e);
		}

	}
}