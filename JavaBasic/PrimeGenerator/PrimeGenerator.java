package PrimeGenerator;

import java.util.ArrayList; // used to store the prime numbers
import java.util.Arrays; // used to initialize array
import java.util.Scanner;// used to get user input

public class PrimeGenerator {
    public static void main(String[] args) {
        if (args.length > 0) {
            if (args.length == 1)
                primeGenerator(Integer.parseInt(args[0]), 10000);
            else if (args.length == 2)
                primeGenerator(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
            else
                System.out.println("[!] Available arguments: [range] [max_int | optional]");
        } else {
            Scanner scan = new Scanner(System.in);
            System.out.print("[->] Enter the number of terms: ");
            int range = scan.nextInt();
            scan.close();
            primeGenerator(range, 10000);
        }
    } // end of main method

    public static void primeGenerator(int number, int max_int) {
        // this method is supposed to generate n prime numbers and print them.

        int count = 0; // a counter variable to count the number of prime terms generated
        boolean[] isPrime = new boolean[max_int + 1]; // to process whether a number is prime or not
        ArrayList<Integer> primeList = new ArrayList<Integer>(number); // to store the prime numbers

        Arrays.fill(isPrime, true); // setting all the values to true.

        for (int i = 2; (int) Math.pow(i, 2) <= max_int; i++)
            if (isPrime[i])
                for (int j = (int) Math.pow(i, 2); j <= max_int; j += i)
                    isPrime[j] = false;

        for (int i = 2;i <= max_int; i++){
            if (isPrime[i]){
                count++;
                primeList.add(i); // to store the prime number on to a separate list.
                if (count == number)
                    break;
            }
        }

        System.out.println("Generated Prime Numbers ");
        int col = 0;
        for (int primeNumber: primeList) {
            if (col % 10 == 0) {
                System.out.println();
            }
            System.out.format("%10d", primeNumber);
            col++;
        }
        // if you want to return the prime numbers, then use 'return primeList;' and also change the function
        // definition as it is presently set to void.
    }
}
