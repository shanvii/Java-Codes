import java.util.Scanner;

public class RecursionFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        factorial(num, 1);

        sc.close();
    }

    static void factorial(int num, int result) {
        if(num == 0) {
            result *= 1;
            System.out.println(result);
            return;
        }
        
        result *= num;
        factorial(num-1, result);
    }
}
