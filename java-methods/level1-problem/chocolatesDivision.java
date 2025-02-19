import java.util.Scanner;

public class chocolatesDivision {

    // Method to calculate quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the total number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Check for division by zero
        if (numberOfChildren == 0) {
            System.out.println("Number of children cannot be zero.");
        } else {
            // Call the method and display results
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
            System.out.println("Each child will get: " + result[0] + " chocolates");
            System.out.println("Remaining chocolates: " + result[1]);
        }

        scanner.close();
    }
}
