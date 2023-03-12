/* Write a program that accepts a string from command line and perform following 
operations:
1. Display each character on separate line in reverse order.
2. Count total number of chracters and display each character's position too.
3. Identify that whether the string is palindrom or not.
4. Count total number of uppercase and lowercase characters in it */

class JavaU3Q4
{
	public static void main(String args[])
	{
		char str[]=args[0].toCharArray();
		int i,j,lower=0,upper=0;

		System.out.println("Each character in reverse order:");
		for(i=(str.length-1);i>=0;i--)
		{
			System.out.println(str[i]);
		}

		System.out.println("\nEach character and their position:");

		for(i=0;i<str.length;i++)
		{
			System.out.println(str[i]+" : "+(i+1));
		}

		for(i=0,j=str.length-1; i<=j ; i++,j--)
		{
			if(str[i]!=str[j])
			{
				System.out.println("\nString is not palindrome.");
				break;
			}
		}
		
		if(i>=j)
			System.out.println("\nString is palindrome.");

		for(char ch : str)
		{
			if(ch>=65 && ch<=90)
				upper++;
			if(ch>=97 && ch<=122)
				lower++;
		}

		System.out.println("\nTotal number of uppercase characters in string:"+upper);
		System.out.println("\nTotal number of lowercase characters in string:"+lower);
	}
}