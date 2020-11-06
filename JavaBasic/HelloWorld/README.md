# Hello World Program

A very basic program that every developer/programmer learns to write. A Hello World Program gives you a clarity on the basic outline of a language and the way to program the language.
Below here is a java version of Hello World program.

**Task: Print "Hello World" to Standard Output (monitor)**

*The filename must have the same name as the public class name in that file, which is the way to tell the JVM that this is an entry point.*

**To run the program, open your commandline and type the following:**
```shell
 $ javac HelloWorld.java
 $ java HelloWorld
```
### HelloWorld.java
```java
   public class HelloWorld {
    public static void main(String[] args) { // main method
        System.out.println("Hello World."); // prints Hello World.
    }
   }
```
### Explanation 
> **`public static void main(String[] args)` : main method/function is the first method that will be executed in any java programs.**
>
> **`String[] args` : args is a array of String type. It is used to get commandline arguments for your program.**          
> 
> **`System.out.println("Hello World.");` : prints the String in quotes to the Standard Output Stream (i.e monitor).**
