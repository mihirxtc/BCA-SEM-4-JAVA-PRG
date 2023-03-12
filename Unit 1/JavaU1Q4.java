/*Write a java program to scan 3 integer values from the command line argument 
and display the maximum number using conditional operator. */

import java.util.Scanner;

class JavaU1Q4
{
    
    public static void main(String[] args)
    {

        Scanner numScanner=new Scanner(System.in);

        System.out.print("Enter number 1:");
        int num1=numScanner.nextInt();
        
        System.out.print("Enter number 2:");
        int num2=numScanner.nextInt();

        System.out.print("Enter number 3:");
        int num3=numScanner.nextInt();

        int maximumNumber= num1>num2? num1>num3? num1 :num3 : num2>num3? num2 :num3;

        System.out.print("Maximum number is:"+maximumNumber);
    }
}
