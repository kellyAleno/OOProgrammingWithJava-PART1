
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number:");
        int int1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number:");
        int int2 = Integer.parseInt(reader.nextLine());
        
        double result = (double)int1/int2;
        String division = "Division: " + int1 + "/" + int2 + " = " + result;
        
        System.out.print(division);
        // Implement your program here. Remember to ask the input from user.
    }
}
