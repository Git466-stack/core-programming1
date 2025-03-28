import java.util.regex.*;
import java.util.*;

public class ExtractDates {
    public static void main(String[] args) {
        // Example text
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";

        // Regex to match dates in dd/mm/yyyy format
        String regex = "\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}\\b";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(text);

        // List to store extracted dates
        List<String> dates = new ArrayList<>();

        // Find and collect all dates
        while (matcher.find()) {
            dates.add(matcher.group());
        }

        // Print the extracted dates
        if (dates.isEmpty()) {
            System.out.println("No dates found.");
        } else {
            System.out.println("Extracted Dates:");
            System.out.println(String.join(", ", dates));
        }
    }
}
