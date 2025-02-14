import java.util.Scanner;

public class StudentFeeDiscount {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Take user input for the fee and discount percentage
        System.out.print("Enter the fee for the course: ");
        double fee = sc.nextDouble();  // Fee input

        System.out.print("Enter the discount percentage: ");
        double discountPercent = sc.nextDouble();  // Discount percentage input

        // Calculate the discount amount
        double discount = (fee * discountPercent) / 100;

        // Calculate the final discounted fee
        double discountedFee = fee - discount;

        // Display the results
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);

        
    }
}
