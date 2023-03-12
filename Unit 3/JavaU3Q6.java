/*Write a program that takes a string from the user and validate it. The string 
should be at least 5 characters and should contain at least one digit. Display an 
appropriate valid message.*/

class ValidateString extends Exception
{
	public String getMessage()
	{
		return "String is not valid.";
	}
}

class JavaU3Q6
{
	public static void main(String args[])
	{
		char str[]=args[0].toCharArray();
		int logic=0;

		try
		{
			if(str.length>=5)
			{
				for(int i=0;i<str.length;i++)
				{
					if( Character.isDigit(str[i]) )
					{
						logic=1;
						System.out.println("String is valid.");
						break;
					}
				}

				if(logic==0)
				{
					throw new ValidateString();
				}
			}

			else
			{
				throw new ValidateString();
			}
		}

		catch(ValidateString vs)
		{
			System.out.println(vs.getMessage());
		}
	}
}