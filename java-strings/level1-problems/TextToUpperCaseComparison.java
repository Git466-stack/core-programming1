
import java.util.Scanner;

public class TextToUpperCaseComparison {

    // Method to convert text to uppercase using charAt() method
    public static String convertToUpperCase(String text) {
        StringBuilder upperCaseText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                upperCaseText.append((char) (ch - 32));
            } else {
                upperCaseText.append(ch);
            }
        }
        return upperCaseText.toString();
    }

    // Method to compare two strings using charAt() method
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
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        // Convert text to uppercase using user-defined method
        String userDefinedUpperCase = convertToUpperCase(text);

        // Convert text to uppercase using built-in method
        String builtInUpperCase = text.toUpperCase();

        // Compare the two strings
        boolean areEqual = compareStrings(userDefinedUpperCase, builtInUpperCase);

        // Display the results
        System.out.println("\nConverted text using user-defined method: " + userDefinedUpperCase);
        System.out.println("Converted text using built-in method: " + builtInUpperCase);
        System.out.println("Are both methods equal? " + areEqual);

        scanner.close();
    }
}
