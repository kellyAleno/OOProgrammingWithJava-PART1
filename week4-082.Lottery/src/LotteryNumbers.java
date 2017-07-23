import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random = new Random(); 
    
    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // 7 numbers btw 1 and 39
        int addNum; 
        int counter = 0;
        
        while (counter < 7) { 
            addNum = this.random.nextInt(39) + 1; 
            if (!containsNumber(addNum)){
                numbers.add(addNum); 
                counter++; 
            }
        }
        // Write the number drawing here using the method containsNumber()
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        return numbers.contains(number); 
    }
}
