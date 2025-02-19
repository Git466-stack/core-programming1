public class SpringSeason {
    public static void main(String[] args) {
        // Check if the user provided exactly two arguments (month and day)
        if (args.length != 2) {
            System.out.println("Usage: java SpringSeason <month> <day>");
            return;
        }

        // Parse command-line arguments for month and day
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check if it's a Spring season
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
    }

    
    public static boolean isSpringSeason(int month, int day) {
        if (month == 3 && day >= 20 && day <= 31) {
            return true; // March 20 to March 31
        } else if (month == 4 && day >= 1 && day <= 30) {
            return true; // April
        } else if (month == 5 && day >= 1 && day <= 31) {
            return true; // May
        } else if (month == 6 && day >= 1 && day <= 20) {
            return true; // June 1 to June 20
        } else {
            return false; // Not within the Spring Season
        }
    }
}
