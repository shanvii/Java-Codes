import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static boolean isStrobogrammatic(String num) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('8', '8');
        map.put('6', '9');
        map.put('9', '6');
        
        int left = 0;
        int right = num.length() - 1;
        
        while (left <= right) {
            char l = num.charAt(left);
            char r = num.charAt(right);
            if (!map.containsKey(l) || map.get(l) != r) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();

        boolean result = isStrobogrammatic(num);
        if(result)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
