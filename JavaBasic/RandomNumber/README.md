# Random Number Generator

A basic program that gets input `min` (Integer) and `max` (Integer) from the user and prints a `random` number
between `min` and `max` including both the min and max values. By this program, you can understand the usage of
commandline arguments, use of arithmetic operators, printing variables, user-defined method, getting user input and Random number generation
using Java utils package or from `Math` class present in `utils` package.

**Task: Generate a random number between a given min and max value ...**

```shell
  Eg: min = 2
      max = 7
  Final Output: 
          [->] Generated Random Number: 7

  Eg: min = 5
      max = 5
  Final Output:
          [->] Generated Random Number: 5      
         
  Eg: min = 10
      max = 5 
  Final Output: 
          [!] Not sure if you tried to confuse me, but seems like the min value is greater than max.
          [!] Generating a random number by taking min = 5 and max = 10
          [->] Generated Random Number: 7
```

*The filename must have the same name as the public class name, This is to ensure that the Java Virtual Machine (JVM)
understands the entry point of the program*

**To run the program, open your commandline and type the following:**

* Without Commandline Arguments

```shell
 $ ..\JavaBasic> javac .\RandomNumber\RandomNumber.java
 $ ..\JavaBasic> java RandomNumber.RandomNumber
```

* Defined Arguments

```shell
 -> argument-1: 
      name: min
      type: integer
      help: Used to specify the minimum value limit for generating a random number.
  
 -> argument-2:
      name: max
      type: integer
      help: Used to specify the maximum value limit for generating a random number.
```

* With Commandline Arguments

```shell
 $ ..\JavaBasic> javac .\RandomNumber\RandomNumber.java
 $ ..\JavaBasic> java RandomNumber.RandomNumber 10 (this command will generate a random number between 1 and 10)
            or
 $ ..\JavaBasic> java RandomNumber.RandomNumber 5 20 (this command will generate a random number between 5 and 20)
```

### RandomNumber.java

```java
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
> **`public static void generateRandom(int min, int max)` : user defined method that generates and returns a random number between min and max.**
>
> **`Math.random()` : A predefined method to generate a random number. It returns a double value between 0 and 1, eg: 0.314.**
