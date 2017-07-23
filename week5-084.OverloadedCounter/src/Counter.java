/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Teadona
 */
public class Counter {
    private int startingValue; 
    private boolean check; 
    
    public Counter(int startingValue, boolean check) { 
        this.startingValue = startingValue; 
        this.check = check; 
    }
    
    public Counter(int startingValue) {
        this(startingValue, false);
    }
    
    public Counter(boolean check) { 
        this(0, check);
    }
    
    public Counter() { 
        this(0, false); 
    } 
    
    public int value() { 
        return startingValue; 
    } 
    
    public void increase() { 
        increase(1); 
    }
    
    public void decrease() { 
        decrease(1); 
    }
    
    public void increase (int increaseAmount) { 
        if (!(increaseAmount < 0)) { 
            startingValue += increaseAmount;  
        }
    }
    
    public void decrease (int decreaseAmount) { 
        
        if (!(decreaseAmount < 0)) { 
            startingValue -= decreaseAmount; 
            if (startingValue < 0 && check == true) { 
                startingValue = 0; 
            }    
        }
    }
}
