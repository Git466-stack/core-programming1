import java.util.Scanner;
import java.util.regex.*;

public class ValidateSSN {
    public static void main(String[] args) {
        // Input text containing SSN
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text containing an SSN:");
        String text = scanner.nextLine();

        // Regular expression for a valid SSN
        String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(text);

        // Find and validate SSN
        boolean found = false;
        while (matcher.find()) {
            String ssn = matcher.group();
            System.out.println("✅ \"" + ssn + "\" is valid");
            found = true;
        }

        if (!found) {
            System.out.println("❌ No valid SSN found.");
        }

        scanner.close();
    }
}
