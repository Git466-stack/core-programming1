import java.util.Scanner;

public class StringTrimmer {

    // Method to trim leading and trailing spaces using charAt()
    public static int[] findTrimIndices(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Find the starting point without leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Find the ending point without trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();

        for (int i = start; i <= end; i++) {
            result.append(text.charAt(i));
        }

        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the text
        System.out.print("Enter a text with leading and trailing spaces: ");
        String text = scanner.nextLine();

        // Trim spaces using user-defined method
        int[] trimIndices = findTrimIndices(text);
        String trimmedTextUsingMethod = createSubstring(text, trimIndices[0], trimIndices[1]);

        // Trim spaces using the built-in trim() method
        String trimmedTextUsingBuiltIn = text.trim();

        // Compare the results
        boolean areEqual = compareStrings(trimmedTextUsingMethod, trimmedTextUsingBuiltIn);

        // Display the results
        System.out.println("\nTrimmed Text Using Method: " + trimmedTextUsingMethod);
        System.out.println("Trimmed Text Using Built-In Method: " + trimmedTextUsingBuiltIn);
        System.out.println("Are both results equal? " + areEqual);

        scanner.close();
    }
}
