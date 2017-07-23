
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        
        Account newAccount = new Account("newAccount", 100); 
        newAccount.deposit(20);
        System.out.println(newAccount);
        System.out.println(newAccount.toString());
    }

}
