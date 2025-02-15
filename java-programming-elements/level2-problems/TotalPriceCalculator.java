import java.util.Scanner;

public class TotalPriceCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the unit price
        System.out.print("Enter the unit price (INR): ");
        double unitPrice = scanner.nextDouble();

        // Prompt the user to input the quantity
        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();

        // Calculate the total price
        double totalPrice = unitPrice * quantity;

        // Display the result in the desired format
        System.out.printf("The total purchase price is INR %.2f if the quantity is %d and unit price is INR %.2f.\n",
                totalPrice, quantity, unitPrice);

        // Close the scanner
        scanner.close();
    }
}
