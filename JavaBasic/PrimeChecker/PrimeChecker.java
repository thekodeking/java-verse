import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        if (args.length > 0) {
            if (args.length == 1)
                primeCheck(Integer.parseInt(args[0]));
            else
                System.out.println("[!] Available arguments: [number] ");
        } else {
            Scanner scan = new Scanner(System.in);
            System.out.print("[->] Enter the number to check: ");
            int number = scan.nextInt();
            scan.close();
            primeCheck(number);
        }
    } // end of main method

    public static void primeCheck(int number) {
        boolean isPrime = true;
        if (number == 1)
            isPrime = false;
        else if (number < 1) {
            System.out.println("[!] Please enter a natural number.");
            return;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println("[x] " + number + (isPrime ? " is a Prime Number." : " is not a Prime Number."));
    }
}
