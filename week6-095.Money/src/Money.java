
import static java.lang.Math.abs;


public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }
    
    public Money plus(Money added) { 
        Money newMoney = new Money(added.euros() + this.euros, 
                added.cents() + this.cents); 
        return newMoney; 
    }
    
    public boolean less(Money compared) { 
        int thisTotal = this.euros * 100 + this.cents; 
        int comparedTotal = compared.euros() * 100 + compared.cents(); 
        return (thisTotal < comparedTotal); 
    }
    
    public Money minus(Money decremented) {
        
        //Money a = new Money(10,0);
        //Money b = new Money(3,50);
        int newEuros = this.euros - decremented.euros(); //7
        int newCents = this.cents - decremented.cents(); //-50
        
        if (newEuros < 0) {             
            newEuros = 0; 
            newCents = 0;            
        } else { 
            newEuros -= 1; 
            newCents = 100 - abs(newCents);
        }
        
        
        Money newMoney = new Money(newEuros, newCents);
        
        return newMoney;
    }
    
    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
