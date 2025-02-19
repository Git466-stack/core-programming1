import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Get the input for 'n' from the user
        System.out.print("Enter a positive integer (n): ");
        int n = sc.nextInt();

        // Validate the input
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            // Call the method to find the sum of n natural numbers
            int sum = findSumOfNaturalNumbers(n);
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }
    }

    public static int findSumOfNaturalNumbers(int n) {
        int sum = 0;

        // Loop through numbers from 1 to n and calculate the sum
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }
}
