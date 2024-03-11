import java.util.Scanner;

public class RecursionPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(power(x, n));

        sc.close();
    }

    public static int power(int x, int n) {
        if(n == 0) {
            return 1;
        }
        if(x == 0) {
            return 0;
        }
        int temp = power(x, n-1);
        
        return x * temp;
    }
}    