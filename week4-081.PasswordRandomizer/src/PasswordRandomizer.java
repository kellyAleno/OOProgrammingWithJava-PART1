import java.util.Random;

public class PasswordRandomizer { 
    private int passLength; 
    private Random random = new Random(); 
    
    public PasswordRandomizer(int length) {
        this.passLength = length; 
    }

    public String createPassword() {
        // write code that returns a randomized password
        String passBuffer = ""; 
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int counter = 0; 
        
        while (counter < passLength) { 
            int useLetter = this.random.nextInt(26); 
            char toAdd = alphabet.charAt(useLetter);
            passBuffer += toAdd; 
            counter++; 
        }
        return passBuffer;
    }
}
