import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        // Check if the input is a positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Create a String array to store the results
        String[] results = new String[number + 1];

        // Loop from 0 to the number and populate the results array
        for (int i = 0; i <= number; i++) {
            if (i == 0) {
                results[i] = "0";
            } else if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        // Display the results
        System.out.println("FizzBuzz Results:");
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        scanner.close();
    }
}
