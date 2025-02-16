//package core-programming.java-control-flows.level1-problems;
import java.util.*;
import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a natural number
        System.out.print("Enter a natural number (positive integer): ");
        int n = sc.nextInt();

        // Check if the number is a natural number
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            // Compute the sum using the formula
            int sumFormula = n * (n + 1) / 2;

            // Compute the sum using a while loop
            int sumWhileLoop = 0;
            int i = 1;
            while (i <= n) {
                sumWhileLoop += i;
                i++;
            }

            // Compare the results
            System.out.println("Sum calculated using the formula: " + sumFormula);
            System.out.println("Sum calculated using the while loop: " + sumWhileLoop);

            if (sumFormula == sumWhileLoop) {
                System.out.println("The results match! Both computations are correct.");
            } else {
                System.out.println("The results do not match. There may be an error.");
            }
        }

        
    }
}

