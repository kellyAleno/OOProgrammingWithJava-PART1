
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        
        String pw = "NULL"; 
        
        while(!pw.equals(password)) { 
        System.out.print("Type the password: ");
        pw = reader.nextLine();    
        
        System.out.print("Wrong!");
        }
        
        System.out.println("Right!\n");
        System.out.print("The secret is: nothing!");
    }
}
