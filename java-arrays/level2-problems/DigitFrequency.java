import java.util.Scanner;

public class DigitFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take the input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Convert the number into an array of digits
        String numStr = String.valueOf(number); // Convert the number to a string
        int[] digitsArray = new int[numStr.length()]; // Array to store digits
        int index = 0;

        // Store each digit in the digits array
        for (int i = 0; i < numStr.length(); i++) {
            digitsArray[i] = Character.getNumericValue(numStr.charAt(i)); // Convert char to int
        }

        // Create a frequency array to store the count of each digit
        int[] frequency = new int[10]; // Array to store the frequency of digits 0 to 9

        // Count the frequency of each digit
        for (int i = 0; i < digitsArray.length; i++) {
            frequency[digitsArray[i]]++; // Increase the count for the respective digit
        }

        // Display the frequency of each digit
        System.out.println("\nFrequency of each digit:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) { // Print only if the digit is present in the number
                System.out.println("Digit " + i + " appears " + frequency[i] + " time(s)");
            }
        }

        scanner.close();
    }
}
