class CircularQueue {
    private Node rear;
    private int size;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public CircularQueue() {
        rear = null;
        size = 0;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            rear = newNode;
            rear.next = newNode;
        } else {
            newNode.next = rear.next;
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Enqueued: " + data);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty. Cannot dequeue element.");
        }
        int dequeuedElement = rear.next.data;
        if (rear.next == rear) {
            rear = null;
        } else {
            rear.next = rear.next.next;
        }
        size--;
        System.out.println("Dequeued: " + dequeuedElement);
        return dequeuedElement;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty. Cannot peek.");
        }
        return rear.next.data;
    }

    public boolean isEmpty() {
        return rear == null;
    }

    public int size() {
        return size;
    }
}

public class CircularQueueUsingLinkedList {
    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue();

        circularQueue.enqueue(10);
        circularQueue.enqueue(20);
        circularQueue.enqueue(30);
        // CircularQueue.enqueue(40);
        // CircularQueue.enqueue(50);
        // CircularQueue.enqueue(60);
        // CircularQueue.enqueue(70);

        System.out.println("Front element: " + circularQueue.peek());

        circularQueue.dequeue();
        circularQueue.dequeue();

        System.out.println("Front element: " + circularQueue.peek());

        circularQueue.dequeue();
        // circularQueue.dequeue();
    }
}
