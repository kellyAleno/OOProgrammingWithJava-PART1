import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type you name: ");
        
        String name = reader.nextLine(); 
        int nameLength = name.length(); 
        
        System.out.print("In reverse order: ");
        
        while (nameLength != 0) { 
            System.out.print(name.charAt(nameLength-1));
            nameLength--; 
        }
    }
}
