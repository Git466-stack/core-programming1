import java.util.Scanner;

public class CalendarDisplay { // Array of month names private static final String[] MONTHS = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

// Array of days in each month (non-leap year default)
private static final int[] DAYS_IN_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
private static final String[] MONTHS = null;

// Method to check if a year is a leap year
private static boolean isLeapYear(int year) {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
}

// Method to get the number of days in a given month
private static int getDaysInMonth(int month, int year) {
    if (month == 1 && isLeapYear(year)) { // February in a leap year
        return 29;
    }
    return DAYS_IN_MONTH[month];
}

// Method to get the first day of the month using the Gregorian calendar algorithm
private static int getFirstDayOfMonth(int month, int year) {
    int y = year;
    int m = month + 1; // Adjust for 0-based index
    int d = 1;
    int x = (y + y/4 - y/100 + y/400 + (31*m)/12) % 7;
    return x; // 0 for Sunday, 1 for Monday, ..., 6 for Saturday
}

// Method to display the calendar
public static void displayCalendar(int month, int year) {
    System.out.println("\n " + MONTHS[month] + " " + year + "\n");
    System.out.println("Sun Mon Tue Wed Thu Fri Sat");

    int firstDay = getFirstDayOfMonth(month, year);
    int daysInMonth = getDaysInMonth(month, year);

    // Print initial spaces
    for (int i = 0; i < firstDay; i++) {
        System.out.print("    ");
    }
    
    // Print days of the month
    for (int day = 1; day <= daysInMonth; day++) {
        System.out.printf("%3d ", day);
        if ((firstDay + day) % 7 == 0) {
            System.out.println(); // New line after Saturday
        }
    }
    System.out.println();
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter month (1-12): ");
    int month = scanner.nextInt() - 1; // Convert to 0-based index
    System.out.print("Enter year: ");
    int year = scanner.nextInt();
    scanner.close();

    if (month < 0 || month > 11) {
        System.out.println("Invalid month! Please enter a value between 1 and 12.");
    } else {
        displayCalendar(month, year);
    }
}

}