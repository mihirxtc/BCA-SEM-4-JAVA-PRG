/*Write a program to find sum of two matrices of 3 x3. */

import java.util.Scanner;

public class JavaU2Q3
{
    public static void main(String[] args)
    {
        int arr1[][] = new int[3][3];
        int arr2[][] = new int[3][3];
        int arr3[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements of 1st matrix:");
        for (int i = 0; i < 3; ++i)
        {
            for (int j = 0; j < 3; ++j) 
            {
                System.out.printf("Enter element a[%d][%d]: ", i, j);
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of 2nd matrix:");
        for (int i = 0; i < 3; ++i)
        {
            for (int j = 0; j < 3; ++j) 
            {
                System.out.printf("Enter element a[%d][%d]: ", i, j);
                arr2[i][j] = sc.nextInt();
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("Sum of matrices:");
        for (int i = 0; i < 3; ++i)
        {
            for (int j = 0; j < 3; ++j) 
            {
                System.out.printf("%d ",arr3[i][j]);
            }
            System.out.println("");
        }
    }
}
