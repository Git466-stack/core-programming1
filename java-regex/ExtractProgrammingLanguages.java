import java.util.*;
import java.util.regex.*;

public class ExtractProgrammingLanguages {
    public static void main(String[] args) {
        // Input text
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        // Regular expression to match programming language names
        String regex = "\\b(Java|Python|JavaScript|Go|C\\+\\+|C#|Ruby|Swift|Kotlin|PHP)\\b";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(text);

        // List to store extracted language names
        List<String> languages = new ArrayList<>();

        // Find and collect all programming language names
        while (matcher.find()) {
            languages.add(matcher.group());
        }

        // Print the extracted programming languages
        if (languages.isEmpty()) {
            System.out.println("No programming languages found.");
        } else {
            System.out.println("Extracted Programming Languages:");
            System.out.println(String.join(", ", languages));
        }
    }
}
