/*Write an interface called numbers, with a method in Process(int x, int y). Write a
class called Sum, in which the method Process finds the sum of two numbers
and returns an int value. Write another class called Average, in which the
Process method finds the average of the two numbers and returns an int.*/

interface  Numbers
{
   public int Process(int x,int y);
}

class Sum implements Numbers
{
    public int Process(int x,int y)
    {
        return (x+y);
    }
}

class Average implements Numbers 
{
    public int Process(int x,int y)
    {
        return ((x+y)/2);
    }
}

class JavaU2Q5
{
    public static void main(String[] args) 
    {
        Sum sum = new Sum();
        Average avg = new Average();
        int s=sum.Process(2,4);
        int a=avg.Process(2,4);
        System.out.println("Sum is: "+s);
        System.out.println("Average is: "+a);
    }
}