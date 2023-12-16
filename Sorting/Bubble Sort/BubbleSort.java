import java.util.Scanner;

public class BubbleSort {

    public static int bubbleSortAsc(int[] arr) {
        int n = arr.length;
        int aswaps = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    aswaps++;
                }
            }
        }
        return aswaps;
    }

    public static int bubbleSortDesc(int[] arr) {
        int n = arr.length;
        int dswaps = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    dswaps++;
                }
            }
        }
        return dswaps;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++)
            arr[i] = scanner.nextInt();

        int[] copy = arr.clone();

        int ascSwaps = bubbleSortAsc(arr);
        int descSwaps = bubbleSortDesc(copy);

        int minSwaps = Math.min(ascSwaps, descSwaps);
        System.out.print(minSwaps);

        scanner.close();
    }
}
