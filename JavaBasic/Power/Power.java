package Power;

import java.util.Scanner;

public class Power {
    static int x, y;

    public static void main(String[] args) {
        if (args.length > 0) {
            if (args.length == 2) {
                x = Integer.parseInt(args[0]);
                y = Integer.parseInt(args[1]);
                System.out.println(" " + x + " ^ " + y + " = " + Math.pow(x, y));
            } else
                System.out.println(" [!] Commandline Arguments must be two integers: [x (base)], [y (power)]");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print(" [-] Enter the base integer value: ");
        int x = scanner.nextInt();
        System.out.print(" [-] Enter the exponent integer value: ");
        int y = scanner.nextInt();
        scanner.close(); // closing the stream as it's not needed anymore.
        System.out.println(" " + x + " ^ " + y + " = " + Math.pow(x, y));
    }
}
