import java.util.*;
import java.util.regex.*;
public class ValidateUsername {
    public static void main(String[] args) {
        
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";

        Scanner sc = new Scanner(System.in);

        String username = sc.nextLine();

        if(username.matches(regex)){
            System.out.println("✅ "+  username + "valid");
        }
        else{
            System.out.println("❌ " + username + "Invalid");
        }
    }
}
