// Write a program to count the number of 1’s in a binary representation of the number.
//getting wrong outputs

import java.util.Scanner;

public class countBinaryOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n = n >> 1;
        }
        System.out.println(count);
        sc.close();
    }
}
