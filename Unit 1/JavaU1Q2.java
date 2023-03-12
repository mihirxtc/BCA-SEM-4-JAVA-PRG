/* A motor cycle dealer sells two-wheelers to his customer on loan, which is to be 
repaid in 5 years. The dealer charges simple interest for the whole term on the 
day of giving the loan itself. The total amount is then divided by 60(months) and 
is collected as equated monthly instalment (EMI). Write a program to calculate 
the EMI for a loan of Rs. X, where X is given from command line argument. Print 
the EMI value in rupees.*/

import java.util.Scanner;

class JavaU1Q2
{
    public static void main(String[] args)
{
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter amount of loan:");
        float loanAmount=sc.nextFloat();

        System.out.print("Enter rate of interest:");
        float rateOfInterest=sc.nextFloat();

        float EMI=( loanAmount + (  (loanAmount*rateOfInterest*5) /100 ) ) /60;
        System.out.print("EMI is:"+EMI);
    }
}
