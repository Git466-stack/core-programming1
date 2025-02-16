import java.util.Scanner;

public class SumOfNaturalNumbersForLoop {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a natural number
        System.out.print("Enter a natural number (positive integer): ");
        int n = scanner.nextInt();

        // Check if the number is a natural number
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            // Compute the sum using the formula
            int sumFormula = n * (n + 1) / 2;

            // Compute the sum using a for loop
            int sumForLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumForLoop += i;
            }

            // Compare the results
            System.out.println("Sum calculated using the formula: " + sumFormula);
            System.out.println("Sum calculated using the for loop: " + sumForLoop);

            if (sumFormula == sumForLoop) {
                System.out.println("The results match! Both computations are correct.");
            } else {
                System.out.println("The results do not match. There may be an error.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
