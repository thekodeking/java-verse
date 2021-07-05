package Fibonacci;

import java.util.Scanner; // Scanner class is required to get input from user

public class Fibonacci {
    static int totalTerms = 0; // total number of terms to display

    public static void main(String[] args) {
        // if user provided commandline-arguments, then
        if (args.length != 0) {
            if (args.length == 1)
                totalTerms = Integer.parseInt(args[0]);
            else
                System.out.println("[!] Available arguments: [Number of Terms]");

        } // else get input from user
        else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("[<-] Enter the number of terms: ");
            totalTerms = scanner.nextInt();
        }
        System.out.printf("[->] Fibonacci Series upto %s terms:", totalTerms);
        for (int i = 0; i < totalTerms; i++) {
            if (i % 10 == 0)
                System.out.println();
            System.out.format("%10d", generateFibonacciRecursive(i));
        }
    }

    // a recursive method to generate the n-th number from Fibonacci Series
    public static int generateFibonacciRecursive(int currentTerm) {
        if (currentTerm == 0 || currentTerm == 1)
            return currentTerm;
        else
            return generateFibonacciRecursive(currentTerm - 1) + generateFibonacciRecursive(currentTerm - 2);
    }
}
