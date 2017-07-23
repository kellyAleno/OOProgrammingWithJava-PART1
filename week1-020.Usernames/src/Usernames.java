
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your usrename: "); 
        String un = reader.nextLine();
        System.out.print("Type your password: ");
        String pw = reader.nextLine(); 
        
        if (un.equals("emily") && pw.equals("cat") ) { 
            System.out.print("You are now logged into the system!");
        } else if (un.equals("alex") && pw.equals("mightyducks")) { 
            System.out.print("You are now logged into the system!");
        } else { 
            System.out.print("Your username or password was invalid!");
        }
    }
}
