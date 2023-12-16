/*
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order. 
Example 1:
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:
Input: nums = [1], k = 1
Output: [1]
 */

import java.util.Scanner;

public class Frequency 
{
    public static void frequency(int[] arr, int k) 
    {
        selectionSort(arr);

        int[] freq = new int[arr.length];
        int[] result = new int[arr.length];
        int resultSize = 0;

        int count = 1;
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1])
                count++;
            else {
                if (count >= k) {
                    freq[arr[i - 1]] = count;
                }
                count = 1;
            }
        }

        if (count >= k) {
            freq[arr[n - 1]] = count;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] >= k) {
                result[resultSize] = i;
                resultSize++;
            }
        }

        for (int i = 0; i < resultSize; i++) {
            System.out.println(result[i]);
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();
        frequency(arr, k);

        sc.close();
    }
}
