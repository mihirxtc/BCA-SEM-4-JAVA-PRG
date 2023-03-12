/*Write an application that converts between meters and feet. Its first command
line argument is a number and second command line argument is either 
"centimeter" or "meter". If the argument equals "centimeter" displays a string 
reporting the equivalent number of meters. If this argument equals "meters", 
display a string reporting the equivalent number of centimeter. If unit is not 
given properly then generate custom exception Unitformatexception. If first 
argument is not proper format then generate numberformatexception. 
Generate other exception as per requirements. (1 meter=100 centimeter)*/

class Unitformatexception extends Exception
{
	public String getMessage()
	{
		return "Unit is not valid.";
	}
}

class JavaU3Q9
{
	public static void main(String args[])
	{
		try
		{
			if(args[1] .equals("centimeter"))
			{
				int meter=Integer.parseInt(args[0])/100;
				System.out.println("Centimeter converted to meter is: "+meter);
			}

			else if(args[1] .equals("meter"))
			{
				int centimeter=Integer.parseInt(args[0])*s100;
				System.out.println("Meter converted to centimeter is: "+centimeter);
			}

			else
				throw new Unitformatexception();
		}

		catch(Unitformatexception uf)
		{
			System.out.println( uf.getMessage() );
		}

		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}