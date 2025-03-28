import java.util.*;
import java.util.regex.*;

public class ExtractCurrencyValue {
    public static void main(String[] args) {
        // Example input text
        String text = "The price is $45.99, and the discount is 10.50.";

        // Regular expression to match currency values
        String regex = "\\$?\\b\\d+\\.\\d{2}\\b";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(text);

        // List to store currency values
        List<String> currencyValues = new ArrayList<>();

        // Find all matches
        while (matcher.find()) {
            currencyValues.add(matcher.group());
        }

        // Print the extracted currency values
        System.out.println("Extracted Currency Values:");
        System.out.println(String.join(", ", currencyValues));
    }
}
