package gr11review.part1;
import java.io.*;

/**
 * A program that asks the user for the compound interest rate, yearly amount invested, and target. Outputs the number of years. 
 * @author D.Gu
 * 
 */

 public class Review5 {
    public static void main(String[] args) throws Exception{
        double dblTotal = 0;
        int intYears = 0;

        // Asks user for the compound interest rate and the yearly amount invested and target
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the yearly invested amount: ");
        double dblAmountInvest = Double.parseDouble(key.readLine());

        System.out.print("Enter the compound interest rate: ");
        double dblCompoundInterest = Double.parseDouble(key.readLine());

        System.out.print("Enter the target amount: ");
        double dblTarget = Double.parseDouble(key.readLine());

        // Find out how long it takes for total to exceed target
        while (dblTotal < dblTarget){
            dblTotal = dblTotal + dblAmountInvest;
            dblTotal = dblTotal * (dblCompoundInterest / 100) + dblTotal;
            intYears++;
        }

        // Print out the number of years it will take
        System.out.println("The target amount will be earned in " + intYears + " years.");
    }   
}