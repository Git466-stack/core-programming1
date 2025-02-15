import java.util.Scanner;

public class QuotientRemainderCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to input two numbers
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        // Calculate the quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Display the result
        System.out.printf("The Quotient is %d and Remainder is %d of two numbers %d and %d.\n",
                quotient, remainder, number1, number2);

    }
}
