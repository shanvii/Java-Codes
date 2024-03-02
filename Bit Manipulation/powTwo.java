//Write a program to find if a number is a power of 2 or not.
// You have to take an integer input from the user and then check if it is a power of 2 or not. If it is a power of 2, print true. Otherwise, print false.

// Importing the Scanner class from the java.util package
import java.util.Scanner;

// Defining a public class named powTwo
public class powTwo {
    // The main method which is the entry point of any Java program
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Reading an integer input from the user
        int n = sc.nextInt();

        // Checking if the number is a power of 2
        // A number is a power of 2 if it's bitwise AND with its predecessor is 0
        boolean ans = (n & (n - 1)) == 0;

        // Printing the result
        System.out.println(ans);

        // Closing the Scanner object to prevent memory leaks
        sc.close();
    }
}