import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = reader.nextLine();
        char last = lastCharacter(name); 
        System.out.println("Last character: " + last);
        
    }
    
    public static char lastCharacter(String text) { 
        int strLength = text.length(); 
        return text.charAt(strLength-1);
    }
}
