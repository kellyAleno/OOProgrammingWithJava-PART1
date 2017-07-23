
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        String reversed = ""; 
        
        int wordLen = text.length(); 
        while (wordLen != 0) { 
            reversed += text.charAt(wordLen-1);
            wordLen--; 
        }
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        return reversed;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}