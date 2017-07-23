
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner reader = new Scanner(System.in);
        // write here code to ensure that BoundedCounter works as expected
        // before starting 78.3 remove the extra code and use the skeleton shown
        // in the assignment
        
        BoundedCounter seconds = new BoundedCounter(60); 
        BoundedCounter minutes = new BoundedCounter(60); 
        BoundedCounter hours = new BoundedCounter(24); 
        
        seconds.setValue(50);
        minutes.setValue(59);
        hours.setValue(23);
        
        while(true) { 
            System.out.println(hours + ":" + minutes + ":" + seconds);
            Thread.sleep(1000); 
            
            seconds.next();
            if (seconds.getValue() == 60) {        
                minutes.next();  
                if(minutes.getValue() == 60) { 
                    hours.next();
                    if (hours.getValue() == 24) { 
                        hours.setValue(0);
                    }
                    minutes.setValue(0);
                }
                seconds.setValue(0);
            } 
            
            
        }
        /*
        
        BoundedCounter hours = new BoundedCounter(24); 
        BoundedCounter minutes = new BoundedCounter(60);
        BoundedCounter seconds = new BoundedCounter(60);
        //System.out.println(counter);
        System.out.println("Seconds: ");
        int s = Integer.parseInt(reader.nextLine()); 
        System.out.println("Minutes: ");
        int m = Integer.parseInt(reader.nextLine()); 
        System.out.println("Hours: ");
        int h = Integer.parseInt(reader.nextLine()); 
        
        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);
        
        int i = 0; 
        
        while (i < 121) { 
            System.out.println(hours + ":" + minutes + ":" + seconds);
            seconds.next();
            if (seconds.getValue() == 60) { 
                seconds.setValue(0);
                minutes.next();  
                if(minutes.getValue() == 60) { 
                    minutes.setValue(0);
                    hours.next();
                    if (hours.getValue() == 24) { 
                        hours.setValue(0);
                    }
                }
            } 
            
            i++; 
        }
        */
    }
}
