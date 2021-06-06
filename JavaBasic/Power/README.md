# Mathematical Power 

A basic program that gets input `x` (Base) and `y` (Power/Exponent) from the user and prints `x`^`y`. 

By this program, you can understand the usage of commandline arguments, use of arithmetic operators, printing variables and more.

**Task: Print the value of x^y ...**
```shell
  Eg: x, base = 2
      y, power = 5
  Final Output: 
      2 ^ 5 = 32.0
          
  Eg: x, base = 50
      y, power = 5
  Final Output:
      50 ^ 5 = 3.125E8
         
```

*The filename must have the same name as the public class name, This is to ensure that the Java Virtual Machine (JVM) understands the entry point of the program*

**To run the program, open your commandline and type the following:**
* Without Commandline Arguments
```shell
 $ ..\JavaBasic> javac .\Power\Power.java
 $ ..\JavaBasic> java Power.Power
```

* Defined Arguments
```shell
 -> argument-1: 
      name: x (base)
      type: integer
      help: Used to specify the base value.
  
 -> argument-2:
      name: y (power)
      type: integer
      help: Used to specify the power or exponent value.  
```

* With Commandline Arguments
```shell
 $ ..\JavaBasic> javac .\Power\Power.java
 $ ..\JavaBasic> java Power.Power 2 5
```


### Power.java
```java
package Power;

import java.util.Scanner;

public class Power {
    static int x, y;

    public static void main(String[] args) {
        if (args.length > 0) {
            if (args.length == 2) {
                x = Integer.parseInt(args[0]);
                y = Integer.parseInt(args[1]);
                System.out.println(" " + x + " ^ " + y + " = " + Math.pow(x, y));
            } else
                System.out.println(" [!] Commandline Arguments must be two integers: [x (base)], [y (power)]");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print(" [<-] Enter the base integer value: ");
        int x = scanner.nextInt();
        System.out.print(" [<-] Enter the exponent integer value: ");
        int y = scanner.nextInt();
        scanner.close(); // closing the stream as it's not needed anymore.
        System.out.println("[->] " + x + " ^ " + y + " = " + Math.pow(x, y));
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
> **`Math.pow(base, exponent)` : A predefined method to find the power of a number.**
