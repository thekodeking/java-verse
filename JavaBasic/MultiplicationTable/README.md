# Multiplication Table Program

A basic program that gets input `x` (Integer) and `limit` (Integer) from the user and prints the multiplication list of Integer `x` from 1 to `limit`. By this program,
you can understand the usage of commandline arguments, use of arithmetic operators, printing variables and user-defined method.

**Task: Print a multiplication table of number `x` from 1 to `limit`**
```shell
  Eg: x = 2, limit = 3
  Output: 
          2 x 1 = 2
          2 x 2 = 4
          2 x 3 = 6
```

*The filename must have the same name as the public class name, This is to ensure that the Java Virtual Machine (JVM) understands the entry point of the program*

**To run the program, open your commandline and type the following:**
* Without Commandline Arguments
```shell
 $ javac MultiplicationTable.java
 $ java MultiplicationTable
```

* With Commandline Arguments
```shell
 $ javac MultiplicationTable.java
 $ java MultiplicationTable 2 3
 
 or
 
 $ javac MultiplicationTable.java
 $ java MultiplicationTable 2
```

### MultiplicationTable.java
```java
package MultiplicationTable;

import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String[] args) {
        if (args.length > 0){
            if (args.length == 2){
                printTable(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
            }
            else printTable(Integer.parseInt(args[0]), 10);
        }
        else {
            Scanner scan = new Scanner ( System.in );
            System.out.print("Enter number (x) = ");
            int x = scan.nextInt ();
            System.out.print("Enter range (limit) = ");
            int limit = scan.nextInt();
            scan.close(); // It's a good habit to close the streams that you opened ;)
            printTable(x, limit);
        }
    }

    public static void printTable(int x, int limit){
        if (limit < 1 || limit > 1000) {
            System.out.println("Limit is less than 1 or exceeding 1000. So, limit is set to 10 by default");
            limit = 10;
        }
        for (int i = 1; i <= limit; i++) {
            System.out.println(x + " x " + i + " = " + (x*i));
            if (i % 10 == 0) System.out.println();
        }
    }
}

```

### Explanation
> **`import java.util.Scanner;` : imports Scanner class from java > util package. Scanner is a class that lets you 
> get input form the user. Scanner can take any primitive data type as input from the user.**
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
> **`public static void printTable(int x, int limit)` : user defined method that prints the multiplication table with the given input data.** 
