# Armstrong Number Checker

A basic program that gets input `number` (Integer) from the user and prints whether the `number` is Armstrong Number or not.

By this program, you can understand the usage of commandline arguments, use of arithmetic operators, printing variables, Armstrong Number Logic and more.

## What is Armstrong Number ?
In an Armstrong Number, the sum of cube of individual digits is equal to number itself.
In other words the following equation will hold true
```shell 
  xy..z = x^3 + y^3+.....+ z^3
```
where `n` is number of digits in number


For example this is a 3 digit Armstrong number
```text
  370 = (3)^3 + (7)^3 + (0)^3
  = 27 + 343 + 0
  = 370
```

Examples of Armstrong Numbers
```text
  0, 1, 153, 370, 371, 407, etc.
```

**Task: Print whether the given number is Armstrong Number or not ...**
```shell
  Eg: number = 153
  Final Output: 
      [->] 153 is a Armstrong Number.
          
  Eg: number = 2
  Final Output:
      [->] 2 is not a Amrstrong Number.
         
```

*The filename must have the same name as the public class name, This is to ensure that the Java Virtual Machine (JVM) understands the entry point of the program*

**To run the program, open your commandline and type the following:**
* Without Commandline Arguments
```shell
 $ javac ArmstrongNumber.java
 $ java ArmstrongNumber
```

* Defined Arguments
```shell
 -> argument-1: 
      name: number
      type: integer
      help: Used to specify the input number.
```

* With Commandline Arguments
```shell
 $ javac ArmstrongNumber.java
 $ java ArmstrongNumber 370
```


### ArmstrongNumber.java
```java
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
```

### Explanation
> **`import java.util.Scanner;` : imports Scanner class from java > util package. Scanner is a class that lets you get input form the user. Scanner can take any primitive data type as input from the user.**
>
> **`public static void main(String[] args)` : main method/function is the first method that will be executed in any java programs.**
>
> **`String[] args` : args is a array of String type. It is used to get commandline arguments for your program.**
>
> **`args.length > 0` : checks whether args is empty or not**
>
> **`System.out.println();` : Prints the String and changes output cursor to next line**
>
> **`Scanner scan = new Scanner ( System.in );` : scan is an object(a special variable that stores the address in RAM/main memory) of the class Scanner.**
> **Here scan acts as the variable that has the access to System.in stream (An input stream that connects keyboard input to the program.**
>
> **`scan.nextInt()` : gets Integer input from user.**
>
> **`scan.close();` : closes the input stream link/pipe.**
>
> **`Math.pow(base, exponent)` : A predefined method to find the power of a number.**
