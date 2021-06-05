package MultiplicationTable;

import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String[] args) {
        if (args.length > 0){
	        if (args.length == 2){
		        printTable(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
            }
            else printTable(Integer.parseInt(args[0]), 10);
        }
        else {
            Scanner scan = new Scanner ( System.in );
            System.out.print("Enter number (x) = ");
            int x = scan.nextInt ();
            System.out.print("Enter range (limit) = "); 
            int limit = scan.nextInt();
            scan.close(); // It's a good habit to close the streams that you opened ;)
            printTable(x, limit);
        }
    }

    public static void printTable(int x, int limit){
        if (limit < 1 || limit > 1000) {
            System.out.println("Limit is less than 1 or exceeding 1000. So, limit is set to 10 by default");
            limit = 10;
        }
	    for (int i = 1; i <= limit; i++) {
            System.out.println(x + " x " + i + " = " + (x*i));
            if (i % 10 == 0) System.out.println();
        }
    }
}
