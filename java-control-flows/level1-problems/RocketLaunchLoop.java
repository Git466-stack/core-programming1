import java.util.*;
public class RocketLaunchLoop {
    public static void main(String[] args) {
        // create a Scanner object for user input 
        Scanner sc = new Scanner(System.in);

        // user to enter the starting value for the countdown

        System.out.println("Enter the Starting number for the countdown:");
        int counter = sc.nextInt();

        // start the countdown using a for loop

        System.out.println("Starting countdown");

        for(int i = counter;i>=1;i--){
            System.out.println(i);
        }
    }
}
