import java.util.*;
import java.util.regex.*;
public class validateLicence {
    public static void main(String[] args) {
       String  regex = "^[A-Z]{2}\\d{4}$";
       Scanner sc = new Scanner(System.in);

       String  licence = sc.nextLine();

       if(Pattern.matches(regex, licence)){
        System.out.println("✅" + licence + " is valid ");
       }
       else{
        System.out.println("❌ " + licence + "is invalid");
       }

    }
}
