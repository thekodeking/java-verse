package GreetUser;

import java.util.Scanner; // Scanner class is required to get user inputs

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