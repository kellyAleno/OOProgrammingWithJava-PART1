
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Until what?");
        int until = Integer.parseInt(reader.nextLine()); 
        int count = 0; 
        int total = 0; 
        until++; 
        while (count != until){ 
            total+=count; 
            count++; 
        }
        System.out.println("Total is: " + total);

    }
}
