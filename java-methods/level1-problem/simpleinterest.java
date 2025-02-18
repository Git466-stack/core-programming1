import java.util.*;
public class simpleinterest {
    public static double calculateSi(double principal, double rate, double time){
        return (principal*rate*time)/100;
    }
    public static void main(String[] args) {
        // Scanner object to take user input 
        Scanner sc = new Scanner(System.in);
        // Taking input values for principal , Rate , and Time
        System.out.println("Enter Principal: ");
        double principal = sc.nextDouble();
        System.out.println("Enter Rate of Interest: ");
        double  rate = sc.nextDouble();
        System.out.println("Enter Time: ");
        double time = sc.nextDouble();

        double simpleinterest = calculateSi(principal, rate, time);

        System.out.println("The Simple Interest is " +  simpleinterest + " for Principal " + principal +  " Rate of Interest " + rate + " and Time " + time);
    }
}

