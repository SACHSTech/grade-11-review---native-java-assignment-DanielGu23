package gr11review.part1;
import java.io.*;

/**
 * A program that outputs the total number of days in a year that have passed given the month and day of that month.
 * @author D.Gu
 * 
 */

public class Review1 {
    public static void main(String[] args) throws Exception{
        // Initialize total number of days to 0
        int intSum = 0;

        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the month number: ");
        int intGivenMonth = Integer.parseInt(key.readLine());

        System.out.print("Enter the day number: ");
        int intDays = Integer.parseInt(key.readLine());

        for (int intMonth = 1; intMonth < intGivenMonth; intMonth++) {
            // Add all the days in each month to intSum
            // If month is February add 28 days
            if (intMonth == 2){
                intSum = intSum + 28;
            }
            // If month is April, June, September, or November add 30 days
            else if (intMonth == 4 || intMonth == 6 || intMonth == 9 || intMonth == 11){
                intSum = intSum + 30; 
            }
            // Otherwise add 31 days
            else {
                intSum = intSum + 31;
            }
        }
        intSum = intSum + intDays;
        System.out.println (+intSum);
    }
}