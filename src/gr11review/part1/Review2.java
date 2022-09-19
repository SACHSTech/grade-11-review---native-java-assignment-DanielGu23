package gr11review.part1;
import java.io.*;

/**
 * A program that prints out a statement of options and lets the user choose an option to print a joke.
 * @author D.Gu
 * 
 */

 public class Review2 {
    public static void main(String[] args) throws Exception{
        // Print out a list of options for the user to choose from
        System.out.println("0 - print a joke about your hair");
        System.out.println("1 - print a joke about your feet");
        System.out.println("2 - print a joke about your clothes");
        System.out.println("3 - print a joke about your teacher");
        System.out.print("Choose a menu option: ");
    
        // Record the user's choice
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
        int intChoice = Integer.parseInt(key.readLine());

        if (intChoice == 0){
            System.out.println("What do you call a bee having a bad day?");
            System.out.println("Frisbee!");
        }
        else if (intChoice == 1){
            System.out.println("Why isn’t your nose 12 inches long?");
            System.out.println("Because then it would be a foot.");
        }
        else if (intChoice == 2){
            System.out.println("What kind of dress can't be worn?");
            System.out.println("Address.");
        }
        else if (intChoice == 3){
            System.out.println("Why were the teacher's eyes crossed?");
            System.out.println("Because they couldn't countrol their pupils.");
        }
        else {
            System.out.println("Invalid menu option");
        }
    }
 }
