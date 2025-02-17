import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find the count of digits in the number
        int count = 0;
        int temp = number;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Create an array to store the digits of the number
        int[] digits = new int[count];
        temp = number;
        int index = 0;

        // Extract digits and store them in the array
        while (temp != 0) {
            digits[index] = temp % 10;
            temp /= 10;
            index++;
        }

        // Create another array to store digits in reverse order (it is already in reverse)
        System.out.println("Digits in reverse order:");

        // Display the elements of the digits array (which are already in reverse order)
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }

        // If you want to reverse the entire number and display it:
        System.out.println("\nReversed number: ");
        int reversedNumber = 0;
        for (int i = 0; i < digits.length; i++) {
            reversedNumber = reversedNumber * 10 + digits[i];
        }
        System.out.println(reversedNumber);

        scanner.close();
    }
}
