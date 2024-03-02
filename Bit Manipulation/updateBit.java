import java.util.Scanner;

public class updateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int position = sc.nextInt();

        int operation = sc.nextInt();

        int bitMask = 1 << position;
        if (operation == 1) {
            number = number | bitMask;
        } else {
            number = number & ~bitMask;
        }
        System.out.println(number);
        sc.close();
    }
}