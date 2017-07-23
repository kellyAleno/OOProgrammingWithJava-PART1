
public class BoundedCounter {
    private int value; 
    private int upperLimit;
    
    public BoundedCounter(int upperLimit) { 
        this.value = 0; 
        this.upperLimit = upperLimit; 
    }
    
    public void next() { 
        value++;
        if (value > upperLimit) { 
            value = 0; 
        }
    }
    
    @Override
    public String toString() { 
        String valueString =""+  value; 
        if (value < 10) { 
            valueString = "0" + value; 
        }
        return valueString; 
    }
    
    public void setValue(int newValue) { 
        if (newValue >= 0 && newValue < upperLimit) { 
            value = newValue;
        } 
    }
    public int getValue() { 
        return value; 
    }
}

