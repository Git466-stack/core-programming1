import java.util.*;
import java.util.regex.*;

public class ExtractCurrencyValues {
    public static void main(String[] args) {
        // Example input text
        String text = "The price is $45.99, and the discount is 10.50.";

        // Regular expression to match currency values
        String regex = "\\$?\\d+\\.\\d{2}";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(text);

        // List to store extracted currency values
        List<String> currencyValues = new ArrayList<>();

        // Find and collect all currency values
        while (matcher.find()) {
            currencyValues.add(matcher.group());
        }

        // Print the extracted currency values
        if (currencyValues.isEmpty()) {
            System.out.println("No currency values found.");
        } else {
            System.out.println("Extracted Currency Values:");
            System.out.println(String.join(", ", currencyValues));
        }
    }
}
