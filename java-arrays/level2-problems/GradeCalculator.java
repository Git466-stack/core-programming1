import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Input the number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // 2. Create a 2D array for marks: each row is one student, columns for Physics, Chemistry, Math
        int[][] marks = new int[n][3];
        // Arrays to store percentage and grade
        double[] percentages = new double[n];
        String[] grades = new String[n];

        // 3. Input marks, validate, compute percentage, determine grade
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            // Physics
            System.out.print("Physics: ");
            int physics = sc.nextInt();
            // Validate
            if (physics < 0) physics = 0;
            if (physics > 100) physics = 100;
            marks[i][0] = physics;

            // Chemistry
            System.out.print("Chemistry: ");
            int chemistry = sc.nextInt();
            // Validate
            if (chemistry < 0) chemistry = 0;
            if (chemistry > 100) chemistry = 100;
            marks[i][1] = chemistry;

            // Math
            System.out.print("Math: ");
            int math = sc.nextInt();
            // Validate
            if (math < 0) math = 0;
            if (math > 100) math = 100;
            marks[i][2] = math;

            // Calculate percentage (average of 3 subjects)
            double sum = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = sum / 3.0;

            // Determine grade
            grades[i] = getGrade(percentages[i]);
        }

        // 5. Display data in forward order
        System.out.println("\n--- Forward Order ---");
        System.out.printf("%-10s %-10s %-10s %-12s %-10s\n",
                          "Physics", "Chemistry", "Math", "Percentage", "Grade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-10d %-10d %-12.2f %-10s\n",
                              marks[i][0], marks[i][1], marks[i][2],
                              percentages[i], grades[i]);
        }

        // 6. Reverse the rows of the 2D array (in-place)
        reverseRows(marks);

        // Recompute percentage and grade after reversing
        for (int i = 0; i < n; i++) {
            double sum = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = sum / 3.0;
            grades[i] = getGrade(percentages[i]);
        }

        // 7. Display data in reverse order (after reversing the array)
        System.out.println("\n--- Reverse Order ---");
        System.out.printf("%-10s %-10s %-10s %-12s %-10s\n",
                          "Physics", "Chemistry", "Math", "Percentage", "Grade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-10d %-10d %-12.2f %-10s\n",
                              marks[i][0], marks[i][1], marks[i][2],
                              percentages[i], grades[i]);
        }

        sc.close();
    }
    
    public static String getGrade(double percentage) {
        if (percentage >= 80) {
            return "A (Level 4)";
        } else if (percentage >= 70) {
            return "B (Level 3)";
        } else if (percentage >= 60) {
            return "C (Level 2)";
        } else if (percentage >= 50) {
            return "D (Level 1)";
        } else {
            return "E (Remedial)";
        }
    }

    // Helper method to reverse rows of a 2D array
    public static void reverseRows(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            // swap row i with row (n - 1 - i)
            int[] temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
    }
}