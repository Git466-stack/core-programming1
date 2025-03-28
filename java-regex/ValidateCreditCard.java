import java.util.Scanner;

public class ValidateCreditCard {
    public static void main(String[] args) {
        // Input a credit card number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a credit card number:");
        String cardNumber = scanner.nextLine();

        // Regular expression for Visa and MasterCard
        String visaRegex = "^4\\d{15}$"; // Visa: Starts with 4 and has 16 digits
        String masterCardRegex = "^5\\d{15}$"; // MasterCard: Starts with 5 and has 16 digits

        // Validate the credit card number
        if (cardNumber.matches(visaRegex)) {
            System.out.println("✅ " + cardNumber + " is a valid Visa card.");
        } else if (cardNumber.matches(masterCardRegex)) {
            System.out.println("✅ " + cardNumber + " is a valid MasterCard.");
        } else {
            System.out.println("❌ " + cardNumber + " is not a valid Visa or MasterCard.");
        }
        
    }
}
