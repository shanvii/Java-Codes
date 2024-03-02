import java.util.*;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");

            // pattern
            for (int j = i; j <= i; j++) {
                int val = 1;
                for (int k = 1; k <= j; k++) {
                    System.out.print(val + " ");
                    val = val * (i - k) / k;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}