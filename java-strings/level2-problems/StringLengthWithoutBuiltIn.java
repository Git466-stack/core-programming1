import java.util.Scanner;

public class StringLengthWithoutBuiltIn {

    // Method to find the length of a string without using length() method
    public static int findStringLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception occurs when the index goes out of bounds, return the length
        }
        return length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String text = scanner.next();

        // Find the length using user-defined method
        int userDefinedLength = findStringLength(text);

        // Find the length using built-in length() method
        int builtInLength = text.length();

        // Display the results
        System.out.println("\nLength of the string using user-defined method: " + userDefinedLength);
        System.out.println("Length of the string using built-in length() method: " + builtInLength);

        scanner.close();
    }
}
