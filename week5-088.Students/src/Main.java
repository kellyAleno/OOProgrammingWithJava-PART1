
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
//        Student Aven = new Student("Aven", "999999");
//        System.out.println(Aven.getName());
//        System.out.println(Aven.getStudentNumber());
//        System.out.println(Aven);
        
        ArrayList<Student> list = new ArrayList<Student>(); 
        
        Scanner reader = new Scanner(System.in); 
//        System.out.println("name: ");
//        String Name = reader.nextLine(); 
//        System.out.println("studentnumber: ");
//        String StudentNumber = reader.nextLine();
//        
        while (true) { 
            System.out.println("name: ");
            String Name = reader.nextLine(); 
            
            if (Name.isEmpty()) { 
                break; 
            }
            
            System.out.println("studentnumber: ");
            String StudentNumber = reader.nextLine();   
            
            list.add(new Student(Name, StudentNumber)); 
        }
        
        System.out.println("");
        
        for (Student students : list) { 
            System.out.println(students);
        }
        
        System.out.println("");
        System.out.println("Give search term: ");
        String search = reader.nextLine();        
        System.out.println("Result: ");
        System.out.println("");
        
        for (Student students : list) { 
            String name = students.getName(); 
            if (name.contains(search)) { 
                System.out.println(students);
            }
        }
        
    }
}