import java.util.Scanner;

public class PercentMark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mathMarks = sc.nextInt();
        int physicsMarks = sc.nextInt();
        int chemistryMarks = sc.nextInt();
        double  avg = physicsMarks+mathMarks+chemistryMarks/3.0;
        System.out.println(avg);

    }
}
