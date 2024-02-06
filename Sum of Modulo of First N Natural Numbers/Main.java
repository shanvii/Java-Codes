import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i % K;
        }
        
        System.out.println(sum);
    }
}
