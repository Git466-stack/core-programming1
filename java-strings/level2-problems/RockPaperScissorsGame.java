import java.util.Scanner;

public class RockPaperScissorsGame {

    // Method to generate computer choice
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3); // 0: Rock, 1: Paper, 2: Scissors
        return switch (choice) {
            case 0 -> "Rock";
            case 1 -> "Paper";
            default -> "Scissors";
        };
    }

    // Method to find the winner of a single round
    public static String findWinner(String userChoice, String computerChoice) {
        if (userChoice.equalsIgnoreCase(computerChoice)) {
            return "Draw";
        } else if (
            (userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
            (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
            (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))
        ) {
            return "Player";
        } else {
            return "Computer";
        }
    }

    // Method to calculate win percentages
    public static String[][] calculateStats(int playerWins, int computerWins, int totalGames) {
        double playerPercentage = ((double) playerWins / totalGames) * 100;
        double computerPercentage = ((double) computerWins / totalGames) * 100;
        return new String[][] {
            {"Player Wins", String.valueOf(playerWins), String.format("%.2f%%", playerPercentage)},
            {"Computer Wins", String.valueOf(computerWins), String.format("%.2f%%", computerPercentage)}
        };
    }

    // Method to display results in a tabular format
    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.printf("%-10s %-15s %-15s %-10s%n", "Game", "Player Choice", "Computer Choice", "Winner");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.printf("%-10s %-15s %-15s %-10s%n", i + 1, gameResults[i][0], gameResults[i][1], gameResults[i][2]);
        }

        System.out.println();
        System.out.printf("%-15s %-10s %-10s%n", "Category", "Wins", "Percentage");
        System.out.println("----------------------------------------");
        for (String[] stat : stats) {
            System.out.printf("%-15s %-10s %-10s%n", stat[0], stat[1], stat[2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of games to play: ");
        int totalGames = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[][] gameResults = new String[totalGames][3]; // [Player Choice, Computer Choice, Winner]
        int playerWins = 0;
        int computerWins = 0;

        for (int i = 0; i < totalGames; i++) {
            System.out.print("Enter your choice (Rock, Paper, Scissors): ");
            String userChoice = scanner.nextLine();
            String computerChoice = getComputerChoice();

            String winner = findWinner(userChoice, computerChoice);
            if (winner.equals("Player")) {
                playerWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            }

            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }

        // Calculate stats
        String[][] stats = calculateStats(playerWins, computerWins, totalGames);

        // Display results
        displayResults(gameResults, stats);

        scanner.close();
    }
}
