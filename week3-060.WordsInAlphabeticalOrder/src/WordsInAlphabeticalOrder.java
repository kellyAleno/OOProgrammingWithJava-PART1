
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>(); 
        while (true) { 
            System.out.println("Type word: ");
            String toInsert = reader.nextLine(); 
            
            if(toInsert.isEmpty()) { 
                break; 
            } else {
                words.add(toInsert);
            }
        }
        
        Collections.sort(words);
        
        for(String word: words) { 
            System.out.println(word);
        }
    }
}
