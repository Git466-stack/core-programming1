import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define an array to store up to 10 elements of type double
        double[] numbers = new double[10];
        double total = 0.0; // Variable to store the sum
        int index = 0; // Variable to track the array index

        // Infinite loop for taking user input
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = scanner.nextDouble();

            // Break the loop if input is 0 or negative
            if (input <= 0) {
                break;
            }

            // Break the loop if the array is full
            if (index == 10) {
                System.out.println("Array is full. Stopping input.");
                break;
            }

            // Store the valid input in the array and increment the index
            numbers[index] = input;
            index++;
        }

        // Calculate the sum of all entered numbers
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display the numbers and the total
        System.out.println("You entered the following numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("The total sum is: " + total);

        scanner.close();
    }
}
