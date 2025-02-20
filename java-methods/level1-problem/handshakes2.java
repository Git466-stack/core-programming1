import java.util.*;
public class handshakes2 {
    public static void main(String[] args) {
        // Scanner object to take user input 
        Scanner sc = new Scanner(System.in);

        // Enter number of student
        System.out.println("Enter number of student ");
        int student = sc.nextInt();

        // print the result for possiable handshakes 

        int handshakes = (student*(student-1))/2;

        System.out.println("The maximum number of handshakes among " + student + " student is: " + handshakes);

    }
}


