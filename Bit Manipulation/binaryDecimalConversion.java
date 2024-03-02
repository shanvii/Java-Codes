// Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another

import java.util.Scanner;

public class binaryDecimalConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the integer from the user
        int n = sc.nextInt();

        // Convert the number to binary
        String binary = decimalToBinary(n);

        // Print the binary representation
        System.out.println(binary);

        // Convert the binary representation to decimal
        int decimal = binaryToDecimal(binary);

        // Print the decimal representation
        System.out.println(decimal);

        // Close the scanner
        sc.close();
    }

    // Helper function to convert decimal to binary
    public static String decimalToBinary(int n) {
        // Initialize an empty string to hold the binary representation
        String binary = "";
        // While there are still digits left in the decimal number
        while (n > 0) {
            // Append the remainder of n divided by 2 to the binary string
            binary = (n & 1) + binary;
            // Shift the bits of n to the right by one, effectively dividing n by 2
            n = n >> 1;
        }
        // Return the binary representation
        return binary;
    }

    // Helper function to convert binary to decimal
    public static int binaryToDecimal(String binary) {
        // Initialize a variable to hold the decimal representation
        int decimal = 0;
        // Initialize a variable to keep track of the current power of 2
        int power = 0;
        // Iterate over the binary string from right to left
        for (int i = binary.length() - 1; i >= 0; i--) {
            // If the current character is '1', add 2 to the power of the current index to
            // the decimal representation
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            // Increment the power
            power++;
        }
        // Return the decimal representation
        return decimal;
    }
}