import java.util.Scanner;

public class KilometertoMlies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float distance = sc.nextFloat();
        float  ans = (float) (distance*1.6);
        System.out.println(ans);

    }
}
