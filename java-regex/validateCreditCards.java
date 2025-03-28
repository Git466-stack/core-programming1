import java.util.Scanner;

public class validateCreditCards {
    public static void main(String[] args) {
        // Input credit card number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a credit card number:");
        String cardNumber = scanner.nextLine();

        // Regular expressions for Visa and MasterCard
        String visaRegex = "^4\\d{15}$"; // Starts with 4 and has 16 digits
        String masterCardRegex = "^5\\d{15}$"; // Starts with 5 and has 16 digits

        // Validate the credit card number
        if (cardNumber.matches(visaRegex)) {
            System.out.println("✅ \"" + cardNumber + "\" is a valid Visa card number.");
        } else if (cardNumber.matches(masterCardRegex)) {
            System.out.println("✅ \"" + cardNumber + "\" is a valid MasterCard number.");
        } else {
            System.out.println("❌ \"" + cardNumber + "\" is not a valid Visa or MasterCard number.");
        }

        scanner.close();
    }
}
