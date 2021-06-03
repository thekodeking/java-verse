import java.util.Scanner; // used to get user input

public class ArmstrongNumber {
    private static boolean isArmstrongResult = false;
    private static int number = -1;
    public static void main(String[] args) {
        if (args.length > 0) {
            if (args.length == 1) {
                number = Integer.parseInt(args[0]);
                isArmstrongResult = isArmstrong(number);
            }
            else
                System.out.println("[!] Available arguments: [number]");

        } else {
            Scanner scan = new Scanner(System.in);
            System.out.print("[<-] Enter the number to check: ");
            number = scan.nextInt();
            scan.close(); // closing the scanner input stream as it is no longer required.
            isArmstrongResult = isArmstrong(number);
        }

        if (isArmstrongResult)
            System.out.println("[->] " + number + " is a Armstrong Number.");
        else
            System.out.println("[->] " + number + " is not a Armstrong Number.");
    }

    public static boolean isArmstrong(int number) {
        // this method will return true if the given number is an Armstrong number.
        int armstrongSum = 0, rem;
        int checkNumber = number; // storing the original number value to check whether the armstrong sum = number
        while (number > 0){
            rem = number % 10; // gets the last digit of input number. EX: gets 3 from 123
            number /= 10; // removing the last digit of input number. Ex: 123 becomes 12
            armstrongSum += (int) Math.pow(rem, 3);
        }
        return armstrongSum == checkNumber;
    }
}
