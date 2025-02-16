import java.util.*;

public class SpringSeason {
    public static void main(String[] args) {
        // create a Scanner object for user input

        Scanner sc = new Scanner(System.in);

        // the user to enter the month and day
        System.out.println("Enter the month (1-12): ");
        int month = sc.nextInt();

        System.out.println("Enter the day: ");
        int day = sc.nextInt();

        // check if the date is in the Spring season (March 20 to june 20)

        boolean isSpringSeason = (month == 3 && day >= 20 && day <= 31) ||
                (month == 4 && day >= 1 && day <= 30) ||
                (month == 5 && day >= 1 && day <= 31) ||
                (month == 6 && day >= 1 && day <= 20);

        if (isSpringSeason) {
            System.out.println("it's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
