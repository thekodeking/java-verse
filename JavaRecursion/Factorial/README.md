# Factorial Program

A basic program that gets input `number` (Integer/Long Integer) from the user and prints the `factorial(n)`. By this program, you can
understand the usage of commandline arguments, use of arithmetic operators, printing variables, user-defined method,
Logic behind finding Factorial of a number and recursive method to generate the factorial of a number.

## Factorial Logic

Factorial of a non-negative integer, is multiplication of all integers smaller than or equal to n. For example factorial
of 6 or (6!) is `6*5*4*3*2*1` which is 720.

It must be also noted that: 
- 0! = 1 
- 1! = 1

**Task: Print the Factorial of a `number` using recursion.**

```shell
  Eg: number = 5
  Final Output: 
         Factorial of 5 is 120.
```

*The filename must have the same name as the public class name, This is to ensure that the Java Virtual Machine (JVM)
understands the entry point of the program*

**To run the program, open your commandline and type the following:**

* Without Commandline Arguments

```shell
 $ ..\JavaRecursion> javac .\Factorial\Factorial.java
 $ ..\JavaRecursion> java Factorial.Factorial
```

* With Commandline Arguments

```shell
 $ ..\JavaRecursion> javac .\Factorial\Factorial.java
 $ ..\JavaRecursion> java Factorial.Factorial 10
```

### Factorial.java

```java
package Factorial;

import java.util.Scanner; // Scanner class is required to get input from user

public class Factorial {
    static long number = 0; // the required number to find the factorial of that number

    public static void main(String[] args) {
        // if user provided commandline-arguments, then
        if (args.length != 0) {
            if (args.length == 1) {
                number = Long.parseLong(args[0]);
                System.out.println("[->] Factorial of " + number + " is " + generateFactorial(number) + ".");
            } else
                System.out.println("[!] Available arguments: [Number]");
        } // else get input from user
        else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("[<-] Enter a number to find the factorial: ");
            number = scanner.nextLong();
            System.out.println("[->] Factorial of " + number + " is " + generateFactorial(number) + ".");
        }
    }

    // a recursive method to generate the Factorial of a number n
    public static long generateFactorial(long number) {
        if (number == 1 || number == 0)
            return 1;
        else
            return number * generateFactorial(number - 1);
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
> **`public static long generateFactorial(long number)` : user defined recursive method that returns the factorial of a number n.**

