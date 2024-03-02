// Write a program to toggle a bit at position = "pos" in a number "n".

import java.util.Scanner;

public class toggleBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the integer from the user
        int n = sc.nextInt();

        // Read the position of the bit to toggle
        int pos = sc.nextInt();

        // Create a bitmask with the specified bit set to 1
        int bitMask = 1 << pos;

        // Toggle the specified bit by performing XOR operation
        int ans = n ^ bitMask;

        // Print the result
        System.out.println(ans);

        // Close the scanner
        sc.close();
    }
}