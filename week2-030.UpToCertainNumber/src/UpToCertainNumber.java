
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Up to what number?");
        
        int upto = Integer.parseInt(reader.nextLine()); 
        int count = 1; 
        
        while (count != upto) { 
            System.out.println(count);
            count++;
        }
        
        System.out.println(count);
        
    }
}
