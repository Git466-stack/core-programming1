import java.util.Scanner;

public class StringComparison {
    public static int compareStrings(String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();
        int minLength = Math.min(length1, length2);

        // Compare characters of both strings one by one
        for (int i = 0; i < minLength; i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            if (char1 < char2) {
                return -1; // str1 comes before str2
            } else if (char1 > char2) {
                return 1; // str1 comes after str2
            }
        }

        // If characters match, compare lengths
        if (length1 < length2) {
            return -1; // str1 is shorter and comes before str2
        } else if (length1 > length2) {
            return 1; // str1 is longer and comes after str2
        }

        return 0; // Both strings are equal
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the two strings
        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        // Compare the strings and display the result
        int result = compareStrings(str1, str2);
        if (result < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order.");
        } else if (result > 0) {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order.");
        } else {
            System.out.println("\"" + str1 + "\" is equal to \"" + str2 + "\".");
        }

        scanner.close();
    }
}
