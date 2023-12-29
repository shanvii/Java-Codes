/* WAP to reverse a 3 digit number */

import java.util.Scanner;

public class ReverseThreeDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int rev = 0;

        while (number > 0) {
            int digit = number % 10;
            rev = rev * 10 + digit;
            number /= 10;
        }

        System.out.println(rev);

        scanner.close();
    }
}
