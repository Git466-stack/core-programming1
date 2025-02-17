import java.util.Scanner;

public class BasicZaraBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double totalBonus = 0.0;

        System.out.println("Enter salary and years of service for 10 employees:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Employee " + (i + 1) + " - Salary: ");
            salary[i] = scanner.nextDouble();
            System.out.print("Employee " + (i + 1) + " - Years of Service: ");
            yearsOfService[i] = scanner.nextDouble();

            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input. Please re-enter data.");
                i--; // Retry for this employee
            }
        }

        System.out.println("\nEmployee Bonus Details:");
        for (int i = 0; i < 10; i++) {
            double bonus = yearsOfService[i] > 5 ? salary[i] * 0.05 : salary[i] * 0.02;
            totalBonus += bonus;
            System.out.printf("Employee %d - Bonus: %.2f%n", (i + 1), bonus);
        }

        System.out.printf("\nTotal Bonus Payout: %.2f%n", totalBonus);
        scanner.close();
    }
}
