import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer to find its greatest factor (besides itself): ");
        int number = scanner.nextInt();

        // Ensure the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int greatestFactor = 1; // Initialize the greatest factor

            // Loop from number - 1 down to 1
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) { // Check if 'i' is a factor
                    greatestFactor = i; // Assign to greatestFactor
                    break; // Break the loop as we found the greatest factor
                }
            }

            // Display the result
            System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);
        }

        scanner.close();
    }
}
