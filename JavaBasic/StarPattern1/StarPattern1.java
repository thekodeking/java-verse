import java.util.Scanner;

public class StarPattern1 {
    static char symbol = '*';
    public static void main(String[] args) {
        if (args.length > 0) {
            if (args.length == 1)
                starPrinter(Integer.parseInt(args[0]));
            else
                System.out.println("[!] Available arguments: [rows] ");
        } else {
            Scanner scan = new Scanner(System.in);
            System.out.print("[->] Enter the number of rows: ");
            int rows = scan.nextInt();
            scan.close();
            starPrinter(rows);
        }
    } // end of main method

    public static void starPrinter(int rows) {
        if (rows < 1)
            System.out.println("[!] Number of Rows must be greater than 1.");
        else {
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++)
                    System.out.print(" " + symbol + " ");
                System.out.println();
            }
        }
    }
}
