import java.util.Scanner;

public class getBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        System.out.println("The " + i + "th bit of " + n + " is " + getBit(n, i));
        sc.close();
    }

    public static int getBit(int n, int i) {
        return (n & (1 << i)) > 0 ? 1 : 0;
    }
}
