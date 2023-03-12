/*Create two thread. One thread print 'fybca' 4 times and another thread print 
'sybca' 6 times. Set priority for both thread and when thread finished print 
'tybca' from main.*/

class Fythread extends Thread
{
    public void run()
    {
        for (int i = 0; i <= 4 ; i++)
        {
            try
            {
                System.out.println("fybca");
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                System.out.println("Thread inturrupted");
            }
        }
    }
}

class Sythread extends Thread
{
    public void run()
    {
        for (int i = 0; i <= 6 ; i++)
        {
            try
            {
                System.out.println("sybca");
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                System.out.println("Thread inturrupted");
            }
        }
    }
}

class JavaU4Q4
{
    public static void main(String[] args)
    {
        Fythread fy=new Fythread();
        Sythread sy = new Sythread();
        fy.setPriority(10);
        sy.setPriority(6);
        fy.start();
        sy.start();
        try
        {
            fy.join();
            sy.join();
        }
        catch (InterruptedException e)
        {
            System.out.println("Thread inturrupted");
        }

        System.out.println("tybca");
    }
}