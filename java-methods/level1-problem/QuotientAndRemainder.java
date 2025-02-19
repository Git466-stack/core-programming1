import java.util.Scanner;

public class QuotientAndRemainder {

    // Method to calculate quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the first number (dividend): ");
        int number = scanner.nextInt();

        System.out.print("Enter the second number (divisor): ");
        int divisor = scanner.nextInt();

        // Check for division by zero
        if (divisor == 0) {
            System.out.println("Divisor cannot be zero.");
        } else {
            // Call the method and display results
            int[] result = findRemainderAndQuotient(number, divisor);
            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        }

        scanner.close();
    }
}
