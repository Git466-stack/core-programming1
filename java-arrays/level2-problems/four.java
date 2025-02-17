import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Define initial array size and initialize variables
        int maxDigit = 10; // Starting max size of array to store digits
        int[] digits = new int[maxDigit]; // Array to store the digits
        int index = 0; // To keep track of where we are in the digits array

        // Extract digits of the number and store them in the array
        while (number != 0) {
            if (index == maxDigit) {
                // Increase the array size by 10 if maxDigit is reached
                maxDigit += 10; 
                int[] temp = new int[maxDigit]; // Create a new temp array with increased size
                
                // Copy elements from the old digits array into the new temp array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                
                // Now assign the temp array back to digits
                digits = temp; 
            }

            digits[index] = number % 10; // Get the last digit
            number = number / 10; // Remove the last digit
            index++; // Move to the next index
        }

        // Initialize largest and second largest digits
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the result
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("Largest digit: " + largest);
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("There is no second largest digit.");
        }

        scanner.close();
    }
}
