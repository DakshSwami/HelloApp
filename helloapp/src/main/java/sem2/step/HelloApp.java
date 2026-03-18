package sem2.step;
/**
 * HelloApp.java - A simple Java application that extends the functionality of
 * HelloAppUC1 by accpeting a user's name as a command line argument and displaying
 * a personalized greeting.
 * 
 * UC 1: Display "Hello, World" - The application should display the message
 * "Hello, World" to the console when executed.
 * UC 2: Display User Name - The application should accept a user's name as
 * a command-line argument and display a personalized greeting.
 * 
 * @author Daksh
 * @version 2.0
 * @since UC1
 */

public class HelloApp {
    public static void main(String[] args) {
        String name = args[0];
        System.out.println("Hello, " + name + "!");
    }
}