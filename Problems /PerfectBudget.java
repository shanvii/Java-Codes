import java.util.Scanner;

public class PerfectBudget {

    public static int calculateBudget(int n, int[][] data) {
        int totalBudget = 0;
        for (int i = 0; i < n; i++) {
            int expenditure = data[i][0];
            int completionBonus = data[i][1];
            int rewardPenalty = data[i][2];

            if (rewardPenalty > completionBonus) {
                System.out.println("Error: Reward penalty cannot exceed the completion bonus.");
                return -1; // Return a negative value indicating an error
            }

            totalBudget += (expenditure + completionBonus - rewardPenalty);
        }
        return totalBudget;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of sets:");
        int n = scanner.nextInt();

        int[][] data = new int[n][3];

        System.out.println("Enter the expenditure, completion bonus, and reward penalty for each set:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                data[i][j] = scanner.nextInt();
            }
        }

        int budget = calculateBudget(n, data);

        if (budget >= 0) {
            System.out.println("The total budget is: " + budget);
        }

        scanner.close();
    }
}
