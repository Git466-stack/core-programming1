import java.util.Scanner;

public class SubstringComparison {

    // Method to create a substring using charAt()
    public static String createSubstring(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(str.charAt(i));
        }
        return substring.toString();
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

        // Take user input
        System.out.print("Enter the string: ");
        String text = scanner.next();

        System.out.print("Enter the start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end index: ");
        int end = scanner.nextInt();

        // Create a substring using charAt()
        String substringWithCharAt = createSubstring(text, start, end);

        // Create a substring using the built-in substring() method
        String substringWithBuiltIn = text.substring(start, end);

        // Compare the two substrings
        boolean areEqual = compareStrings(substringWithCharAt, substringWithBuiltIn);

        // Display results
        System.out.println("Substring using charAt(): " + substringWithCharAt);
        System.out.println("Substring using built-in substring(): " + substringWithBuiltIn);
        System.out.println("Are the substrings equal? " + areEqual);

        scanner.close();
    }
}
