/*Create a class called NumberData that accept any array of the five numbers.
Create a sub class called Numplay which provides methods for followings:
1. Display numbers entered.
2. Sum of the number.
3. Average of the numbers.
4. Maximum of the numbers.
5. Minimum of the numbers.
Create a class that provides menu for above methods. Give choice from the
command-line argument.*/

import java.util.Scanner;

class NumberData
{
    Scanner sc= new Scanner(System.in);
    int numbers[]=new int[5];
    NumberData()
    {
        for (int i=0;i<5;i++) 
        {
            System.out.print("Enter element "+(i+1)+": ");
            numbers[i]=sc.nextInt();
        }
    }
}

class Numplay extends NumberData
{
    void display()
    {
        for (int i : numbers) 
        {
            System.out.print(i+"\t");    
        }
        System.out.println("");
    }

    void sum()
    {
        int sum=0;
        for (int i : numbers) 
        {
            sum+=i;   
        }
        System.out.println("Sum of elements is: "+sum);
    }

    void average()
    {
        float avg=0;
        for (int i : numbers) 
        {
            avg+=i;   
        }
        System.out.println("Sum of elements is: "+(avg/2));
    }

    void maximum()
    {
        int max=numbers[0];
        for (int i : numbers) 
        {
            if(max<i)
            {
                max=i;
            }
        }
        System.out.println("Maximum number in elements is: "+max);
    }

    void minimum()
    {
        int min=numbers[0];
        for (int i : numbers) 
        {
            if(min>i)
            {
                min=i;
            }
        }
        System.out.println("Minimum number in elements is: "+min);
    }
}

class Menu extends Numplay
{
    Scanner sc= new Scanner(System.in);
    byte choice;

    void showMenu()
    {
        do{
            System.out.println("1. Display numbers entered.");
            System.out.println("2. Sum of the number.");
            System.out.println("3. Average of the numbers.");
            System.out.println("4. Maximum of the numbers.");
            System.out.println("5. Minimum of the numbers.");
            System.out.println("6. Exit.");
            System.out.print("Enter your choice: ");
            choice=sc.nextByte();
    
            if(choice==1)
            {
                display();
            }
    
            else if(choice==2)
            {
                sum();
            }
    
            else if(choice==3)
            {
                average();
            }
    
            else if(choice==4)
            {
                maximum();
            }
    
            else if(choice==5)
            {
                minimum();
            }
            else
            {
                System.out.println("Invalid choice.");
            }
        }while(choice!=6);
    }

}

class JavaU2Q6
{
    public static void main(String[] args)
    {
        Menu menu = new Menu();
        menu.showMenu();      
    }
}