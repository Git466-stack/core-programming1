import java.util.Scanner;

public class FactorsArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            return;
        }

        // Initialize variables for storing factors
        int maxFactor = 10; // Initial array size
        int[] factors = new int[maxFactor];
        int index = 0; // To track the current position in the factors array

        // Find factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // If the current index reaches the maxFactor size, resize the array
                if (index == maxFactor) {
                    maxFactor *= 2; // Double the size
                    int[] temp = new int[maxFactor];
                    // Copy elements from the old array to the new array
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp; // Assign the new array
                }
                factors[index++] = i; // Store the factor
            }
        }

        // Display the factors
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
