import java.util.Scanner;

public class setBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        System.out.println("After setting the " + i + "th bit of " + n + ", the number becomes " + setBit(n, i));
        sc.close();
    }

    public static int setBit(int n, int i) {
        return n | (1 << i);
    }
}