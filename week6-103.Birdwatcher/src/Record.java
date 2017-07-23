
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Teadona
 */
public class Record {
    private ArrayList<Bird> birds; 
    
    public Record () { 
        this.birds = new ArrayList<Bird>(); 
    }
    
    public void beginRecord(Scanner reader) { 
        mainloop:       
        while(true){
            System.out.print("? ");
            String input = reader.nextLine(); 
            if (input.equals("Add")) { 
                System.out.print("Name: ");
                String name = reader.nextLine();
                
                System.out.print("Latin Name: ");
                String latinName = reader.nextLine(); 
                
                Bird newBird = new Bird(name, latinName); 
                birds.add(newBird); 
                
            } else if (input.equals("Observation")) { 
                System.out.print("What was observed: ? ");
                String observed = reader.nextLine(); 
                
                for (Bird a : birds) { 
                    if (a.getName().equals(observed)) { 
                        a.add(); 
                        continue mainloop; 
                    }
                }
                System.out.println("It's not a bird!");
                
            } else if (input.equals("Statistics")) {   
                for(Bird a : birds) { 
                    System.out.println(a);
                }
            } else if (input.equals("Show")) {
                System.out.print("What? ");
                String toShow = reader.nextLine(); 
                for (Bird a : birds) { 
                    if (a.getName().equals(toShow)) { 
                        System.out.println(a);; 
                        continue mainloop; 
                    }
                }
            } else if (input.equals("Quit")){
                break; 
            }
        }
    }
    
}
