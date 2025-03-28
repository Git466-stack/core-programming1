import java.util.regex.*;
import java.util.*;

public class ExtractEmails {
    public static void main(String[] args) {
        // Example text containing email addresses
        String text = "Contact us at support@example.com and info@company.org. You can also reach out to admin@domain.net.";

        // Regex for matching email addresses
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(text);

        // List to store extracted email addresses
        List<String> emails = new ArrayList<>();

        // Find and collect all email addresses
        while (matcher.find()) {
            emails.add(matcher.group());
        }

        // Print the extracted email addresses
        if (emails.isEmpty()) {
            System.out.println("No email addresses found.");
        } else {
            System.out.println("Extracted Email Addresses:");
            for (String email : emails) {
                System.out.println(email);
            }
        }
    }
}
