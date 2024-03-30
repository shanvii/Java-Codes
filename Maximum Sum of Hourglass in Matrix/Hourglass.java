import java.util.Scanner;

public class Hourglass {
    static int findMaxSum(int[][] mat, int r, int c) {
        int max_sum = 0;
        int sum;
        if (r < 3 || c < 3) {
            System.out.println("Not possible");
            System.exit(0);
        }
        for (int i = 0; i < r - 2; i++) {
            for (int j = 0; j < c - 2; j++) {
                sum = (mat[i][j] + mat[i][j + 1] + mat[i][j + 2]) +
                        (mat[i + 1][j + 1]) + (mat[i + 2][j] + mat[i + 2][j + 1] + mat[i + 2][j + 2]);
                max_sum = Math.max(max_sum, sum);
            }
        }
        return max_sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("The maximum sum of hourglass is: " + findMaxSum(mat, r, c));

        sc.close();
    }
}
