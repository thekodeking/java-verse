package RandomNumber;

import java.util.Scanner; // used to get user input

public class RandomNumber {
    private static int max, min = 1;

    public static void main(String[] args) {
        if (args.length != 0) {
            if (args.length == 1)
                System.out.println("[->] Generated Random Number: " + generateRandom(min, Integer.parseInt(args[0])));
            else if (args.length == 2)
                System.out.println("[->] Generated Random Number: " + generateRandom(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
            else {
                System.out.println("[!] Commandline Arguments must be: [max (Integer)]");
                System.out.println(" \t\t OR ");
                System.out.println("[!] Commandline Arguments must be: [min (Integer)], [max (Integer)] ");
            }
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("[<-] Enter the minimum value (inclusive): ");
            min = scanner.nextInt();
            System.out.print("[<-] Enter the maximum value (inclusive): ");
            max = scanner.nextInt();
            scanner.close(); // closing the stream as it's not needed anymore.
            System.out.println("[->] Generated Random Number: " + generateRandom(min, max));
        }
    }

    public static int generateRandom(int min, int max) {
        System.out.println(min + " " + max);
        // if min = max, then we cannot generate a random number in between so we return the same value.
        if (min == max)
            return min;

        // the case where user gives min > max, for ex: min = 5, max = 2. Then we simply interchange values to proceed further.
        // making min = 2 and max = 5.
        else if (min > max) {
            System.out.println("[!] Not sure if you tried to confuse me, but seems like the min value is greater than max.");
            int tempVariable = min;
            min = max;
            max = tempVariable;
            System.out.printf("[!] Generating a random number by taking min = %d and max = %d%n", min, max);
        }

        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
