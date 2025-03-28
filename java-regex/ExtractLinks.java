import java.util.regex.*;
import java.util.*;

public class ExtractLinks {
    public static void main(String[] args) {
        // Example text containing links
        String text = "Visit https://www.google.com and http://example.org for more info. You can also check out https://github.com.";

        // Regex to match URLs
        String regex = "https?://[\\w.-]+(?:\\.[a-z]{2,})(?:/[\\w.-]*)*";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(text);

        // List to store extracted links
        List<String> links = new ArrayList<>();

        // Find and collect all links
        while (matcher.find()) {
            links.add(matcher.group());
        }

        // Print the extracted links
        if (links.isEmpty()) {
            System.out.println("No links found.");
        } else {
            System.out.println("Extracted Links:");
            System.out.println(String.join(", ", links));
        }
    }
}
