
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Teadona
 */
public class Bird {
    private String name; 
    private String latin_name; 
    private int nObservations;
    
    public Bird(String name, String latin_name) {
        this.name = name; 
        this.latin_name = latin_name; 
        this.nObservations = 0; 
    }
    
    public String getName () { 
        return this.name;
    }
    public void add() { 
        this.nObservations++; 
    }
    
    @Override
    public String toString() { 
        return this.name + "(" + this.latin_name + ")" + ": " + 
                this.nObservations + " observations"; 
    }
}
