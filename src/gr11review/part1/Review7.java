package gr11review.part1;
import java.io.*;

/**
 * A program that takes a user input and outputs the number of characters, spaces, and a's. Then prints a line based on the number of odd characters.
 * @author D.Gu
 * 
 */

 public class Review7 {
    public static void main(String[] args) throws Exception{

        // Initialize the number of spaces and letter a's
        int intSpaces = 0;
        int intLetterA = 0;
        
        // Record user input in a string called theSentence
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
        String theSentence = key.readLine(); 

        // Print the number of characters in user input
        System.out.println("There are " + theSentence.length() + " characters in the sentence.");

        
        // Finds out the number of spaces and a's in user input
        for (int intNum = 0; intNum < theSentence.length(); intNum++){
            
            // If there is a space add 1 to intSpaces
            if (theSentence.charAt(intNum) == ' '){
                intSpaces++;
            }
            // If there is an 'a' or 'A' add 1 to intNum
            else if (theSentence.charAt(intNum) == 'a'){
                intLetterA++;
            }
            else if (theSentence.charAt(intNum) == 'A'){
                intLetterA++;    
            }
        }
        
        // Print out the number of spaces and a's in user input
        System.out.println("There are " + intSpaces + " spaces in the sentence.");
        System.out.println("There are " + intLetterA + " letter a in the sentence.");

        // Create a string that counts the number of odd characters
        String strOdd = "";

        for (int intCount = 1; intCount <= theSentence.length(); intCount++){
            // If the character is odd add a dash to strOdd
            if (intCount % 2 != 0){
                strOdd = strOdd + "-";
            }
        }
        // Print out strOdd
        System.out.println(strOdd);
    }
}