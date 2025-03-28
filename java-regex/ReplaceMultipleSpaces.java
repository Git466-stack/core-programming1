import java.util.Scanner;

public class ReplaceMultipleSpaces {
    public static void main(String[] args) {
        // Example input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence with multiple spaces:");
        String input = scanner.nextLine();

        // Replace multiple spaces with a single space
        String output = input.replaceAll("\\s+", " ");

        // Print the result
        System.out.println("Modified Sentence:");
        System.out.println(output);

        scanner.close();
    }
}
