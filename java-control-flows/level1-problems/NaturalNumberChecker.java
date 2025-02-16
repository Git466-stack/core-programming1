//package core-programming.java-control-flows.level1-problems;
import java.util.*;
import java.util.Scanner;

public class NaturalNumberChecker {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is a natural number
        if (number >= 1) {
            // Calculate the sum of n natural numbers
            int sum = number * (number + 1) / 2;
            // Display the result
            System.out.printf("The sum of %d natural numbers is %d\n", number, sum);
        } else {
            // Display if the number is not a natural number
            System.out.printf("The number %d is not a natural number\n", number);
        }

        
    }
}
