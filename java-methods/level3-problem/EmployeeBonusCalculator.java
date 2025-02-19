import java.util.Scanner;
import java.util.Random;

public class EmployeeBonusCalculator {

    // Method to generate salary and years of service for 10 employees
    public static int[][] generateEmployeeData(int numberOfEmployees) {
        Random random = new Random();
        int[][] employeeData = new int[numberOfEmployees][2]; // [salary, years of service]

        for (int i = 0; i < numberOfEmployees; i++) {
            employeeData[i][0] = 30000 + random.nextInt(70001); // Salary between 30,000 and 100,000
            employeeData[i][1] = 1 + random.nextInt(10); // Years of service between 1 and 10
        }

        return employeeData;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        double[][] result = new double[employeeData.length][2]; // [new salary, bonus amount]

        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];

            double bonusPercentage = (yearsOfService > 5) ? 0.05 : 0.02;
            double bonusAmount = salary * bonusPercentage;
            double newSalary = salary + bonusAmount;

            result[i][0] = newSalary;
            result[i][1] = bonusAmount;
        }

        return result;
    }

    // Method to calculate totals and display results
    public static void displayResults(int[][] employeeData, double[][] salaryAndBonus) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("\nEmployee Data:");
        System.out.printf("%-10s %-10s %-10s %-15s %-15s\n", "Employee", "Salary", "Years", "New Salary", "Bonus");
        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double newSalary = salaryAndBonus[i][0];
            double bonus = salaryAndBonus[i][1];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-10d %-10d %-10d %-15.2f %-15.2f\n", i + 1, oldSalary, yearsOfService, newSalary, bonus);
        }

        System.out.println("\nSummary:");
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
        System.out.printf("Total Bonus: %.2f\n", totalBonus);
    }

    public static void main(String[] args) {
        final int NUMBER_OF_EMPLOYEES = 10;

        // Generate employee data
        int[][] employeeData = generateEmployeeData(NUMBER_OF_EMPLOYEES);

        // Calculate bonus and new salary
        double[][] salaryAndBonus = calculateBonusAndNewSalary(employeeData);

        // Display results
        displayResults(employeeData, salaryAndBonus);
    }
}
