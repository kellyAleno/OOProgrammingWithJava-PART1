
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        // write code here
        for (int number : array) { 
            int i = 0; 
            while (i < number) { 
                System.out.print("*");
                i++; 
            }
            System.out.println("");
        }
    }
}
