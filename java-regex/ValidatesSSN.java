import java.util.regex.*;

public class ValidatesSSN {
    public static void main(String[] args) {
        // Example input
        String text = "My SSN is 123-45-6789.";

        // Regular expression to match a valid SSN
        String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(text);

        // Check for a valid SSN
        boolean found = false;
        while (matcher.find()) {
            System.out.println("✅ \"" + matcher.group() + "\" is valid");
            found = true;
        }

        if (!found) {
            System.out.println("❌ No valid SSN found");
        }
    }
}
