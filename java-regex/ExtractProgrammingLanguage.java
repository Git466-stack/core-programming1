import java.util.*;
import java.util.regex.*;

public class ExtractProgrammingLanguage {
    public static void main(String[] args) {
        // Example input text
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        // Regular expression to match programming language names
        String regex = "\\b[A-Z][a-zA-Z]*\\b";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(text);

        // List to store programming language names
        List<String> languages = new ArrayList<>();

        // Find all matches
        while (matcher.find()) {
            languages.add(matcher.group());
        }

        // Print the extracted language names
        System.out.println("Extracted Programming Languages:");
        System.out.println(String.join(", ", languages));
    }
}
