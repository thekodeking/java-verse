package Factorial;

import java.util.Scanner; // Scanner class is required to get input from user

public class Factorial {
    static long number = 0; // the required number to find the factorial of that number.
    static long factorialValue = 0; // the factorial value of the given number.

    public static void main(String[] args) {
        // if user provided commandline-arguments, then
        if (args.length != 0) {
            if (args.length == 1)
                number = Long.parseLong(args[0]);
            else
                System.out.println("[!] Available arguments: [Number]");
        } // else get input from user
        else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("[<-] Enter a number to find the factorial: ");
            number = scanner.nextLong();
            scanner.close();
        }

        factorialValue = generateFactorial(number);
        if (factorialValue == -1)
            System.out.println("[->] Factorial of " + number + " is undefined.");
        else
            System.out.println("[->] Factorial of " + number + " is " + factorialValue + ".");
    }

    // a recursive method to generate the Factorial of a number n
    public static long generateFactorial(long number) {
        if (number < 0) // if the number is negative then return -1
            return -1;
        if (number == 1 || number == 0) // if the number is 1 or 0 then return 1 or 0 respectively
            return 1;
        else
            return number * generateFactorial(number - 1);
    }
}
