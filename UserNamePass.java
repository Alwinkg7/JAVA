import java.util.Scanner;
import java.lang.Exception;
class UsernameException extends Exception {
    UsernameException(String msg) {
        System.out.println(msg);
    }
}
class PasswordException extends Exception {
    PasswordException(String msg) {
        System.out.println(msg);
    }
}
public class UserNamePass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username, password;
        System.out.println("Enter username: ");
        username = sc.nextLine();
        System.out.println("Enter Password: ");
        password = sc.nextLine();
        int len = username.length();
        try {
            if(len<10)
               throw new UsernameException("Username must be greater 10 characters");
            else if(!password.equals("admin"))
               throw new PasswordException("Incorrect password\n");
            else
               System.out.print("Login successfull");
        }
        catch(UsernameException u) {
            System.out.println(u);
        }
        catch(PasswordException p) {
            System.out.println(p);
        }
    }
}
