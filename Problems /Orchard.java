import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Orchard {
    public static int countPossibilities(String rowOfTrees) {
        int count = 0;
        for (int i = 0; i < rowOfTrees.length() - 2; i++) {
            List<Character> set = new ArrayList<>();
            set.add(rowOfTrees.charAt(i));

            for (int j = i + 1; j < rowOfTrees.length(); j++) {
                if (rowOfTrees.charAt(j) != set.get(set.size() - 1)) {
                    set.add(rowOfTrees.charAt(j));

                    if (set.size() == 3) {
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }

    public static String findWinner(String row1, String row2) {
        if (!isValidInput(row1) || !isValidInput(row2)) {
            return "Invalid input";
        }

        int possibilitiesAshok = countPossibilities(row1);
        int possibilitiesAnand = countPossibilities(row2);

        if (possibilitiesAshok > possibilitiesAnand) {
            return "Ashok";
        } else if (possibilitiesAnand > possibilitiesAshok) {
            return "Anand";
        } else {
            return "Draw";
        }
    }

    public static boolean isValidInput(String rowOfTrees) {
        for (char tree : rowOfTrees.toCharArray()) {
            if (tree != 'M' && tree != 'L') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String row1 = scanner.nextLine();
        String row2 = scanner.nextLine();
      
        String winner = findWinner(row1, row2);
        System.out.print(winner);

        scanner.close();
    }
}
