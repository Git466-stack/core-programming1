import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();

        // Check if the input is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("The factors of " + number + " are:");

            // Loop to find and print factors
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i); // Print the factor
                }
            }
        }

        scanner.close();
    }
}
