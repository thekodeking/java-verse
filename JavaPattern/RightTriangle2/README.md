# Right Triangle Pattern - 2

A basic program that gets input `rows` (Integer) from the user and prints the following pattern.

```shell
Input: 5
Output:
 
 x
 o  o
 x  x  x
 o  o  o  o
 x  x  x  x  x

```
**Task: Print the desired star pattern as depicted above.**

*The filename must have the same name as the public class name, This is to ensure that the Java Virtual Machine (JVM) understands the entry point of the program*

**To run the program, open your commandline and type the following:**
* Without Commandline Arguments
```shell
 $ ..\JavaBasic> javac .\RightTriangle2\RightTriangle2.java
 $ ..\JavaBasic> java RightTriangle2.RightTriangle2
```

* With Commandline Arguments
```shell
 $ ..\JavaBasic> javac .\RightTriangle2\RightTriangle2.java
 $ ..\JavaBasic> java RightTriangle2.RightTriangle2 5
 ```

### RightTriangle2.java
```java
package RightTriangle2;

import java.util.Scanner;

public class RightTriangle2 {
    static char symbol;
    static int rows = 0;

    public static void main(String[] args) {
        if (args.length > 0) {
            if (args.length == 1)
                rows = Integer.parseInt(args[0]);
            else
                System.out.println("[!] Available arguments: [rows (integer)] ");
        } else {
            Scanner scan = new Scanner(System.in);
            System.out.print("[<-] Enter the number of rows: ");
            rows = scan.nextInt();
            scan.close();
        }
        starPrinter(rows);
    } // end of main method

    public static void starPrinter(int rows) {
        System.out.println("\n[->] Output: \n");
        if (rows < 1)
            System.out.println("[!] Number of Rows must be greater than 1.");
        else {
            for (int i = 1; i <= rows; i++) {
                if (i % 2 == 0)
                    symbol = 'o';
                else
                    symbol = 'x';
                for (int j = 1; j <= i; j++)
                    System.out.print(" " + symbol + " ");
                System.out.println();
            }
        }
        System.out.println();
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
> **`public static void starPrinter(int rows)` : user defined method that prints the desired star pattern by taking the number of rows from the user as input.**