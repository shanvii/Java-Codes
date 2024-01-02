/* Problem Statement: Trendy Number Checker
You are required to write a Java program that determines whether a three-digit number is a trendy number or not. A trendy number, in this context, is defined as follows:

The input should be a three-digit number. If the input does not meet this criterion, the program should output "Invalid Number".
For a valid three-digit number:
Remove the last digit to form a two-digit number.
Check if the remaining two-digit number modulo 3 equals 0.
If the modulo operation equals 0, then the original three-digit number is termed as a "Trendy Number". Otherwise, it is not considered a trendy number.
Input:
The program takes a single integer as input, representing a three-digit number.
Output:
If the input is not a three-digit number, the program outputs "Invalid Number".
If the input is a three-digit number and the two-digit number obtained after removing the last digit is divisible by 3, the program outputs "Trendy Number".
If the input is a three-digit number but the two-digit number obtained is not divisible by 3, the program outputs "Not a Trendy Number".
Constraints:
The input number will be between 100 and 999 (inclusive). */

import java.util.Scanner;

public class trendyNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(String.valueOf(n).length() == 3) {
            n/=10;
            if((n%10) % 3 == 0)
                System.out.println("Trendy Number");
            else
                System.out.println("Not a Trendy Number");
        }
        else
            System.out.println("Invalid Number");

        sc.close();
    }
}
