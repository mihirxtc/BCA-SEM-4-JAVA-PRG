/*Write an application that starts two thread. First thread displays even numbers 
in the range specified from the command line and second thread displays odd 
numbers in the same range. Each thread waits for 300 milliseconds before 
displaying the next numbers. The application waits for both the thread to finish 
and then displays the message "Both threads completed".
*/

class OddThread extends Thread
{
	int n;

	OddThread(String s)
	{
		n=Integer.parseInt(s);
	}

	public void run()
	{
		for(int i=0;i<=n;i++)
		{
			try
			{
				if(i%2==1)
				{
					System.out.println("Odd : "+i);
					Thread.sleep(300);
				}
			}

			catch( InterruptedException e)
			{
				System.out.println("Thread inturrupted");
			}
		}
	}
}

class EvenThread extends Thread
{
	int n;

	EvenThread(String s)
	{
		n=Integer.parseInt(s);
	}

	public void run()
	{
		for(int i=0;i<=n;i++)
		{
			try
			{
				if(i%2==0)
				{
					System.out.println("Even : "+i);
					Thread.sleep(300);
				}
			}

			catch( InterruptedException e)
			{
				System.out.println("Thread inturrupted");
			}
		}
	}
}

class JavaU4Q1
{
	public static void main(String args[])
	{
		OddThread odd=new OddThread(args[0]);
		EvenThread even=new EvenThread(args[0]);

		try
		{
			odd.start();
			even.start();
			odd.join();
			even.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}

		System.out.println("End of main thread.");
	}
}