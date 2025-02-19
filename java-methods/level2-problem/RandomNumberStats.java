import java.util.Scanner;
import java.util.Arrays;

public class RandomNumberStats {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = 1000 + (int) (Math.random() * 9000); // Ensures 4-digit numbers
        }
        return randomNumbers;
    }

    // Method to find average, min, and max values of an array
    public static double[] findAverageMinMax(int[] numbers) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of random values to generate: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Size must be greater than 0.");
        } else {
            int[] randomNumbers = generate4DigitRandomArray(size);
            System.out.println("Generated random numbers: " + Arrays.toString(randomNumbers));

            double[] results = findAverageMinMax(randomNumbers);
            System.out.printf("Average: %.2f\n", results[0]);
            System.out.println("Minimum: " + (int) results[1]);
            System.out.println("Maximum: " + (int) results[2]);
        }

        scanner.close();
    }
}
