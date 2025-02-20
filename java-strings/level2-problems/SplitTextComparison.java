import java.util.Scanner;

public class SplitTextComparison {

    // Method to find the length of a string without using length() method
    public static int findStringLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception occurs when the index goes out of bounds, return the length
        }
        return length;
    }

    // Method to split text into words without using split() method
    public static String[] splitTextIntoWords(String text) {
        int length = findStringLength(text);
        int wordCount = 1;

        // Count words by counting spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store indexes of spaces
        int[] spaceIndexes = new int[wordCount - 1];
        int spaceIndexCounter = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[spaceIndexCounter++] = i;
            }
        }

        // Extract words using the space indexes
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < spaceIndexes.length; i++) {
            words[i] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }
        words[words.length - 1] = text.substring(start);

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
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

        // Split text into words using user-defined method
        String[] userDefinedWords = splitTextIntoWords(text);

        // Split text into words using built-in split() method
        String[] builtInWords = text.split(" ");

        // Compare the two string arrays
        boolean areEqual = compareStringArrays(userDefinedWords, builtInWords);

        // Display the results
        System.out.println("\nWords using user-defined method: ");
        for (String word : userDefinedWords) {
            System.out.println(word);
        }

        System.out.println("\nWords using built-in split() method: ");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        System.out.println("\nAre both methods equal? " + areEqual);

        scanner.close();
    }
}
