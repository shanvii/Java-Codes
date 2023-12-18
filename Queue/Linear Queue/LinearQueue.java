import java.util.Scanner;

public class LinearQueue {
    private int front, rear, maxSize;
    private int[] queue;

    // Constructor to initialize the queue with a maximum size
    public LinearQueue(int size) {
        maxSize = size;
        queue = new int[maxSize];
        front = -1; // Initializing front
        rear = -1; // Initializing rear
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return front == -1;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return rear == maxSize - 1;
    }

    // Method to add elements to the queue (enqueue operation)
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + item);
            return;
        }
        if (isEmpty()) {
            front = 0; // If the queue is empty, reset front to 0
        }
        queue[++rear] = item; // Increment rear and add the item to the queue
        System.out.println(item + " enqueued into the queue");
    }

    // Method to remove elements from the queue (dequeue operation)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int item = queue[front++]; // Get the front element and increment front
        if (front > rear) {
            front = rear = -1; // Reset front and rear when queue becomes empty
        }
        return item;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the queue: ");
        int size = scanner.nextInt();
        LinearQueue queue = new LinearQueue(size);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (queue.isFull()) {
                        System.out.println("Queue is full. Cannot enqueue.");
                    } else {
                        System.out.print("Enter the element to enqueue: ");
                        int element = scanner.nextInt();
                        queue.enqueue(element);
                    }
                    break;

                case 2:
                    int dequeued = queue.dequeue();
                    if (dequeued != -1) {
                        System.out.println("Dequeued element: " + dequeued);
                    }
                    break;

                case 3:
                    scanner.close();
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
