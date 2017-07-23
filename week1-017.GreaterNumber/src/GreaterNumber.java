import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the first number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type the second number: ");
        int num2 = Integer.parseInt(reader.nextLine());
        
        System.out.print("Greater number: "); 
        
        if (num1 > num2) { 
            System.out.print(num1);
        } else if (num2 > num1) { 
            System.out.print(num2);
        } else { 
            System.out.print("The numbers are equal!");
        }
        //System.out.print("Greater number: " + Math.max(num1, num2));
    }
}
