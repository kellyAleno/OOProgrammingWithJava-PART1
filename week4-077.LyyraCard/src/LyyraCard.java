/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Teadona
 */
public class LyyraCard {
    private double balance; 
    
    public LyyraCard (double balanceAtStart){ 
        this.balance = balanceAtStart; 
    }
    
    @Override
    public String toString() { 
        String balanceString = "The card has " + balance + " euros";
        return balanceString; 
    }
    
    public void payEconomical() { 
        if ((balance - 2.5) < 0) {
        } else {
            balance -= 2.5;
        } 
    }
    
    public void payGourmet() { 
        if ((balance - 4) < 0) { 
        } else {
            balance -= 4.0;
        } 
    }
    
    public void loadMoney (double amount) { 
        if (amount < 0) { 
        } else { 
            balance += amount;
        } 
        
        if (balance > 150) { 
            balance = 150; 
        }
    }
    
}
