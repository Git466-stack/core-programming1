import java.util.*;
public class maximumhandshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" Enter the number of students ");
        int numberofStudents = sc.nextInt();

        int possiablehandshakes = (numberofStudents*(numberofStudents-1))/2;
        System.out.println(possiablehandshakes); 
    }
}
