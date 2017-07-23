
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }
    
    // sana, virheita, viersti, havisit, arvatut (kirajaimet)
    // word, (number of) faults, message, you lost, and guessed (letters)

    public void guessLetter(String letter) {

        if (!guessedLetters.contains(letter)) {
            guessedLetters += letter; 
            if(!word.contains(letter)) { 
                numberOfFaults++;  
            }
        }
       
        
        // program here the functionality for making a guess

        // if the letter has already been guessed, nothing happens

        // it the word does not contains the guessed letter, number of faults increase
        // the letter is added among the already guessed letters
    }

    public String hiddenWord() {
        
        String hiddenWord = ""; 
        String guessed = ""; 
        int i = 0; //use this to iterate through word
        
        
        while(i < word.length()) { 
            char guess = word.charAt(i); 
            //character.toString spits out a one chara string 
            guessed = Character.toString(guess); 
            
            //contains only takes in strings
            if (guessedLetters.contains(guessed)) {
                hiddenWord += guess;
            } else { 
                hiddenWord += "_";
            }    
            i++;
        }
        
        return hiddenWord; 
        
    }
}
