
import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        // Attempting to parse a non-numeric string to an integer
        System.out.println(Integer.parseInt(text)); // This will throw NumberFormatException
    }

    // Method to handle NumberFormatException
    public static void handleException(String text) {
        try {
            // Attempting to parse a non-numeric string to an integer
            System.out.println(Integer.parseInt(text));
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = scanner.next();

        // Calling the method to generate the exception
        System.out.println("\nGenerating NumberFormatException:");
        try {
            generateException(text);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Calling the method to handle the exception
        System.out.println("\nHandling NumberFormatException:");
        handleException(text);

        scanner.close();
    }
}
