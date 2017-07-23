
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        int guess = -1; 
        int guesses = 0; 
        while (guess != numberDrawn) { 
            System.out.println("Guess a number: ");  
            guess = Integer.parseInt(reader.nextLine()); 
            
            if (guess < numberDrawn) { 
                System.out.print("The number is greater ");
            } else if (guess > numberDrawn) { 
                System.out.print("The number is lesser ");
            } else { 
                System.out.println("Congratulations, your guess is correct!");
                break; 
            }
            
            guesses++; 
            System.out.println("guesses made: " + guesses);
        }

        
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
