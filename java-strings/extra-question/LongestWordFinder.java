import java.util.Scanner;

public class LongestWordFinder {
    public static String findLongestWord(String sentence) {
        // Split the sentence into words using whitespace as a delimiter
        String[] words = sentence.split("\\s+");
        
        String longestWord = "";
        
        // Iterate through the words and find the longest one
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        
        return longestWord;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // Find and print the longest word
        String longestWord = findLongestWord(sentence);
        System.out.println("The longest word is: " + longestWord);
        
        scanner.close();
    }
}
