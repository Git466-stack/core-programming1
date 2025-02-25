import java.util.Scanner;

public class FactorialUsingRecursion {

    public static void main(String[] args) {
        // Get user input
        int number = getInput("Enter a number to calculate its factorial: ");

        // Calculate the factorial
        long factorial = calculateFactorial(number);

        // Display the result
        displayResult(number, factorial);
    }

    // Function to take input from the user
    public static int getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    // Recursive function to calculate factorial
    public static long calculateFactorial(int n) {
        if (n <= 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        return n * calculateFactorial(n - 1); // Recursive case
    }

    // Function to display the result
    public static void displayResult(int number, long factorial) {
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
