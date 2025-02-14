import java.util.Scanner;

public class calculatetotalprice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter the unit price using user input (use double to allow decimal values)
        System.out.print("Enter the unit price: ");
        double unit = sc.nextDouble();

        // Enter the quantity using user input
        System.out.print("Enter the quantity: ");
        int quantity = sc.nextInt();

        // Calculate the total price
        double totalPrice = unit * quantity;

        // Output the total price, formatted to 2 decimal places
        System.out.printf("The total purchase price is INR %.2f if the quantity is %d and unit price is INR %.2f.%n",
                totalPrice, quantity, unit);

    }
}
