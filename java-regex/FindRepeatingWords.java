import java.util.*;
import java.util.regex.*;

public class FindRepeatingWords {
    public static void main(String[] args) {
        // Example input sentence
        String text = "This is is a repeated repeated word test.";

        // Regular expression to find repeated words
        String regex = "\\b(\\w+)\\b(?:\\s+\\1\\b)+";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(text);

        // Set to store unique repeating words
        Set<String> repeatingWords = new HashSet<>();

        // Find and collect repeating words
        while (matcher.find()) {
            repeatingWords.add(matcher.group(1));
        }

        // Print the repeating words
        if (repeatingWords.isEmpty()) {
            System.out.println("No repeating words found.");
        } else {
            System.out.println("Repeating Words:");
            System.out.println(String.join(", ", repeatingWords));
        }
    }
}
