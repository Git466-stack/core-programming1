import java.util.Scanner;

public class LeapYearChecker {

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year >= 1582) {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        } else {
            throw new IllegalArgumentException("The year must be >= 1582 as per the Gregorian calendar.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        try {
            // Check if the year is a leap year and display the result
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
