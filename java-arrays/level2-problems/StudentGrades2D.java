import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // 2D array to store marks for each student and each subject.
        // Each row represents a student and columns: 0 - Physics, 1 - Chemistry, 2 - Maths.
        int[][] marks = new int[numStudents][3];

        // Arrays to store percentages and grades of the students.
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        // Input marks for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            // Input marks for each subject with validation
            marks[i][0] = getValidMarks(scanner, "Physics");
            marks[i][1] = getValidMarks(scanner, "Chemistry");
            marks[i][2] = getValidMarks(scanner, "Maths");

            // Calculate percentage (average of three subjects)
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // Assign grade based on percentage
            grades[i] = getGrade(percentages[i]);
        }

        // Display the results
        System.out.println("\nStudent Results:");
        System.out.println("---------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-12s %-5s\n", "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        System.out.println("---------------------------------------------------");

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-12.2f %-5c\n", 
                (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

        scanner.close();
    }

    // Method to validate and take only valid marks (0-100)
    private static int getValidMarks(Scanner scanner, String subject) {
        int marks;
        do {
            System.out.print(subject + " marks (0-100): ");
            marks = scanner.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Please enter a value between 0 and 100.");
            }
        } while (marks < 0 || marks > 100);
        return marks;
    }

    // Method to assign grade based on percentage
    private static char getGrade(double percentage) {
        if (percentage >= 80) return 'B';       // Level 4
        else if (percentage >= 70) return '9';    // Level 3
        else if (percentage >= 60) return 'C';    // Level 2
        else if (percentage >= 50) return '+';    // Level 1
        else if (percentage >= 40) return 'E';    // Level 1-
        else return 'R';                        // Remedial
    }
}