import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Type exam scores, -1 completes:");

        Grade grade = new Grade();

        grade.doSomething(reader);
        grade.printStars();
        grade.printAcceptance();
    }
}

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int[] marks = new int[6]; 
        for (int mark : marks) { 
            mark = 0; 
        }
        
        int points = 0; 
        int allScores = 0; 

        System.out.print("Type the points [0-60]: ");
        points = Integer.parseInt(reader.nextLine());
        for (allScores = 0; points != -1; points = Integer.parseInt(reader.nextLine())){
        // while(points != -1) { 
            //points = Integer.parseInt(reader.nextLine());
            if (points < 0 || points > 100) { 
                continue; 
            } else { 
                allScores ++;
            }
            
     
            if (points > 0 && points <= 29) { 
                marks[0]++;
            } else if (points > 29 && points <= 34) { 
                marks[1]++;
            } else if (points > 34 && points <= 39) { 
                marks[2]++;
            } else if (points > 39 && points <= 44) { 
                marks[3]++;
            } else if (points > 44 && points <= 49) { 
                marks[4]++;
            } else  { 
                marks[5]++;
            }
        }
        
        System.out.println("Grade distribution:");
        for(int i = 5; i >= 0; i--) {  
            String toPrint = ""; 
            toPrint += i; 
            toPrint += ": "; 
            for (int j = 0; j < marks[i]; j++) {
                toPrint += "*";
            }
            System.out.println(toPrint);
        }
        System.out.println(marks[0]);
        System.out.println(allScores);
        float acceptanceP = (float)(allScores-marks[0])*100/allScores; 
        System.out.println("Acceptance percentage: " + acceptanceP);
    }
}
*/