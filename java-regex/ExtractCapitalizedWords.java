import java.util.regex.*;
import java.util.*;

public class ExtractCapitalizedWords {
    public static void main(String[] args) {
        // Example sentence
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        // Regex to match capitalized words
        String regex = "\\b[A-Z][a-z]*\\b";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(text);

        // List to store extracted capitalized words
        List<String> capitalizedWords = new ArrayList<>();

        // Find and collect all capitalized words
        while (matcher.find()) {
            capitalizedWords.add(matcher.group());
        }

        // Print the extracted capitalized words
        if (capitalizedWords.isEmpty()) {
            System.out.println("No capitalized words found.");
        } else {
            System.out.println("Extracted Capitalized Words:");
            System.out.println(String.join(", ", capitalizedWords));
        }
    }
}
