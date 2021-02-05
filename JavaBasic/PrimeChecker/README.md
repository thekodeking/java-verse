# Prime Number Checker

A basic program that gets input `number` (Integer) from the user and prints whether the number is prime or not. By this 
program,
you can understand the usage of commandline arguments, use of arithmetic operators, printing variables, user-defined 
method and Prime number checking algorithm.

## Prime Check Logic

There are a lot of ways to check whether a number is prime or not. The simplest method is to divide a number x with 
the numbers from 2 to x, to find out its factors. If there are no factors then x is a prime number.

The logic used here is somewhat faster than dividing through all the numbers and finding the factors.
```aidl
Suppose n is not a prime number (greater than 1). So there are numbers a and b such that

n = ab      (1 < a <= b < n)
By multiplying the relation a<=b by a and b we get:

a^2 <= ab
 ab <= b^2
Therefore: (note that n=ab)

a^2 <= n <= b^2
Hence: (Note that a and b are positive)

a <= sqrt(n) <= b
So if a number (greater than 1) is not prime and we test divisibility up to square root of the number, we will find one of the factors.
```


**Task: Print whether a number is prime or not where the number is taken as input from the user.**
```shell
  Eg: number = 43
  Final Output: 
          [x] 43 is a Prime Number.
          
  Eg: number = 121
  Final Output:
          [x] 121 is not a Prime Number.
```

*The filename must have the same name as the public class name, This is to ensure that the Java Virtual Machine (JVM) understands the entry point of the program*

**To run the program, open your commandline and type the following:**
* Without Commandline Arguments
```shell
 $ javac PrimeChecker.java
 $ java PrimeChecker
```

* With Commandline Arguments
```shell
 $ javac PrimeChecker.java
 $ java PrimeChecker 2
```

### PrimeChecker.java
```java
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
> **`public static void primeCheck(int number)` : user defined method that prints whether a number is prime or not.** 
> 
> **`Math.sqrt(number)` : A predefined method to find the Square Root of a number**
