import java.util.Scanner;
import java.util.Arrays;

public class CharacterComparison {

    // Method to return characters of a string without using toCharArray()
    public static char[] getCharacters(String str) {
        char[] characters = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            characters[i] = str.charAt(i);
        }
        return characters;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
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

        // Get characters using user-defined method
        char[] charactersWithMethod = getCharacters(text);

        // Get characters using built-in toCharArray() method
        char[] charactersWithBuiltIn = text.toCharArray();

        // Compare the two character arrays
        boolean areEqual = compareCharArrays(charactersWithMethod, charactersWithBuiltIn);

        // Display results
        System.out.println("Characters using user-defined method: " + Arrays.toString(charactersWithMethod));
        System.out.println("Characters using built-in toCharArray(): " + Arrays.toString(charactersWithBuiltIn));
        System.out.println("Are the character arrays equal? " + areEqual);

        scanner.close();
    }
}
