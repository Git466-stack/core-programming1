import java.util.Scanner;

public class FibonacciSequenceGenerator {

    public static void main(String[] args) {
        // Get the number of terms from the user
        int terms = getInput("Enter the number of terms for the Fibonacci sequence: ");

        // Generate and print the Fibonacci sequence
        generateFibonacci(terms);
    }

    // Function to take integer input from the user
    public static int getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    // Function to generate and print the Fibonacci sequence
    public static void generateFibonacci(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int first = 0, second = 1; // Initial two terms of Fibonacci sequence
        System.out.println("Fibonacci Sequence:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // Calculate the next term
            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println(); // Print a newline at the end
    }
}
