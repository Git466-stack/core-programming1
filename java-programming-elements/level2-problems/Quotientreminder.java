import java.util.*;
public class Quotientreminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        int quotient = number1/number2;
        int reminder = number1%number2;

        System.out.println("The quotient is " + quotient + " " + "The reminder is " + " " +   reminder);
    }
}
