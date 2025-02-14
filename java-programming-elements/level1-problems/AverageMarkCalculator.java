public class AverageMarkCalculator {
    public static void main(String[] args) {
        // Marks in each subject
        int maths = 94;
        int physics = 95;
        int chemistry = 96;

        // Calculate the total marks and average percentage
        int totalSubjects = 3; // Number of subjects
        double averageMark = (maths + physics + chemistry) / (double) totalSubjects;

        // Display the result
        System.out.println("Sam’s average mark in PCM is " + averageMark);
    }
}
