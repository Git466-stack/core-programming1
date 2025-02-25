import java.util.Scanner;

public class MaximumOfThreeNumbers {

    public static void main(String[] args) {
        // Take input from the user
        int num1 = getInput("Enter the first number: ");
        int num2 = getInput("Enter the second number: ");
        int num3 = getInput("Enter the third number: ");

        // Find the maximum value
        int max = findMaximum(num1, num2, num3);

        // Display the result
        System.out.println("The maximum of the three numbers is: " + max);
    }

    // Function to take integer input from the user
    public static int getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    // Function to find the maximum of three numbers
    public static int findMaximum(int a, int b, int c) {
        int max = a; // Assume the first number is the largest
        if (b > max) {
            max = b; // Update max if the second number is larger
        }
        if (c > max) {
            max = c; // Update max if the third number is larger
        }
        return max;
    }
}
