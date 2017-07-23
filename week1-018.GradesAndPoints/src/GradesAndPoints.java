
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the points [0-60]: ");
        int points = Integer.parseInt(reader.nextLine());
        
        //int grade = -1;
        if (points > 0 && points <= 29) { 
            System.out.print("Grade: failed");
            //System.exit(0); 
        } else if (points > 29 && points <= 34) { 
            System.out.print("Grade: " + 1);
        } else if (points > 34 && points <= 39) { 
            System.out.print("Grade: " + 2);
        } else if (points > 39 && points <= 44) { 
            System.out.print("Grade: " + 3); 
        } else if (points > 44 && points <= 49) { 
            System.out.print("Grade: " + 4); 
        } else /*if (points > 49 && points <= 60)*/ { 
            System.out.print("Grade: " + 5);
        }
        
        //System.out.print("Grade: " + grade);
    }
}
