/* Write a java program to create 2 threads each thread calculates the sum and 
average of 1 to 10 and 11 to 20 respectively. After all thread finish, main thread 
should print message  "Task Completed". Write this program with use of 
runnable interface. */

class Thread1 extends Thread
{
	int sum=0;

	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			try
			{
				sum=sum+i;
				Thread.sleep(1000);
			}

			catch( InterruptedException e)
			{
				System.out.println("Thread inturrupted");
			}
		}
		System.out.println("Thread 1 sum 1 to 10: "+sum);
		System.out.println("Thread 1 average 1 to 10: "+(sum)/10);
		
	}
}

class Thread2 extends Thread
{
	int sum=0;

	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			try
			{
				sum=sum+i;
				Thread.sleep(1000);
				System.out.println("Thread 2 sum: "+sum);
				System.out.println("Thread 2 average: "+(sum)/10);
			}

			catch( InterruptedException e)
			{
				System.out.println("Thread inturrupted");
			}
		}
		System.out.println("Thread 2 sum 11 to 20: "+sum);
		System.out.println("Thread 2 average 11 to 20: "+(sum)/10);

	}
}


class JavaU4Q3
{
	public static void main(String args[])
	{
		Thread1 th1=new Thread1();
		Thread2 th2=new Thread2();
		
		th1.start();
		th2.start();

		try
		{
			th1.join();
			th2.join();
			System.out.println("Task completed.");
		}

		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}