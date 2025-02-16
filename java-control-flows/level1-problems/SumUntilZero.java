import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Initialize the total to 0.0
        double total = 0.0;

        // Variable to store user input
        double userInput;

        System.out.println("Enter numbers to add to the total (enter 0 to stop):");

        // Use a while loop to keep asking for input until the user enters 0
        while (true) {
            // Get user input
            System.out.print("Enter a number: ");
            userInput = sc.nextDouble();

            // Check if the user entered 0
            if (userInput == 0) {
                break;
            }

            // Add the input to the total
            total += userInput;
        }

        // Display the total
        System.out.println("The total sum is: " + total);
    }
}
