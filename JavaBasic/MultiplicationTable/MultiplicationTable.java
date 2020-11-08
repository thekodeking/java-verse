import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String[] args) {
        if (args.length > 0){
            printTable(Integer.parseInt(args[0]));
        }
        else {
            Scanner scan = new Scanner ( System.in );
            int num = scan.nextInt ();
            printTable(num);
        }
    }

    public static void printTable(int num){
        for (int i = 1; i <= 20; i++) {
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
}