//Array Operation- insertion, deletion, searching

import java.util.Scanner;

public class ArrayOperation {

    void display(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.println("arr[" + i + "]:" + arr[i]);
        }
    }

    public static void main(String[] args) {

        ArrayOperation first = new ArrayOperation();

        int arr[] = new int[10];
        int size = 5;

        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }

        Scanner reader = new Scanner(System.in); 
        
        System.out.println("\nEnter 5 elements: ");
        for (int i = 5; i < 10; i++) {
            size++;
            arr[i] = reader.nextInt();
        }

        System.out.println("\nOriginal Array: ");
        first.display(arr, size);

        System.out.print(
                "\nMenu:\nInsertion\n1. For insertion in beginning \n2. For insertion in between \n3. For insertion at end \nDeletion\n4. For deletion from beginning \n5. For deletion in between \n6. For deletion at end \nEnter your choice: ");
        int choice = reader.nextInt();

        switch (choice) {
            case 1:
                for (int i = 9; i > 0; i--) {
                    arr[i] = arr[i - 1];
                }
                System.out.println("\nEnter element to be inserted: ");
                arr[0] = reader.nextInt();
                System.out.println("\nArray after insertion: ");
                first.display(arr, size);
                break;

            case 2:
                System.out.print("\nIndex at which we have to add: ");
                int index = reader.nextInt();
                for (int i = 9; i > index; i--) {
                    arr[i] = arr[i - 1];
                }
                System.out.println("\nEnter element to be inserted: ");
                arr[index] = reader.nextInt();
                System.out.println("\nArray after insertion in between: ");
                first.display(arr, 10);
                break;

            case 3:
                System.out.println("\nEnter element to be inserted: ");
                arr[9] = reader.nextInt();
                System.out.println("\nArray after insertion at the end: ");
                first.display(arr, size);
                break;

            case 4:
                for (int i = 0; i < 9; i++) {
                    arr[i] = arr[i + 1];
                }
                size--;
                System.out.println("\nArray after deletion: ");
                first.display(arr, size);
                break;

            case 5:
                System.out.print("\nIndex from which we have to delete: ");
                int i = reader.nextInt();
                for(; i < 9; i++) {
                    arr[i] = arr[i + 1];
                }
                size--;
                System.out.println("\nArray after deletion: ");
                first.display(arr, size);
                break;

            case 6:
                first.display(arr, size-1);
                break;

            default:
                System.out.println("\nInvalid choice!");
        }

        reader.close();
    }
}
