import java.util.Scanner;

public class TextToLowerCaseComparison {

    // Method to convert text to lowercase using charAt() method
    public static String convertToLowerCase(String text) {
        StringBuilder lowerCaseText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                lowerCaseText.append((char) (ch + 32));
            } else {
                lowerCaseText.append(ch);
            }
        }
        return lowerCaseText.toString();
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

        // Convert text to lowercase using user-defined method
        String userDefinedLowerCase = convertToLowerCase(text);

        // Convert text to lowercase using built-in method
        String builtInLowerCase = text.toLowerCase();

        // Compare the two strings
        boolean areEqual = compareStrings(userDefinedLowerCase, builtInLowerCase);

        // Display the results
        System.out.println("\nConverted text using user-defined method: " + userDefinedLowerCase);
        System.out.println("Converted text using built-in method: " + builtInLowerCase);
        System.out.println("Are both methods equal? " + areEqual);

        scanner.close();
    }
}
