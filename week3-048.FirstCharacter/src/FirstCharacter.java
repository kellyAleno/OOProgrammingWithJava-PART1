import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = reader.nextLine(); 
        char first = firstCharacter(name);
        System.out.println("First character: " + first);
    }
    
    public static char firstCharacter(String text) { 
        char firstChar = text.charAt(0);
        return firstChar; 
    }
}
