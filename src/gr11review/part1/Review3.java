package gr11review.part1;
import java.io.*;

/**
 * A program that prints odd numbers from 20 to 100 and then prints numbers 29 to 2 in decreasing order.
 * @author D.Gu
 * 
 */

 public class Review3 {
    public static void main(String[] args) throws Exception{
        // Prints odd numbers from 20 to 100
        for (int intNum = 20; intNum < 101; intNum++){
            if (intNum % 2 !=0 ){
                System.out.println(+intNum);
            } 
        }

        // Prints a blank line
        System.out.println("");

        // Prints numbers 29 to 2 in decreasing order
        for (int intNum2 = 29; intNum2 > 1; intNum2--) {
            System.out.println(+intNum2);
        }
    }
}
 