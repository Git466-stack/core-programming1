
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        System.out.println("Think of a number between 1 and 100, and I'll try to guess it!");
        playGame();
    }

    // Main game logic
    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        int low = 1;   // Lower bound
        int high = 100; // Upper bound
        int guess;
        String feedback;

        while (true) {
            // Generate a guess
            guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "?");
            System.out.print("Enter 'high' if it's higher, 'low' if it's lower, or 'correct' if I guessed it: ");
            feedback = scanner.nextLine().toLowerCase();

            // Process feedback
            if ("correct".equals(feedback)) {
                System.out.println("Yay! I guessed your number!");
                break;
            } else if ("high".equals(feedback)) {
                low = guess + 1; // Adjust lower bound
            } else if ("low".equals(feedback)) {
                high = guess - 1; // Adjust upper bound
            } else {
                System.out.println("Invalid input. Please enter 'high', 'low', or 'correct'.");
            }

            // Check if the range is invalid
            if (low > high) {
                System.out.println("Hmm, something went wrong. Are you sure about your feedback?");
                break;
            }
        }

        scanner.close();
    }

    // Function to generate a guess within the range
    public static int generateGuess(int low, int high) {
        return low + (int) (Math.random() * (high - low + 1));
    }
}
