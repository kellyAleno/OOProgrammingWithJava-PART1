import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        System.out.print("Type a word: ");
        String toInsert = reader.nextLine();
        
        while (!toInsert.isEmpty()) { 
            words.add(toInsert);
            System.out.print("Type a word: ");
            toInsert = reader.nextLine(); 
        }
        
        int counter = 0; 
        System.out.println("You typed the following words: ");
        for (String word : words) { 
            System.out.println(word); 
        }
        /*while (counter < words.size()) { 
            System.out.println(words.get(counter));
            counter++; 
        }*/
        
    }
}
