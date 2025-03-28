import java.util.*;
import java.util.regex.*;

public class FindRepeating {
    public static void main(String[] args) {
        // Example input sentence
        String sentence = "This is is a repeated repeated word test.";

        // Regular expression to find repeating words
        String regex = "\\b(\\w+)\\b(?:\\s+\\1\\b)+";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(sentence);

        // Set to store unique repeating words
        Set<String> repeatingWords = new LinkedHashSet<>();

        // Find all matches
        while (matcher.find()) {
            repeatingWords.add(matcher.group(1).toLowerCase());
        }

        // Print the repeating words
        System.out.println("Repeating Words:");
        System.out.println(String.join(", ", repeatingWords));
    }
}
