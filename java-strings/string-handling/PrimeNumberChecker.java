import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        // Take user input
        int number = getInput("Enter a number to check if it is prime: ");

        // Check if the number is prime
        boolean isPrime = isPrimeNumber(number);

        // Display the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Function to take integer input from the user
    public static int getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    // Function to check if a number is prime
    public static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        // Check divisors from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Number is divisible by i, hence not prime
            }
        }

        return true; // Number is prime
    }
}
