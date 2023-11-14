package Quiz2;

import java.text.DecimalFormat;
/*Create a class called Invoice that a hardware store might use to represent an
invoice for an item sold at the store.
An Invoice should include four pieces of information as
instance variables‐
a part number(type String),
a part description(type String),
a quantity of the item being purchased (type int)
and a price per item (double).
Provide a method named getInvoiceAmount() that calculates the invoice amount
 (i.e., multiplies the quantity by the price per item),
 method printDetails() to print all information.*/
public class Invoice {

    //Declaring Instance Variables
    String partNumber;
    String description;
    int quantity;
    double price;

    // method to calculate the invoice amount
    public static double getInvoiceAmount(int quantity, double price){
        double amount=quantity*price;
        return amount;
    }

    //method printDetails() to print all information
    public static void printDetails(String partNumber, String description){
        System.out.println("Part Number is: "+partNumber);
        System.out.println("Description: "+description);
    }

    public static void main(String[] args) {

        Invoice.printDetails("A1234","Drilling Machine");
    //To print the amount in 2 decimal
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedValue = decimalFormat.format(getInvoiceAmount(5,20.99));
        System.out.println("The Amount Product sold " +formattedValue);
    }

}
