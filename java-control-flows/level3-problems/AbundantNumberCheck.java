import java.util.Scanner;

public class AbundantNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Initialize sum variable
        int sum = 0;

        // Loop to find divisors and calculate their sum
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { // Check if 'i' is a divisor of 'number'
                sum += i; // Add the divisor to the sum
            }
        }

        // Check if the sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }

        scanner.close();
    }
}
