/* A car accessories shop assigns code 1 to seat covers, 2 to steering wheel covers ,
3 to car lighting and 4 for air purifiers. All other items have code 5 or more. 
While selling the goods, a sales tax of 2% to seat covers ,3% to steering wheel 
covers, 4% to car lighting, 2.5% to air purifiers and 1.2% for all other items is 
charged. A list containing the product code and price is given for making a bill. 
Write a java program using switch statements to prepare a bill. */

import java.util.Scanner;

class JavaU1Q3 
{
    public static void main(String[] args)
    {

        int pieces,price;
        float tax,totalAmount;
        Scanner sc=new Scanner(System.in);
        Scanner striScanner=new Scanner(System.in);
        
        System.out.println("_________________________________________________________");
        System.out.println("Code \t\t Name Of Product \t\t Price");
        System.out.println("_________________________________________________________");
        System.out.println("1 \t\t Seat Covers \t\t\t 2000");
        System.out.println("2 \t\t Steering Wheel Covers \t\t 500");
        System.out.println("3 \t\t Car Lightning \t\t\t 1500");
        System.out.println("4 \t\t Air Purifiers \t\t\t 2000");
        System.out.println("5 \t\t All Other Iteams \t\t 500");
        System.out.println("_________________________________________________________\n");

        System.out.print("Enter your choice:");
        byte choice=sc.nextByte();

        switch(choice)
        {
            case 1:
                System.out.print("How many Seat Covers you want to buy?:");
                pieces=sc.nextInt();
                price=2000*pieces;
                tax=price*2/100;
                totalAmount=price+tax;;

                showBill("Seat Covers", pieces, price, tax, totalAmount);
                break;

            case 2:
                System.out.print("How many Steering Wheel Covers you want to buy?:");
                pieces=sc.nextInt();
                price=500*pieces;
                tax=price*3/100;
                totalAmount=price+tax;;

                showBill("Steering Wheel Covers", pieces, price, tax, totalAmount);
                break;

            case 3:
                System.out.print("How many Car Lightning you want to buy?:");
                pieces=sc.nextInt();
                price=1500*pieces;
                tax=price*4/100;
                totalAmount=price+tax;;

                showBill("Car Lightning", pieces, price, tax, totalAmount);
                break;

            case 4:
                System.out.print("How many Air Purifiers you want to buy?:");
                pieces=sc.nextInt();
                price=2000*pieces;
                tax=(float)(price*2.5/100);
                totalAmount=price+tax;;

                showBill("Air Purifiers", pieces, price, tax, totalAmount);
                break;

            case 5:
                System.out.print("Which other iteam you want to buy?:");
                String name=striScanner.nextLine();

                System.out.print("How many "+name+" you want to buy?:");
                pieces=sc.nextInt();
                price=500*pieces;
                tax=(float)(price*1.2/100);
                totalAmount=price+tax;;

                showBill(name, pieces, price, tax, totalAmount);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    } 
    static void showBill(String name,int pieces,int price,float tax,float totalAmount)
    {
        System.out.println("_____________________________________________");
        System.out.println("Name \t\t\t "+name);
        System.out.println("_____________________________________________");
        System.out.println("Pieces \t\t\t "+pieces);
        System.out.println("Total Price \t\t "+price);
        System.out.println("Tax \t\t\t "+tax);
        System.out.println("_____________________________________________");
        System.out.println("Total Amount \t\t "+totalAmount);
        System.out.println("_____________________________________________");
    }
}
