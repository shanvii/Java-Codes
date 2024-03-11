import java.util.Scanner;

public class RecursiveSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        printSum(1, num, 0);

        sc.close();
    }

    static void printSum(int i, int n, int sum) {

        if(i == n) {
            sum += i;
            System.out.println("Sum: " + sum);
            return;
        }
        sum += i;
        printSum(i+1, n, sum);
    }
}