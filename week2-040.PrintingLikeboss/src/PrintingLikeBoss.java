public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int count = 0; 
      
        while (count < amount) {
            System.out.print("*");
            count++; 
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int count = 0; 
        
        while (count < amount) { 
            System.out.print(" ");
            count++; 
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int row = 0; 
        int col; 
        
        while (row < size) { 
            printWhitespaces(size - row - 1);
            printStars(row + 1);
            row++; 
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int row = 0; 
        int col; 
        while (row < height) { 
            printWhitespaces(height - row - 1);
            printStars(row*2 + 1);
            row++; 
        }
        
        printWhitespaces(height-2);
        printStars(3);
        printWhitespaces(height-2);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
