
public class EvenNumbers {

    public static void main(String[] args) {
        // Write your code here
        int count = 2; 
        
        while (count < 101) { 
            if (count % 2 == 0) { 
                System.out.println(count);
            }
            count++; 
        }
    }
}
