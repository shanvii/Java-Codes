import java.util.Scanner;

public class RecursionFibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 0;
        int b = 1;

        System.out.println(a + "\n" + b);

        fibo(a, b, num - 2);

        sc.close();
    }

    static void fibo(int a, int b, int num) {
        if (num == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);

        fibo(b, c, num - 1);
    }

}
