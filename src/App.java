import java.util.*;
import java.util.regex.Pattern;

public class App {
    
    public static void main(String args[]) {

        System.out.println("Please input your password: ");
        
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,16}$";
        boolean validPassword = isValidPassword(password, regex);
        System.out.println("Is password valid: \n" + validPassword);
        scanner.close();
    }
 
    public static boolean isValidPassword(String password, String regex)
    {
        Pattern pattern = Pattern.compile(regex);
        java.util.regex.Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}