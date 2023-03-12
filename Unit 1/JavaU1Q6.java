/*Write a program to calculate the area of square and rectangle by overloading 
the area method. */

import java.util.Scanner;

class JavaU1Q6
{

    static float area(float length)
    {
        float area=length*length;
        return area;
    }
    static float area(float length,float width)
    {
        float area=length*width;
        return area;
    }
    public static void main(String[] args) 
    {

        float length,width,area;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter length of square:");
        length=sc.nextFloat();
        area=area(length);
        System.out.println("Area of the square is: "+area);

        System.out.print("\nEnter length of rectangle:");
        length=sc.nextFloat();
        System.out.print("Enter width of rectangle:");
        width=sc.nextFloat();
        System.out.println("Area of the rectangle is: "+ area(length,width));
    }
}
