package Factorial;

import java.util.Scanner; // Scanner class is required to get input from user

public class Factorial {
    static long number = 0; // the required number to find the factorial of that number

    public static void main(String[] args) {
        // if user provided commandline-arguments, then
        if (args.length != 0) {
            if (args.length == 1) {
                number = Long.parseLong(args[0]);
                System.out.println("[->] Factorial of " + number + " is " + generateFactorial(number) + ".");
            }
            else
                System.out.println("[!] Available arguments: [Number]");
        } // else get input from user
        else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("[<-] Enter a number to find the factorial: ");
            number = scanner.nextLong();
            System.out.println("[->] Factorial of " + number + " is " + generateFactorial(number) + ".");
        }
    }

    // a recursive method to generate the Factorial of a number n
    public static long generateFactorial(long number) {
        if (number == 1 || number == 0)
            return 1;
        else
            return number * generateFactorial(number-1);
    }
}

