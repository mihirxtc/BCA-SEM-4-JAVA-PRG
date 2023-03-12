/*Write a program to sort the elements of one dimensional array. Read value of
array elements through command line argument. */

import java.util.Scanner;

public class JavaU2Q1 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int arr[]= new int[size];

        for(int i=0; i < size ; i++)
        {
            System.out.print("Enetr element "+ (i+1) +": ");
            arr[i]= sc.nextInt();
        }

        System.out.println("Array before sorting:");
        for ( int i=0; i < size ; i++) 
        {
            System.out.println(arr[i]+"\t");
        }

        int tmp;

        for(int i = 0 ; i < size ; i++)
        {
            for(int j = i+1 ; j < size ; j++)
            {
                if(arr[i] > arr[j])
                {
                    tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }

        System.out.println("Array After sorting:");
        for (int i : arr) 
        {
            System.out.print(i+"\t");
        }
    }
}
