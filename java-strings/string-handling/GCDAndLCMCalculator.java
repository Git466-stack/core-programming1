import java.util.Scanner;

public class GCDAndLCMCalculator {

    public static void main(String[] args) {
        // Get input from the user
        int num1 = getInput("Enter the first number: ");
        int num2 = getInput("Enter the second number: ");

        // Calculate GCD and LCM
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2, gcd);

        // Display the results
        displayResult(num1, num2, gcd, lcm);
    }

    // Function to take integer input from the user
    public static int getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    // Function to calculate GCD using the Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM
    public static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd; // LCM formula: (a * b) / GCD
    }

    // Function to display the results
    public static void displayResult(int num1, int num2, int gcd, int lcm) {
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
