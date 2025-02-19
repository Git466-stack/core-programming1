import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Recursive method to find the sum of n natural numbers
    public static int findSumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + findSumRecursive(n - 1);
    }

    // Method to find the sum of n natural numbers using the formula
    public static int findSumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        // Validate if the input is a natural number
        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
            scanner.close();
            return;
        }

        // Calculate the sum using recursion
        int sumRecursive = findSumRecursive(n);

        // Calculate the sum using the formula
        int sumFormula = findSumFormula(n);

        // Display the results and verify
        System.out.println("Sum of the first " + n + " natural numbers using recursion: " + sumRecursive);
        System.out.println("Sum of the first " + n + " natural numbers using formula: " + sumFormula);

        if (sumRecursive == sumFormula) {
            System.out.println("Both results match. The computation is correct.");
        } else {
            System.out.println("There is a discrepancy in the results.");
        }

        scanner.close();
    }
}
