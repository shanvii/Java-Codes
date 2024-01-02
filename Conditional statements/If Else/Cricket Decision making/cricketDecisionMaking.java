import java.util.Scanner;

public class cricketDecisionMaking {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int totalBalls = sc.nextInt();
        int totalRuns = sc.nextInt();
        int scoredRuns = sc.nextInt();
        int bowledBalls = sc.nextInt();

        int overs = totalBalls / 6;
        float finishedOvers = bowledBalls / 6 + (bowledBalls % 6) * 0.1f;
        float crr = (float) scoredRuns / finishedOvers; //current run rate
        float trr = (float) totalRuns / overs;  //total run rate

        System.out.println(overs);
        System.out.printf("%.1f\n", finishedOvers);
        System.out.printf("%.1f\n", crr);
        System.out.printf("%.1f\n", trr);

        if(crr > trr)
            System.out.println("Eligible to win");
        else
            System.err.println("Not eligible to win");

        sc.close();
    }
}
