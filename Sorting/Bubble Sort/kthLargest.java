/*23MCA10122
Satakshi Shanvi
Given an integer array nums and an integer k, return the kth largest element in the array. Note that it is the kth largest element in the sorted order, not the kth distinct element. 
Example 1:
Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
Example 2:
Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4 */

import java.util.Scanner;

public class kthLargest {

    void display(int arr[])
    {
        System.out.println("\nArray elements:");
        for(int i=0; i<arr.length; i++)
            System.out.println(i + " -> " + arr[i]);
    }

    //bubble sort
    void bubbleSort(int arr[])
    {
        int temp = 0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        kthLargest obj = new kthLargest();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of Array: ");
        int length = sc.nextInt();

        int arr[] = new int[length];

        System.out.println("Enter array elements: ");
        for(int i=0; i<length; i++)
            arr[i] = sc.nextInt();


        obj.bubbleSort(arr);

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        System.out.print("Output: " + arr[arr.length-k]);

        sc.close();
    }
}
