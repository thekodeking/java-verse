package StarPattern2;

import java.util.Scanner;

public class StarPattern2 {
    static char symbol;
    static int rows = 0;

    public static void main(String[] args) {
        if (args.length > 0) {
            if (args.length == 1)
                rows = Integer.parseInt(args[0]);
            else
                System.out.println("[!] Available arguments: [rows (integer)] ");
        } else {
            Scanner scan = new Scanner(System.in);
            System.out.print("[<-] Enter the number of rows: ");
            rows = scan.nextInt();
            scan.close();
        }
        starPrinter(rows);
    } // end of main method

    public static void starPrinter(int rows) {
        System.out.println("\n[->] Output: \n");
        if (rows < 1)
            System.out.println("[!] Number of Rows must be greater than 1.");
        else {
            for (int i = 1; i <= rows; i++) {
                if (i % 2 == 0)
                    symbol = 'o';
                else
                    symbol = 'x';
                for (int j = 1; j <= i; j++)
                    System.out.print(" " + symbol + " ");
                System.out.println();
            }
        }
        System.out.println();
    }
}
