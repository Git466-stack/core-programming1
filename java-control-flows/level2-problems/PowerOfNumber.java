import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        // Initialize result variable
        int result = 1;

        // Compute the power using a for loop
        for (int i = 1; i <= power; i++) {
            result *= number; // Multiply result with the base number
        }

        // Print the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);

        scanner.close();
    }
}
