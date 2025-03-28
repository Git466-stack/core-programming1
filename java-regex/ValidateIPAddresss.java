import java.util.Scanner;

public class ValidateIPAddresss {
    public static void main(String[] args) {
        // Input IP address from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an IP address:");
        String ipAddress = scanner.nextLine();

        // Regular expression for a valid IPv4 address
        String regex = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

        // Validate the IP address
        if (ipAddress.matches(regex)) {
            System.out.println("✅ \"" + ipAddress + "\" is a valid IPv4 address.");
        } else {
            System.out.println("❌ \"" + ipAddress + "\" is not a valid IPv4 address.");
        }

        scanner.close();
    }
}
