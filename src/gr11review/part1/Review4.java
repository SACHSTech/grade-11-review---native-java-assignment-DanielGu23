package gr11review.part1;
import java.io.*;
import java.text.*;

/**
 * A program that records the items a user wants to buy and prints out the total, subtotal, and tax.
 * @author D.Gu
 * 
 */

 public class Review4 {
    public static void main(String[] args) throws Exception{
        // Set the number format and initialize subtotal cost to be 0
        NumberFormat numberFormat = new DecimalFormat("0.00");
        double dblSubtotal = 0;

        // Ask the user how many items they want to buy
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("How many items do you want to buy? ");
        int intItems = Integer.parseInt(key.readLine());

        // Ask for the price of each individual item
        for (int intNum = 1; intNum <= intItems; intNum++){
            System.out.print("Enter the price for item " + intNum + ": ");
            double dblCost = Double.parseDouble(key.readLine());
            dblSubtotal = dblCost + dblSubtotal;
        }
        
        // Calculate the total and tax
        double dblTax = dblSubtotal * 0.13;
        double dblTotal = dblSubtotal + dblTax;

        // Print out the final results
        System.out.println("Subtotal: $" + numberFormat.format(dblSubtotal));
        System.out.println("Tax: $" + numberFormat.format(dblTax));
        System.out.println("Total: $" + numberFormat.format(dblTotal));
    }
}