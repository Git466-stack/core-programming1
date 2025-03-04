import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize variables
        int originalNumber = number; // Store the original number
        int sum = 0; // To store the sum of cubes of digits

        // While loop to calculate the sum of cubes of each digit
        while (originalNumber != 0) {
            int remainder = originalNumber % 10; // Get the last digit
            sum += Math.pow(remainder, 3); // Add the cube of the digit to the sum
            originalNumber /= 10; // Remove the last digit
        }

        // Check if the sum equals the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
