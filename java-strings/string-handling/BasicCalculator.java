import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display the menu of operations
            System.out.println("\nBasic Calculator:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Choose an operation (1-5): ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                // Exit the program
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            // Get input for the two numbers
            double num1 = getInput("Enter the first number: ");
            double num2 = getInput("Enter the second number: ");

            // Perform the chosen operation
            switch (choice) {
                case 1:
                    double sum = add(num1, num2);
                    displayResult(num1, num2, sum, "Addition");
                    break;
                case 2:
                    double difference = subtract(num1, num2);
                    displayResult(num1, num2, difference, "Subtraction");
                    break;
                case 3:
                    double product = multiply(num1, num2);
                    displayResult(num1, num2, product, "Multiplication");
                    break;
                case 4:
                    if (num2 != 0) {
                        double quotient = divide(num1, num2);
                        displayResult(num1, num2, quotient, "Division");
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Function to get input from the user
    public static double getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextDouble();
    }

    // Function for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Function for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Function for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Function for division
    public static double divide(double a, double b) {
        return a / b;
    }

    // Function to display the result
    public static void displayResult(double num1, double num2, double result, String operation) {
        System.out.printf("%s of %.2f and %.2f is: %.2f%n", operation, num1, num2, result);
    }
}
