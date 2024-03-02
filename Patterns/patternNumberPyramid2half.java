import java.util.*;

public class patternNumberPyramid2half {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            //spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //numbers 1st half
            for(int j = i; j >=1; j--) {
                System.out.print(j);
            }

            //numbers 2nd hald
            for(int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
