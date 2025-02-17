import java.util.Scanner;

public class TwoDToOneDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Create a 2D array and take user input for its elements
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Create a 1D array to store the elements of the 2D array
        int[] array = new int[rows * columns];
        int index = 0;

        // Copy elements from 2D array to 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index++] = matrix[i][j];
            }
        }

        // Display the 2D array
        System.out.println("The 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Display the 1D array
        System.out.println("The 1D array is:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
