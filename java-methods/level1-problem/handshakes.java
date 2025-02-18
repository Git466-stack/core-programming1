import java.util.*;
public class handshakes {
    public static int calculatehandshakes(int n){
        return (n*(n-1)/2);
    }
    public static void main(String[] args) {
        // Scanner object to take user input 
        Scanner sc  = new Scanner(System.in);

        // enter the number of student 
        System.out.println("Enter the number of students: ");
        int students = sc.nextInt();

        int handshakes = calculatehandshakes(students);
        System.out.println("The maximum number of handshakes among " + students + " students is: " + handshakes);
    


    }
}
