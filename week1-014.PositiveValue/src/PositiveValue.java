
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int num = Integer.parseInt(reader.nextLine()); 
        
        System.out.print("The number is");
        
        if (num > 0){ 
            System.out.print(" positive.");
        } else { 
            System.out.print(" not positive.");
        }
            
         
        
    }
}
