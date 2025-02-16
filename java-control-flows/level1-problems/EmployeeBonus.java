import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the salary
        System.out.print("Enter the employee's salary: ");
        double salary = scanner.nextDouble();

        // Prompt the user to enter the years of service
        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = scanner.nextInt();

        // Check if the employee is eligible for a bonus
        if (yearsOfService > 5) {
            // Calculate the bonus (5% of salary)
            double bonus = salary * 0.05;
            System.out.println("The bonus amount is: INR " + bonus);
        } else {
            System.out.println("The employee is not eligible for a bonus.");
        }

        // Close the scanner
        scanner.close();
    }
}
