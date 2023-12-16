import java.util.Scanner;

public class ArrayInsertion {

    void display(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.println("arr[" + i + "]:" + arr[i]);
        }
    }

    public static void main(String[] args) {

        ArrayInsertion first = new ArrayInsertion();

        int arr[] = new int[10];
        int size = 5;

        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }

        System.out.println("\nOriginal Array: ");
        first.display(arr, size);

        Scanner reader = new Scanner(System.in);
        System.out.print(
                "\nMenu:\n1. For insertion in beginning\n2. For insertion in between\n3. For insertion at end\nEnter your choice: ");
        int choice = reader.nextInt();

        switch (choice) {
            case 1:
                for (int i = 9; i >= 5; i--) {
                    arr[i] = arr[i - 5];
                }
                System.out.println("\nEnter 5 elements to be inserted in the beginning: ");
                for (int i = 0; i < 5; i++) {
                    size++;
                    arr[i] = reader.nextInt();
                }
                System.out.println("\nArray after insertion in the beginning: ");
                first.display(arr, size);
                break;

            case 2:
                System.out.print("\nIndex at which we have to add: ");
                int index = reader.nextInt();
                int cons = index;
                for (int i = 9-cons; i<=9 ; i++)
                    arr[i] = arr[cons++];
                System.out.println("\nEnter 5 elements to be inserted from index " + index + ": ");
                for (int i = index; i < index + 5; i++) {
                    size++;
                    arr[i] = reader.nextInt();
                }
                System.out.println("\nArray after insertion in between: ");
                first.display(arr, 10);
                break;

            case 3:
                System.out.println("\nEnter 5 elements to be inserted at the end: ");
                for (int i = 5; i < 10; i++) {
                    size++;
                    arr[i] = reader.nextInt();
                }
                System.out.println("\nArray after insertion at the end: ");
                first.display(arr, size);
                break;

            default:
                System.out.println("\nInvalid choice!");

        }
        
        reader.close();
    }
}
