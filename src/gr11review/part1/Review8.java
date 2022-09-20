package gr11review.part1;
import java.util.Random;

/**
 * A program that creates a list of 1000 rows, with each row having 3 randomly generated numbers. Also counts the number of times all 3 numbers are the same.
 * @author D.Gu
 * 
 */

public class Review8 {
    public static void main(String[] args) throws Exception{
        
        Random random = new Random();
        
        // Initialize variables
        int intFirst;
        int intSecond;
        int intThird;
        int intTriple = 0;

        // Generate 1000 rows of 3 random numbers from 0 to 9
        for (int intNum = 0; intNum < 1000; intNum++){
            // Generate a random integer from 0 to 9 for each variable
            intFirst = random.nextInt(9);
            intSecond = random.nextInt(9);
            intThird = random.nextInt(9);

            // If all three numbers are equal add 1 to intTriple
            if (intFirst == intSecond && intSecond == intThird){
                intTriple++;
            }
            // Print out the integer values in each slot
            System.out.println(intFirst + " " + intSecond + " " +  intThird);
        }
        // Print out the number of times all 3 numbers were the same
        System.out.println(+intTriple);
    }
}
