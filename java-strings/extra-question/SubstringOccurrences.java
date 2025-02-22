import java.util.Scanner;

public class SubstringOccurrences {
    public static int countSubstringOccurrences(String str, String subStr) {
        int count = 0;
        int index = 0;

        // Loop through the string to find occurrences of the substring
        while ((index = str.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length(); // Move the index to avoid overlapping matches
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the main string
        System.out.println("Enter the main string:");
        String str = scanner.nextLine();

        // Input the substring
        System.out.println("Enter the substring to find:");
        String subStr = scanner.nextLine();

        // Count and print the number of occurrences
        int occurrences = countSubstringOccurrences(str, subStr);
        System.out.println("The substring occurs " + occurrences + " time(s) in the string.");

        scanner.close();
    }
}
