/* Write a program to calculate the hypotenuse of right angled triangle when other sides
of the triangle are given. (Hypotenuse = square root (x*x + Y *Y)). */

class JavaU1Q5
{
   public static void main(String[] args)
   {
        float side1=3,side2=4;        
        float hypotenuse = (float)(Math.sqrt((side1*side1)+(side2*side2)));
        System.out.println("The length of the hypotenuse is: " + hypotenuse);
   } 
}
