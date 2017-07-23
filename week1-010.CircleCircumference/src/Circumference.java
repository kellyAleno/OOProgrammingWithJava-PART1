
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the radius: ");
        int radius = Integer.parseInt(reader.nextLine());
        double pi = 3.14159265; 
        double circle = 2 * pi * radius;
        
        System.out.print("Circumference of the circle: " + circle);
        // Program your solution here 
    }
}
