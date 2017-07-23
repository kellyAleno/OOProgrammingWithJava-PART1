
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read from user in this variable
        int count = 0; 
        while(count != 3) { 
            System.out.print("Type in a number: ");
            read = Integer.parseInt(reader.nextLine());
            
            sum = sum + read; 
            count++; 
        }

        // Write your program here
        // Use only variables sum and read

        System.out.println("Sum: " + sum);
    }
}
