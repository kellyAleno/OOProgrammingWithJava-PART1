
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int lower = Integer.parseInt(reader.nextLine()); 
        System.out.println("Last: ");
        int upper = Integer.parseInt(reader.nextLine()); 
        
        if (lower < upper) { 
            while (lower != upper) { 
                System.out.println(lower);
                lower++; 
            }

            System.out.println(lower);
        } else if (lower == upper) { 
            System.out.println(lower);
        } else { 
            
        }
        // write your code here

    }
}
