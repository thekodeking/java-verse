# Sum of first n-natural numbers Program

A basic program that gets input `n` (Integer) from the user which is considered as the limit number and prints the sum
of the first `n` natural numbers. By this program, you can understand the usage of commandline arguments, use of
arithmetic operators, printing variables, user-defined method and recursive method to find the sum of first n-natural
numbers.

## Program Logic

A natural number is an integer which is positive and is greater than 0.

The natural number series goes on like this: 1, 2, 3, 4, 5, ... upto infinity.

**Task: Print the sum of first n-natural numbers where 'n' is the input from the user.**

```shell
  Eg: n = 10
  Final Output: 
         Sum of the first 10 integers is 55.
         
  Eg: n = 0
  Final Output: 
         Sum of the first 0 integers is 0.
         
  Eg: n = -1
  Final Output: 
         Seems like you entered a non-natural number, cannot find the sum !
```

*The filename must have the same name as the public class name, This is to ensure that the Java Virtual Machine (JVM)
understands the entry point of the program*

**To run the program, open your commandline and type the following:**

* Without Commandline Arguments

```shell
 $ ..\JavaRecursion> javac .\SumNaturalNum\SumNaturalNum.java
 $ ..\JavaRecursion> java SumNaturalNum.SumNaturalNum
```

* With Commandline Arguments

```shell
 $ ..\JavaRecursion> javac .\SumNaturalNum\SumNaturalNum.java
 $ ..\JavaRecursion> java SumNaturalNum.SumNaturalNum 10
```

### SumNaturalNum.java

```java
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
> **`public static int findSumNaturalNumbers(int number)` : user defined recursive method that returns the sum of first n natural numbers where n is a parameter.**
