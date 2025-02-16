//package core-programming.java-control-flows.level1-problems;
import java.util.*;
public class RocketLaunch {
    public static void main(String[] args) {
        // create a Scanner object for user input 

        Scanner sc =new Scanner(System.in);

        // user to enter the starting value for the countdown
        int counter = sc.nextInt();

        // start the countdown using a while loop
        System.out.println("Starting countdown: ");
        while (counter>=1) {
            // print the counter value
            System.out.println(counter);
            // decrement the counter
            counter--;
        }
    }
}
