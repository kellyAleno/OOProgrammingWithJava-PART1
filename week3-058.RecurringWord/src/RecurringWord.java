
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> words = new ArrayList<String>(); 
        String toInsert = "";

        while(true) { 
            System.out.print("Type a word: ");
            toInsert = reader.nextLine();     
            if (words.contains(toInsert)) { 
                break; 
            } else { 
                words.add(toInsert); 
            }
        }
        
        System.out.println("You gave the word " + toInsert + " twice.");
    }
}
