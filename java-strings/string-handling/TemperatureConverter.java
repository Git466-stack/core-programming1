import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display options to the user
            System.out.println("\nTemperature Converter:");
            System.out.println("1. Convert Fahrenheit to Celsius");
            System.out.println("2. Convert Celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1/2/3): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Convert Fahrenheit to Celsius
                    double fahrenheit = getInput("Enter temperature in Fahrenheit: ");
                    double celsius = fahrenheitToCelsius(fahrenheit);
                    displayResult(fahrenheit, celsius, "Fahrenheit", "Celsius");
                    break;
                case 2:
                    // Convert Celsius to Fahrenheit
                    celsius = getInput("Enter temperature in Celsius: ");
                    fahrenheit = celsiusToFahrenheit(celsius);
                    displayResult(celsius, fahrenheit, "Celsius", "Fahrenheit");
                    break;
                case 3:
                    // Exit the program
                    System.out.println("Exiting the program. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Function to take a double input from the user
    public static double getInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextDouble();
    }

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Function to display the conversion result
    public static void displayResult(double inputTemp, double convertedTemp, String inputUnit, String outputUnit) {
        System.out.printf("%.2f %s is equal to %.2f %s%n", inputTemp, inputUnit, convertedTemp, outputUnit);
    }
}
