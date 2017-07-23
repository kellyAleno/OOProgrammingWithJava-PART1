
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int int1 = Integer.parseInt(reader.nextLine()); 
        System.out.print("Type another number: ");
        int int2 = Integer.parseInt(reader.nextLine()); 
        
        int larger = Math.max(int1, int2);
        String said = "The bigger number of the two numbers given was: ";
        System.out.println(said + larger);
        
        // Implement your program here. Remember to ask the input from user
    }
}
