import java.util.Scanner;

public class FactorsCalculator {

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;
        // First loop to count the factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Initialize the array with the count of factors
        int[] factors = new int[count];
        int index = 0;

        // Second loop to save the factors into the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to calculate the sum of factors
    public static int calculateSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to calculate the product of factors
    public static long calculateProductOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to calculate the sum of the squares of factors
    public static int calculateSumOfSquaresOfFactors(int[] factors) {
        int sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();

        // Find factors
        int[] factors = findFactors(number);

        // Display factors
        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Calculate and display the sum, product, and sum of squares of factors
        int sumOfFactors = calculateSumOfFactors(factors);
        long productOfFactors = calculateProductOfFactors(factors);
        int sumOfSquaresOfFactors = calculateSumOfSquaresOfFactors(factors);

        System.out.println("Sum of factors: " + sumOfFactors);
        System.out.println("Product of factors: " + productOfFactors);
        System.out.println("Sum of squares of factors: " + sumOfSquaresOfFactors);

        scanner.close();
    }
}