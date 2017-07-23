public class Printing {

    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        int count = 0; 
        while (count != amount) { 
            System.out.print("*");
            count++;
        }
        System.out.println("");
        // call this command amount times   
        
    }

    public static void printSquare(int sideSize) {
        int count = 0; 
        while (count != sideSize) { 
            printStars(sideSize); 
            count++; 
        }
        /*int row = 0; 
        int col; 
        
        while (row < sideSize) { 
            col = 0; 
            while (col < sideSize) { 
                System.out.print("*");
                col++; 
            }
            System.out.println("");
            row++; 
        }
                */
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        int count = 0; 
        
        while (count != height) { 
            printStars(width); 
            count++; 
        } 
        /*int row = 0; 
        int col; 
        
        while (row != height) { 
            col = 0; 
            while (col != width) { 
                System.out.print("*");
                col++; 
            }
            System.out.println("");
            row++; 
        }
                */
        
    }

    public static void printTriangle(int size) {
        // 39.4
        int count = 1; 
        
        while (count <= size) { 
            printStars(count);
            count++; 
        }
        
        /*
        int row = 0;
        int col; 
        
        while (row != size) { 
            col = 0; 
            while (col <= row) { 
                System.out.print("*");
                col++; 
            }
            System.out.println("");
            row++; 
        }
        */
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
        printTriangle(2); 
    }

}
