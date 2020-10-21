/*
    Task: Print "Hello World" to Standard Output (monitor)
    Description: A java program that prints "Hello World" to the Standard Output.
    ------------------------------------------------------------------------------------------------------------------------
*/

/*
    NOTE:>> The filename must have the same name as the public class name in that file, 
    which is the way to tell the JVM that this is an entry point.
*/
public class HelloWorld { 
        /* main method/function is the first method that will be executed in any java programs.
           => args is array of String type which stores the input for the program that you can give in commandline directly.
           => for ex: running javac HelloWorld.java
                              java HelloWorld "Hello World"
                    Here args[0] will have the String: Hello World
                    When u write: System.out.println(args[0]); // You will get "Hello World" as your output.
        */
    public static void main(String[] args) {
        System.out.println("Hello World !!");
    }
}