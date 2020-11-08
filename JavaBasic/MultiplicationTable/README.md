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
```

### MultiplicationTable.java
```java
  import java.util.Scanner;

  public class MultiplicationTable{
      public static void main(String[] args) {
         if (args.length > 0){
             printTable(Integer.parseInt(args[0]));
          }
         else {
              Scanner scan = new Scanner ( System.in );
              int num = scan.nextInt ();
              scan.close(); // It's a good habit to close the streams that you open ;)
              printTable(num);
          }
     }

      public static void printTable(int num){
          for (int i = 1; i <= 20; i++) {
              System.out.println(num + " x " + i + " = " + (num*i));
          }
      }
  }
```

### Explanation
