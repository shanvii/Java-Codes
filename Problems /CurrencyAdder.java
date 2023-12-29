/* Kamal was traveling from Korea to USA and he was not aware of the currency system of USA. Can you please help him to add two dollars and cents?

Note: 1 dollar = 100 cents

Input format:
Input consists of 4 integers. The first bib inputs correspond to the value of the first dollar and cent. The next the inputs corespond to the value of the second dollar and cent

Constraines
NA

Output Format
The output should print the sum of dollars and cents

Sample Input O
30
10
140
99 */

import java.util.Scanner;

public class CurrencyAdder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: values of dollars and cents for the two amounts
        int dollar1 = scanner.nextInt();
        int cent1 = scanner.nextInt();
        int dollar2 = scanner.nextInt();
        int cent2 = scanner.nextInt();

        // Calculate total cents and dollars
        int totalCents = cent1 + cent2;
        int additionalDollars = totalCents / 100;
        int remainingCents = totalCents % 100;
        int totalDollars = dollar1 + dollar2 + additionalDollars;

        // Output the sum of dollars and cents
        System.out.println(totalDollars);
        System.out.println(remainingCents);

        scanner.close();
    }
}
