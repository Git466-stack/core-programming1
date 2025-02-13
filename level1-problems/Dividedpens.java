import java.util.*;
public class Dividedpens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPens = 14;
        int totalStudnts = 3;

        int penperStudent = totalPens/totalStudnts;
        int remainingPens = totalPens% totalStudnts;

        System.out.println("The pen per Student  " + penperStudent + "The remaining pens are is " + remainingPens);
    }
}
