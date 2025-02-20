import java.util.Scanner;

public class SplitTextWithLengths2 {

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

    // Method to create a 2D array of words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] wordsWithLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordsWithLengths[i][0] = words[i];
            wordsWithLengths[i][1] = String.valueOf(findStringLength(words[i]));
        }
        return wordsWithLengths;
    }

    // Method to find the shortest and longest words in the array
    public static String[] findShortestAndLongestWords(String[][] wordsWithLengths) {
        String shortestWord = wordsWithLengths[0][0];
        String longestWord = wordsWithLengths[0][0];
        int shortestLength = Integer.parseInt(wordsWithLengths[0][1]);
        int longestLength = shortestLength;

        for (String[] wordWithLength : wordsWithLengths) {
            int length = Integer.parseInt(wordWithLength[1]);
            if (length < shortestLength) {
                shortestLength = length;
                shortestWord = wordWithLength[0];
            }
            if (length > longestLength) {
                longestLength = length;
                longestWord = wordWithLength[0];
            }
        }

        return new String[] { shortestWord, String.valueOf(shortestLength), longestWord, String.valueOf(longestLength) };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the text
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        // Split text into words using user-defined method
        String[] userDefinedWords = splitTextIntoWords(text);

        // Get words with lengths in a 2D array
        String[][] wordsWithLengths = getWordsWithLengths(userDefinedWords);

        // Find shortest and longest words
        String[] shortestAndLongest = findShortestAndLongestWords(wordsWithLengths);

        // Display the results in tabular format
        System.out.println("\nWords and their lengths:");
        System.out.printf("%-15s%-10s%n", "Word", "Length");
        System.out.println("------------------------");
        for (String[] wordWithLength : wordsWithLengths) {
            System.out.printf("%-15s%-10s%n", wordWithLength[0], Integer.parseInt(wordWithLength[1]));
        }

        // Display shortest and longest words
        System.out.println("\nShortest Word: " + shortestAndLongest[0] + " (Length: " + shortestAndLongest[1] + ")");
        System.out.println("Longest Word: " + shortestAndLongest[2] + " (Length: " + shortestAndLongest[3] + ")");

        scanner.close();
    }
}
