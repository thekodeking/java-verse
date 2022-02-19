# Right Triangle Pattern - 1

A basic program that gets input `rows` (Integer) and `symbol` (Character) from the user and prints the following pattern.

```shell
Input: 5
Output:
 
 * 
 *  * 
 *  *  * 
 *  *  *  * 
 *  *  *  *  *

 Input: 5, x
 Output:

 x
 x  x
 x  x  x
 x  x  x  x
 x  x  x  x  x

```
**Task: Print the desired star pattern as depicted above.**

*The filename must have the same name as the public class name, This is to ensure that the Java Virtual Machine (JVM) understands the entry point of the program*

**To run the program, open your commandline and type the following:**
* Without Commandline Arguments
```shell
 $ ..\JavaPattern> javac .\RightTraingle1\RightTriangle1.java
 $ ..\JavaPattern> java RightTriangle1.RightTriangle1
```

* With Commandline Arguments
```shell
 $ ..\JavaPattern> javac .\RightTriangle1\RightTriangle1.java
 $ ..\JavaPattern> java RightTriangle1.RightTriangle1 5
            or
 $ ..\JavaPattern> java RightTriangle1.RightTriangle1 5 x
```

### RightTriangle1.java
```java
package RightTriangle1;

import java.io.IOException;
import java.util.Scanner;

public class RightTriangle1 {
    static char symbol = '*'; // to store the character to print.

    public static void main(String[] args) {
        if (args.length > 0) {
            if (args.length == 1)
                starPrinter(Integer.parseInt(args[0]));
            else if (args.length == 2) {
                symbol = args[1].charAt(0);
                starPrinter(Integer.parseInt(args[0]));
            } else
                System.out.println("[!] Available arguments: [rows (integer)] [symbol (character)| optional] ");
        } else {
            Scanner scan = new Scanner(System.in);
            System.out.print("[<-] Enter the number of rows: ");
            int rows = scan.nextInt();
            System.out.print("[<-] Enter the symbol character to print (press enter to use default '*'): ");
            // System.in.read() can give IOException error, so try block is used here to counter the error
            try{
                int inputSymbol = System.in.read();
                if (inputSymbol >= 33 && inputSymbol <= 126) // checking for printable ascii characters
                    symbol = (char) inputSymbol; // set the symbol to the user input character
            } catch (IOException error) {
                System.out.println("[!] " + error.getMessage());
            }
            
            scan.close();                
            starPrinter(rows);
        }
    } // end of main method

    public static void starPrinter(int rows) {
        System.out.println("\n[->] Output: \n");
        if (rows < 1)
            System.out.println("[!] Number of Rows must be greater than 1.");
        else {
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++)
                    System.out.print(" " + symbol + " ");
                System.out.println();
            }
        }
        System.out.println(); // printing a new line for better output visibility.
    }
}

```

### Explanation
> **`import java.util.Scanner;` : imports Scanner class from java > util package. Scanner is a class that lets you get input form the user. Scanner can take any primitive data type as input from the user.**
>
> **`import java.io.IOException;` : imports IOException class from java > io package. IOException class is used to 
identify and handle Input Output errors. It was used in the program to maintain the working of System.in.read().**
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
> **`System.in.read()` : Reads characters from input and returns the data from Standard input as Integers.**
>
> **`scan.close();` : closes the input stream link/pipe.**
>
> **`public static void starPrinter(int rows)` : user defined method that prints the desired star pattern by taking 
the number of rows from the user as input.**