/* Write a java program to display powers of 2 i.e. 2,4,8,16 etc up to 1024 using
bitwise operators.*/

class JavaU1Q10
{
	public static void main(String args[])
	{
		int p=1;
 		for(int i=0;i<10;i++)
 		{
			if(i==9)
			{
				p=p<<1;
				System.out.print(p+".");
				break;
			}
   			p=p<<1;
  			System.out.print(p+",");
 		}
	}		
}	