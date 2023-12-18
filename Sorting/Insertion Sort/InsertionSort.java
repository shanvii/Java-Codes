import java.util.Scanner;

public class InsertionSort
{
    void display(int arr[])
    {
        System.out.println();
        for(int i=0; i<arr.length; i++)
            System.out.println("arr[" + i + "] -> " + arr[i]);
    }

    void sort(int arr[])
    {
        int key;
        for(int i = 1; i<arr.length; i++)
        {
            key = arr[i];
            for(int j=i; j>0; j--)
            {
                if(key < arr[j])
                {
                    arr[j+1] = arr[j];
                }
                arr[j] = key;
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        InsertionSort obj = new InsertionSort();

        System.out.print("\nEnter Array length: ");
        int length = sc.nextInt();
        int arr[] = new int[length];

        System.out.println("\nEnter Array elements: ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print("arr[" + i + "] ->");
            arr[i] = sc.nextInt();
        }

        obj.sort(arr);
        System.out.println("Array elements after sorting: ");
        obj.display(arr);

        sc.close();
    }
}
