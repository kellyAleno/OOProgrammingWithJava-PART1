
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Teadona
 */
public class NightSky {
    private double density; 
    private int width; 
    private int height; 
    private int starsInLastPrint = 0; 
    
    public NightSky (double density, int width, int height) { 
        this.density = density; 
        this.width = width; 
        this.height = height; 
    }
    
    public NightSky(double density) { 
        this(density, 20, 10); 
    }
    
    public NightSky(int width, int height) { 
        this(0.1, width, height); 
    }
    
    public void printLine() { 
        Random rand = new Random(); 
        String line = ""; 
        int i; 
        for (i = 0; i < width; i++) { 
            if (rand.nextDouble() <= this.density) { 
                line += "*";
                starsInLastPrint++; 
            } else { 
                line += " ";
            }
        }
        System.out.println(line);
    }
    
    public void print() { 
        int i; 
        starsInLastPrint = 0; 
        for (i = 0; i < height; i++) { 
            printLine(); 
        }
    }
    
    public int starsInLastPrint() { 
        return starsInLastPrint; 
    }
    
}
