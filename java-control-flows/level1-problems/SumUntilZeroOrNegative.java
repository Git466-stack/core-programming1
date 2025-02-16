import java.util.*;
import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Initialize the total to 0.0
        double total = 0.0;

        System.out.println("Enter numbers to add to the total (enter 0 or a negative number to stop):");

        // Use an infinite while loop
        while (true) {
            // Get user input
            System.out.print("Enter a number: ");
            double userInput = scanner.nextDouble();

            // Check if the user entered 0 or a negative number
            if (userInput <= 0) {
                break; // Exit the loop
            }

            // Add the input to the total
            total += userInput;
        }

        // Display the total
        System.out.println("The total sum is: " + total);

        // Close the scanner
        scanner.close();
    }
}
