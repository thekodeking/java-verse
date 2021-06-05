package FibonacciSeries;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        if (args.length > 0) {
            if (args.length == 1)
                fiboPrinter(Integer.parseInt(args[0]));
            else
                System.out.println("Available arguments: [Range] ");
        }
        else{
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the number of terms: ");
            int range = scan.nextInt();
            scan.close();
            fiboPrinter(range);
        }
    } // end of main method

    // A method to print the fibonacci series
    public static void fiboPrinter(int range){
        int x1 = 0, x2 = 1, y = 0;
        if (range < 1) System.out.println("The range input must be greater than 0");
        else if (range == 1) System.out.println("| " + x1 + " | ");
        else if (range == 2) System.out.println("| " + x1 + " | " + x2 + " | ");
        else {
            System.out.print("| " + x1 + " | " + x2 + " | ");
            for (int i = 2; i < range; i++) {
                y = x1 + x2;
                System.out.print( y + " | ");
                x1 = x2;
                x2 = y;
            }
        }
    }
}
