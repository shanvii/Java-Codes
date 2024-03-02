import java.util.Scanner;

public class patternStarPyramids {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //upper pyramid
        for(int i = 1; i <= n; i++) {
            //spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //stars
            for(int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        //lower pyramid
        for(int i = n; i >= 1; i--) {
            //spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //stars
            for(int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
