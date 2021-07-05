package SumNaturalNum;

import java.util.Scanner; // Scanner class is required to get input from user

public class SumNaturalNum {
    static int n = 0; // n number of integers, initialised to zero for now.
    static int sumValue = 0; // sum of the first n integers, initialised to zero for now.

    public static void main(String[] args) {
        // if user provided commandline-arguments, then
        if (args.length != 0) {
            if (args.length == 1)
                n = Integer.parseInt(args[0]);
            else
                System.out.println("[!] Available arguments: [n, the first 'n' integers upto which sum is to be found]");

        } // else get input from user
        else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("[<-] Enter the number of terms: ");
            n = scanner.nextInt();
        }

        sumValue = findSumNaturalNumbers(n); // getting the result from the recursive method
        if (sumValue == -1)
            System.out.println("[->] Seems like you entered a non-natural number, cannot find the sum !");
        else
            System.out.println("[->] Sum of the first " + n + " integers is " + sumValue + ".");
    }

    // a recursive method to find the sum of first n-natural numbers.
    public static int findSumNaturalNumbers(int number) {
        if (number < 0) // if the number is a negative integer then return -1
            return -1;
        if (number == 0 || number == 1) // if the number is 0 or 1 then return 0 or 1 respectively.
            return number;
        return number + findSumNaturalNumbers(number - 1);
    }
}
