public class SpringSeason {
    public static void main(String[] args) {
        // Ensure the user provides month and day as command-line arguments
        if (args.length < 2) {
            System.out.println("Usage: java SpringSeason <month> <day>");
            return;
        }

        // Parse the input values
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check if it's a Spring season
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }

    // Method to determine if the given date is in the Spring season
    public static boolean isSpringSeason(int month, int day) {
        if (month == 3 && day >= 20 && day <= 31) {
            return true; // March 20 to March 31
        } else if (month == 4 && day >= 1 && day <= 30) {
            return true; // Entire April
        } else if (month == 5 && day >= 1 && day <= 31) {
            return true; // Entire May
        } else if (month == 6 && day >= 1 && day <= 20) {
            return true; // June 1 to June 20
        } else {
            return false; // Not in Spring season
        }
    }
}
