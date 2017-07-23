
public class Main {

    public static void main(String[] args) {
        // write test code here
        LyyraCard newCard = new LyyraCard(100);
        System.out.println(newCard.balance());
        newCard.pay(20); 
        System.out.println(newCard.balance());
        
        CashRegister uniCafe = new CashRegister(); 
        
        boolean succeeded = uniCafe.payEconomical(newCard); 
        System.out.println("payment success: " + succeeded);
    }
}

