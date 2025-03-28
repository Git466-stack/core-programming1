import java.util.Scanner;

public class oddEvenChecker {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the number is a natural number
        if (number <= 0) {
            System.out.println("Please enter a natural number (positive integer).");
        } else {
            // Iterate from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                // Check if the current number is odd or even
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }
        }

        // Close the scanner
        scanner.close();
    }
}
