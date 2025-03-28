import java.util.Scanner;

public class ReplaceMultipleSpace {
    public static void main(String[] args) {
        // Input text
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence with multiple spaces:");
        String input = scanner.nextLine();

        // Replace multiple spaces with a single space
        String result = input.replaceAll("\\s+", " ");

        // Print the output
        System.out.println("Output:");
        System.out.println(result);

        scanner.close();
    }
}
