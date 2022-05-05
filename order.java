/*LAB4 STATIC*/

import java.util.Scanner;

public class Order
{ 

public double subTotal;
public static double runningTotal;            //static variable
private static double itemPrice;               //static variable
public static int discount;                  //static variable
static boolean ordering = true;               //static variable
static Scanner input = new Scanner(System.in); //class variable //creates a new Scanner instance which points to the input stream passed by user
static double j=0.0;

public static void main(String[] args)         //block
{
int menuOption;
int Item = 0;
input = new Scanner(System.in);
double runningTotal=0;

while(ordering) 
{
menu();
menuOption = input.nextInt();
switch(menuOption)
{
case 1:
Item = 1;
runningTotal += ItemPrice(Item);
break;
case 2:
Item = 2;
runningTotal += ItemPrice(Item);
break;
case 3:
Item = 3;
runningTotal += ItemPrice(Item);
break;
case 4:
done(runningTotal);
break;
default:
System.out.println("Invalid option.");
}
}
Offer off = new Offer();
double s=off.quantity();
System.out.println("off quant" +s);


System.out.println("Total amount: Rs" + (runningTotal-discount));
}

static //static block
{
    discount = 1;

}

public static void menu()              //static methods
{
System.out.println("Welcome ! \n1.  \n2. \n3. \n4. ");
}

public static double ItemPrice(int Item)    //static methods
{
if (Item == 1) {

    System.out.println(" ");
    itemPrice = 15000.00;
}
if (Item == 2) {

    System.out.println(" ");
    itemPrice = 10000.00;
}
if (Item == 3) {
   
    System.out.println(" ");
    itemPrice = 20000.00;
}
quantity();
return j;
}

public static double quantity() //static method
{
System.out.println("Enter quantity");
double quantity = input.nextDouble();
subTotal(quantity, itemPrice);
return quantity;
}

public static double subTotal(double quantity, double itemPrice) //static method
{
double subTotal = quantity * itemPrice;
System.out.println("Subtotal: Rs" + subTotal);
j=subTotal;
return subTotal;
}

public static void done(double runningTotal) //static method
{
ordering = false;
System.out.println("EXIT");
}
}

class Offer extends Order 
{
    public static int offer;    //variable
    static
    {
        offer=1;
    }
    public static double quantity()
    {
        double quantity=offer;
        return quantity;

    }
}