/* Write a program that create and starts five threads. Each thread is instantiated 
from the same class. It executes a loop with ten iterations. Each iteration 
displays the character 'x' and sleep for 500 milliseconds. The application waits 
for all threads to complete and then display a message 'hello'. */

class Thread1 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<=10;i++)
			{
				System.out.println("Thread 1: "+i);
				Thread.sleep(500);
			}
		}
		catch( InterruptedException e)
		{
			System.out.println("Thread inturrupted");
		}	
	}
}

class Thread2 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<=10;i++)
			{
				System.out.println("Thread 2: "+i);
				Thread.sleep(500);
			}
		}
		catch( InterruptedException e)
		{
			System.out.println("Thread inturrupted");
		}	
	}
}

class Thread3 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<=10;i++)
			{
				System.out.println("Thread 3: "+i);
				Thread.sleep(500);
			}
		}
		catch( InterruptedException e)
		{
			System.out.println("Thread inturrupted");
		}	
	}
}

class Thread4 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<=10;i++)
			{
				System.out.println("Thread 4: "+i);
				Thread.sleep(500);
			}
		}
		catch( InterruptedException e)
		{
			System.out.println("Thread inturrupted");
		}	
	}
}

class Thread5 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<=10;i++)
			{
				System.out.println("Thread 5: "+i);
				Thread.sleep(500);
			}
		}
		catch( InterruptedException e)
		{
			System.out.println("Thread inturrupted");
		}	
	}
}

class JavaU4Q2
{
	public static void main(String args[])
	{
		Thread1 th1=new Thread1();
		Thread2 th2=new Thread2();
		Thread3 th3=new Thread3();
		Thread4 th4=new Thread4();
		Thread5 th5=new Thread5();
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();

		try
		{
			th1.join();
			th2.join();
			th3.join();
			th4.join();
			th5.join();
			System.out.println("Hello");
		}

		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}