import java.util.Scanner;

public class illegalArgumentExceptionDemo {

    // Method to generate IllegalArgumentException
    public static void generateException(String text) {
        // Using substring with start index greater than end index
        System.out.println(text.substring(5, 2)); // This will throw IllegalArgumentException
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String text) {
        try {
            // Using substring with start index greater than end index
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
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
        System.out.println("\nGenerating IllegalArgumentException:");
        try {
            generateException(text);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Calling the method to handle the exception
        System.out.println("\nHandling IllegalArgumentException:");
        handleException(text);

        scanner.close();
    }
}
