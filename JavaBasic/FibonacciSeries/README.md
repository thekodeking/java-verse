# Fibonacci Series Program

A basic program that gets input `range` (Integer) from the user and prints the Fibonacci Series upto `range` number of terms. By this program,
you can understand the usage of commandline arguments, use of arithmetic operators, printing variables, user-defined method and Finonacci Series Algorithm.

## Fibonacci Logic

In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of fibonacci series are 0 and 1.


**Task: Print Fibonacci Series with a specified number of terms (`range`) as user input.**
```shell
  Eg: range = 10
  Final Output: 
          | 0 | 1 | 1 | 2 | 3 | 5 | 8 | 13 | 21 | 34 |
```

*The filename must have the same name as the public class name, This is to ensure that the Java Virtual Machine (JVM) understands the entry point of the program*

**To run the program, open your commandline and type the following:**
* Without Commandline Arguments
```shell
 $ javac Fibonacci.java
 $ java Fibonacci
```

* With Commandline Arguments
```shell
 $ javac Fibonacci.java
 $ java Fibonacci 10
```

### Fibonacci.java
```java
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        if (args.length > 0) {
            if (args.length == 1)
                fiboPrinter(Integer.parseInt(args[0]));
            else
                System.out.println("Available arguments: [Range] ");
        }
        else{
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the number of terms: ");
            int range = scan.nextInt();
            scan.close();
            fiboPrinter(range);
        }
    } // end of main method

    // A method to print the fibonacci series
    public static void fiboPrinter(int range){
        int x1 = 0, x2 = 1, y = 0;
        if (range < 1) System.out.println("The range input must be greater than 0");
        else if (range == 1) System.out.println("| " + x1 + " | ");
        else if (range == 2) System.out.println("| " + x1 + " | " + x2 + " | ");
        else {
            System.out.print("| " + x1 + " | " + x2 + " | ");
            for (int i = 2; i < range; i++) {
                y = x1 + x2;
                System.out.print( y + " | ");
                x1 = x2;
                x2 = y;
            }
        }
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
> **`public static void fiboPrinter(int range)` : user defined method that prints the Fibonacci series with the given input data - range.** 
> 
> **`for(int i = 2; i < range;i++)` : a for loop to repeat the statements inside the loop to run for the defined ranges.**
