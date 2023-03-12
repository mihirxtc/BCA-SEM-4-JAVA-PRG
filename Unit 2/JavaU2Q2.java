/*Write a program to create an array to store 5 integer values. Also initialize the
array with 5 numbers and display the array Elements in reverse order.*/

import java.util.Scanner;

public class JavaU2Q2
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size=5;

        int arr[]= new int[size];

        for(int i=0; i < size ; i++)
        {
            System.out.print("Enetr element "+ (i+1) +": ");
            arr[i]= sc.nextInt();
        }

        System.out.println("Array:");
        for ( int i=0; i < size ; i++) 
        {
            System.out.print(arr[i]+"\t");
        }

        System.out.println("\nArray in reverse order:");
        for ( int i=4; i < size ; i--) 
        {
            System.out.print(arr[i]+"\t");
        }
    }
}
