
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine()); 
        int sum = 0; 
        int count = 0; 
        
        while (count != number) { 
            sum += Math.pow(2, count); 
            count++; 
        }
        
        sum += Math.pow(2, count); 
        
        System.out.println("The result is " + sum);
        
    }
}
