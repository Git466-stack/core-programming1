import java.util.*;
import java.util.regex.*;

public class ExtractEmail {
    public static void main(String[] args) {
        // Example input text
        String text = "Contact us at support@example.com and info@company.org";

        // Regular expression to match email addresses
        String regex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b";

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
