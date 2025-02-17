import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Define an array to store the multiplication results
        int[] multiplicationResult = new int[4]; // Array size 4 for results from 6 to 9

        // Calculate the multiplication table for numbers 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i; // Store the result in the array
        }

        // Display the multiplication table
        System.out.println("Multiplication Table of " + number + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }

        scanner.close();
    }
}
