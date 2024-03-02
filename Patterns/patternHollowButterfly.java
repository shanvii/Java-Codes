import java.util.*;

public class patternHollowButterfly {
    public static void main(String args[]) {
        int n = 5;

        // upper part
        for (int i = 1; i <= n; i++) {

            // 1st half
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            // spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // 2nd half
            for (int j = i; j >= 1; j--) {
                if (j == 1 || j == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
        // lower part
        for (int i = n; i >= 1; i--) {

            // 1st half
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            // spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // 2nd half
            for (int j = i; j >= 1; j--) {
                if (j == 1 || j == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }

    }
}