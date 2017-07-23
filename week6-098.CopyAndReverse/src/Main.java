
import java.util.Arrays;



public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3, 4}; 
        int[] copied = copy(original); 
        int[] reversed = reverseCopy(original); 
        
        //copied[0] = 999; 
        
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("copied: " + Arrays.toString(copied));
        System.out.println("reversed: " + Arrays.toString(reversed));
        //System.out.println(original.length);
        
    }
    
    public static int[] copy(int[] array) { 
        int[] copy = new int[array.length]; 
        
        int i; 
        for (i = 0; i < array.length; i++) { 
            copy[i] = array[i]; 
        }
        return copy; 
    }
    
    public static int[] reverseCopy(int[] array) { 
        int[] copy = new int[array.length]; 
        
        int i; 
        int j = array.length-1; 
        for (i = 0; i < array.length; i++) { 
            copy[j-i] = array[i]; 
        }
        return copy; 
    }
}
