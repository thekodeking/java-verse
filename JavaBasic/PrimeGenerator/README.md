# Prime Number Generator

A basic program that gets input `x` (Integer) from the user and prints `x` number of prime numbers. By this
program,
you can understand the usage of commandline arguments, use of arithmetic operators, printing variables, user-defined
method and Prime number generation algorithm (Sieve of Eratosthenes) and more.

## Sieve of Eratosthenes

Pseudocode:
```shell
algorithm Sieve of Eratosthenes is
    input: an integer n > 1.
    output: all prime numbers from 2 through n.

    let A be an array of Boolean values, indexed by integers 2 to n,
    initially all set to true.
    
    for i = 2, 3, 4, ..., not exceeding √n do
        if A[i] is true
            for j = i2, i2+i, i2+2i, i2+3i, ..., not exceeding n do
                A[j] := false

    return all i such that A[i] is true.
```

To know more checkout: [Sieve of Eratosthenes](https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes)

**Task: Print n Prime Number terms ...**
```shell
  Eg: number = 10
  Final Output: 
          Generated Prime Numbers 
                  2         3         5         7        11        13        17        19        23        29

          
  Eg: number = 50
  Final Output:
          Generated Prime Numbers 

                  2         3         5         7        11        13        17        19        23        29
                 31        37        41        43        47        53        59        61        67        71
                 73        79        83        89        97       101       103       107       109       113
                127       131       137       139       149       151       157       163       167       173
                179       181       191       193       197       199       211       223       227       229
```

*The filename must have the same name as the public class name, This is to ensure that the Java Virtual Machine (JVM) understands the entry point of the program*

**To run the program, open your commandline and type the following:**
* Without Commandline Arguments
```shell
 $ ..\JavaBasic> javac .\PrimeGenerator\PrimeGenerator.java
 $ ..\JavaBasic> java PrimeGenerator.PrimeGenerator
```

* Defined Arguments
```shell
 -> argument-1: 
      name: range
      type: integer
      help: Used to specify the number of prime terms you want to generate. Ex: for first 5 prime numbers, range = 5.
  
 -> argument-2:
      name: max_int
      type: integer
      help: maximum integer value upto which the prime number can be checked. By default this value is set to 10000,
            a value more than 10000 gives lets you generate more than 1200 prime numbers but it increases the program process
            time by more seconds.  
```

Note: When the number of terms is more than 1200, you need to specify a max_int value greater than 10000.

* With Commandline Arguments
```shell
 $ ..\JavaBasic> javac .\PrimeGenerator\PrimeGenerator.java
 $ ..\JavaBasic> java PrimeGenerator.PrimeGenerator 10 (this command will be used to generate 10 numbers)
            or
 $ ..\JavaBasic> java PrimeGenerator.PrimeGenerator 3000 20000 (this command will be used to generate 3000 numbers)
```


### PrimeGenerator.java
```java
package PrimeGenerator;

import java.util.ArrayList; // used to store the prime numbers
import java.util.Arrays; // used to initialize array
import java.util.Scanner;// used to get user input

public class PrimeGenerator {
    public static void main(String[] args) {
        if (args.length > 0) {
            if (args.length == 1)
                primeGenerator(Integer.parseInt(args[0]), 10000);
            else if (args.length == 2)
                primeGenerator(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
            else
                System.out.println("[!] Available arguments: [range] [max_int | optional]");
        } else {
            Scanner scan = new Scanner(System.in);
            System.out.print("[->] Enter the number of terms: ");
            int range = scan.nextInt();
            scan.close();
            primeGenerator(range, 10000);
        }
    } // end of main method

    public static void primeGenerator(int number, int max_int) {
        // this method is supposed to generate n prime numbers and print them.

        int count = 0; // a counter variable to count the number of prime terms generated
        boolean[] isPrime = new boolean[max_int + 1]; // to process whether a number is prime or not
        ArrayList<Integer> primeList = new ArrayList<Integer>(number); // to store the prime numbers

        Arrays.fill(isPrime, true); // setting all the values to true.

        for (int i = 2; (int) Math.pow(i, 2) <= max_int; i++)
            if (isPrime[i])
                for (int j = (int) Math.pow(i, 2); j <= max_int; j += i)
                    isPrime[j] = false;

        for (int i = 2;i <= max_int; i++){
            if (isPrime[i]){
                count++;
                primeList.add(i); // to store the prime number on to a separate list.
                if (count == number)
                    break;
            }
        }

        System.out.println("Generated Prime Numbers ");
        int col = 0;
        for (int primeNumber: primeList) {
            if (col % 10 == 0) {
                System.out.println();
            }
            System.out.format("%10d", primeNumber);
            col++;
        }
        // if you want to return the prime numbers, then use 'return primeList;' and also change the function
        // definition as it is presently set to void.
    }
}

```

### Explanation
> **`import java.util.ArrayList;` : imports ArrayList class from java > util package. ArrayList class lets you use array list datatype in your programs.**
> 
> **`import java.util.Array;` : imports Array class from java > util package. Array class lets you use pre-defined methods to handle arrays with ease.**
> 
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
> **`public static void primeGenerator(int number, int max_int)` : user defined method that generates and prints `number` terms of prime number and max_int is an optional parameter which is described in the commandline arguments sections**
>
> **`Math.sqrt(number)` : A predefined method to find the Square Root of a number**
