
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your name: ");
        
        String name = reader.nextLine(); 
        int nameLength = name.length(); 
        int counter = 0; 
        
        while (counter != nameLength) { 
            System.out.println((counter + 1) +". character: " 
                    + name.charAt(counter));
            counter++; 
        }
    }
}
