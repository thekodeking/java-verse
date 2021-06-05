package StarPattern1;

import java.io.IOException;
import java.util.Scanner;

public class StarPattern1 {
    static char symbol = '*'; // to store the character to print.

    public static void main(String[] args) {
        if (args.length > 0) {
            if (args.length == 1)
                starPrinter(Integer.parseInt(args[0]));
            else if (args.length == 2) {
                symbol = args[1].charAt(0);
                starPrinter(Integer.parseInt(args[0]));
            } else
                System.out.println("[!] Available arguments: [rows (integer)] [symbol (character)| optional] ");
        } else {
            Scanner scan = new Scanner(System.in);
            System.out.print("[<-] Enter the number of rows: ");
            int rows = scan.nextInt();
            System.out.print("[<-] Enter the symbol character to print (press enter to use default '*'): ");
            // System.in.read() can give IOException error, so try block is used here to counter the error
            try{
                int inputSymbol = System.in.read();
                if (inputSymbol >= 33 && inputSymbol <= 126) // checking for printable ascii characters
                    symbol = (char) inputSymbol; // set the symbol to the user input character
            } catch (IOException error) {
                System.out.println("[!] " + error.getMessage());
            }
            
            scan.close();                
            starPrinter(rows);
        }
    } // end of main method

    public static void starPrinter(int rows) {
        System.out.println("\n[->] Output: \n");
        if (rows < 1)
            System.out.println("[!] Number of Rows must be greater than 1.");
        else {
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++)
                    System.out.print(" " + symbol + " ");
                System.out.println();
            }
        }
        System.out.println(); // printing a new line for better output visibility.
    }
}
