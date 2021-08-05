# Euclid's GCD Algorithm Implementation

## What is The Greatest Common Divisor (GCD)?

The largest common divisor that divides two non-negative numbers and leaves no remainder is known as the gcd of the two
non-negative numbers.

```text
    gcd (60, 24) is 12
    -> as 12 x 5 = 60 and 12 x 2 = 24.
    -> 12 is the largest common factor that perfectly divides 60 and 24.
```

## Euclidean GCD Algorithm?

Euclid's algorithm, is an efficient method for computing the greatest common divisor (GCD) of two integers (numbers),
the largest number that divides them both without a remainder.

To know more, [Click Here](https://en.wikipedia.org/wiki/Euclidean_algorithm).

### Algorithm

```text
    Start
    while n != 0 do
        r <- m mod n
        m <- n
        n <- r
    return (m)
    Stop    
```

### Pseudocode

```shell
    function gcd(a, b)
    while b ≠ 0
        t := b
        b := a mod b
        a := t
    return a
```

### **Task: Calculate GCD using Euclid's algorithm ...**


```shell
  Eg: x = 60, y = 24
  Final Output: 
      [x] The Greatest Common Divisor of 60 and 24 is: 12
          
  Eg: x = -10, y = 5
  Final Output:
      [!] Only non-negative numbers are allowed as Input.
         
```

*The filename must have the same name as the public class name, This is to ensure that the Java Virtual Machine (JVM)
understands the entry point of the program*

**To run the program, open your commandline and type the following:**

* Without Commandline Arguments

```shell
 $ ..\Course_DAA> javac .\GreatestCommonDivisor\EuclidGCD.java
 $ ..\Course_DAA> java GreatestCommonDivisor.EuclidGCD
```

* Defined Arguments

```shell
 -> argument-1: 
      name: number-1
      type: positive integer
      help: Used to specify the input number 1.

 -> argument-2: 
      name: number-2
      type: positive integer
      help: Used to specify the input number 2.
```

* With Commandline Arguments

```shell
 $ ..\Course_DAA> javac .\GreatestCommonDivisor\EuclidGCD.java
 $ ..\Course_DAA> java GreatestCommonDivisor.EuclidGCD 60 24
```

### EuclidGCD.java

```java
package GreatestCommonDivisor;

import java.util.Scanner; // Scanner class is required to get user inputs

public class EuclidGCD {
    static int a = 0, b = 0, gcd = 0;

    public static void main(String[] args) {
        // if user gave commandline-arguments then
        if (args.length != 0) {
            if (args.length == 2) {
                a = Integer.parseInt(args[0]);
                b = Integer.parseInt(args[1]);
                gcd = getGCD(a, b);
            } else
                System.out.println("[!] Available arguments: [number 1] [number 2] ");
        } else {
            Scanner scan = new Scanner(System.in);
            System.out.print("[->] Enter the first number: ");
            a = scan.nextInt();
            System.out.print("[->] Enter the second number: ");
            b = scan.nextInt();
            scan.close();
            gcd = getGCD(a, b);
        }
    }

    public static int getGCD(int x, int y) {
        // validate input
        if (a < 0 || b < 0) {
            System.out.println("[!] Only non-negative numbers are allowed as Input.");
            return -1;
        }
        // if all is well, then proceed with finding the gcd using euclidean algorithm
        do {
            int r = x % y;
            x = y;
            y = r;
        } while (y != 0);
        System.out.println("[x] The Greatest Common Divisor of " + a + " and " + b + " is: " + x);
        return x; // returns the gcd
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
> **Here scan acts as the variable that has the access to System.in stream (An input stream that connects keyboard input to the program).**
>
> **`scan.nextInt()` : gets Integer input from user.**
>
> **`scan.close();` : closes the input stream link/pipe.**
> 
> **`getGCD(int x, int y) ` : a method that implements euclidean algorithm and returns the gcd of x and y.**

