# Fibonacci Series Program

A basic program that gets input `number of terms` (Integer) from the user and prints the Fibonacci Series
upto `n number of terms`. By this program, you can understand the usage of commandline arguments, use of arithmetic
operators, printing variables, user-defined method, Fibonacci Series Algorithm and recursive method to generate terms
from the Fibonacci Series.

## Fibonacci Logic

In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
The first two numbers of fibonacci series are 0 and 1.

**Task: Print Fibonacci Series with a specified number of terms (`range`) as user input.**

```shell
  Eg: range = 10
  Final Output: 
         0         1         1         2         3         5         8        13        21        34
```

*The filename must have the same name as the public class name, This is to ensure that the Java Virtual Machine (JVM)
understands the entry point of the program*

**To run the program, open your commandline and type the following:**

* Without Commandline Arguments

```shell
 $ ..\JavaRecursion> javac .\Fibonacci\Fibonacci.java
 $ ..\JavaRecursion> java Fibonacci.Fibonacci
```

* With Commandline Arguments

```shell
 $ ..\JavaRecursion> javac .\Fibonacci\Fibonacci.java
 $ ..\JavaRecursion> java Fibonacci.Fibonacci 10
```

### Fibonacci.java

```java
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

```

### Explanation

> **`import java.util.Scanner;` : imports Scanner class from java > util package. Scanner is a class that lets you get input form the user. Scanner can take any primitive data type as input from the user.**
>
> **`public static void main(String[] args)` : main method/function is the first method that will be executed in any java programs.**
>
> **`String[] args` : args is an array of String type. It is used to get commandline arguments for your program.**
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
> **`public static int generateFibonacciRecursive(int currentTerm)` : user defined recursive method that returns the Fibonacci series with the given input data, n-th term.**
>
> **`for(int i = 0; i < totalTerms;i++)` : a for loop to repeat the statements inside the loop to run for the defined ranges.**
