# Greet User Program

A simple program that gets a String input from the user and prints a statement with the input variable. By this program, you can understand taking inputs from user and
printing variables and user-defined method.

**Task: Get the user's name from the user and print "Welcome to your workstation Name"**

*The filename must have the same name as the public class name, This is to ensure that the Java Virtual Machine (JVM) understands the entry point of the program*

**To run the program, open your commandline and type the following:**
* Without Commandline Arguments
```shell
 $ javac GreetUser.java
 $ java GreetUser
```

* With Commandline Arguments
```shell
 $ javac GreetUser.java
 $ java GreetUser "Kode-Logger"
```

### GreetUser.java
```java
  import java.util.Scanner; // Scanner class is requied to get user inputs 

  public class GreetUser {
      public static void main(String[] args) {
          if (args.length > 0){ // checks for commandline arguments...
              greet(args[0]); // calls greet("") method
          }
          else { // if user didn't give any commandline arguments ...
              System.out.print( "Enter your Name: " ); // Prints the text: Enter your Name
              Scanner scan = new Scanner ( System.in ); // scan is an object of Scanner
              String name = scan.nextLine (); // name gets the user input
              scan.close (); // closes the "System.in" input stream
              greet(name); // calls greet("") method
          }
    }

    public static void greet(String username){
        System.out.println ( "Welcome to your workstation " + username + "." ); // prints the statement given
    }
}
```
### Explanation 
> **`import java.util.Scanner;` : imports Scanner class from java > util package. Scanner is a class that lets you get user input form the user. Scanner can take any primitive data type as input from the user.**
>
> **`public static void main(String[] args)` : main method/function is the first method that will be executed in any java programs.**
>
> **`String[] args` : args is a array of String type. It is used to get commandline arguments for your program.**          
> 
> **`args.length > 0` : checks whether args is empty or not**
>
> **`greet(args[0]);` : calls greet() method with first-argument (args[0]) as parameter**
>
> **`System.out.println();` : Prints the String and changes output cursor to next line**
>
> **`Scanner scan = new Scanner ( System.in );` : scan is an object(a special variable that stores the address in RAM/main memory) of the class Scanner.** 
> **Here scan acts as the variable that has the access to System.in stream (An input stream that connects keyboard input to the program.**
>
> **`scan.nextLine()` : gets a line from user input which can contain spaces and multiple words.**
>
> **`scan.close();` : closes the input stream link/pipe.**
>
> **`public static void greet(String username)` : user defined method.** 
