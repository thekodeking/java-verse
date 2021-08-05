package GreatestCommonDivisor;

import java.util.Scanner; // Scanner class is required to get user inputs

public class EuclidGCD {
    static int a = 0, b = 0, gcd = 0;

    public static void main(String[] args) {
        // if user gave commandline-arguments then
        if (args.length != 0) {
            if (args.length == 2) {
                a = Integer.parseInt(args[0]);
                b = Integer.parseInt(args[1]);
                gcd = getGCD(a, b);
            } else
                System.out.println("[!] Available arguments: [number 1] [number 2] ");
        } else {
            Scanner scan = new Scanner(System.in);
            System.out.print("[->] Enter the first number: ");
            a = scan.nextInt();
            System.out.print("[->] Enter the second number: ");
            b = scan.nextInt();
            scan.close();
            gcd = getGCD(a, b);
        }
    }

    public static int getGCD(int x, int y) {
        // validate input
        if (a < 0 || b < 0) {
            System.out.println("[!] Only non-negative numbers are allowed as Input.");
            return -1;
        }
        // if all is well, then proceed with finding the gcd using euclidian algorithm
        do {
            int r = x % y;
            x = y;
            y = r;
        } while (y != 0);
        System.out.println("[x] The Greatest Common Divisor of " + a + " and " + b + " is: " + x);
        return x; // returns the gcd
    }
}
