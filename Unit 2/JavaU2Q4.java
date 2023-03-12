/*Write program to create an array of company name and another array of price
quoted by the company. Fetch the company name who has quoted the lowest
amount.
*/

import java.util.Scanner;

public class JavaU2Q4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String name[]=new String[5];
        float price[]=new float[5];

        for(int i=0;i<5;i++)
        {
            System.out.printf("Enter name of company %d: ",i+1);
            name[i]=sc.next();
            System.out.printf("Enter price quoted by company %d: ",i+1);
            price[i]=sc.nextFloat();
        }

        int index=0;
        float maxPrice=price[0];

        for(int i=1;i<5;i++)
        {
            if(price[i] < maxPrice)
            {
                index=i;
                maxPrice=price[i];
            }
        }

        System.out.printf("%s's qutoed %.2f amount is lowest quoted amout.",name[index],maxPrice);
    }
}
