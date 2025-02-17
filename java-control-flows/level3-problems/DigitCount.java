import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Initialize count variable
        int count = 0;

        // Handle negative numbers
        if (number < 0) {
            number = -number; // Convert to positive
        }

        // Loop to count digits
        do {
            number /= 10; // Remove the last digit
            count++; // Increment count
        } while (number != 0);

        // Display the result
        System.out.println("The number of digits is: " + count);

        scanner.close();
    }
}
