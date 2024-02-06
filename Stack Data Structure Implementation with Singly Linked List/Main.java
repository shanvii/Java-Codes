import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {
    private Node top;
    private int size;

    public Main() {
        this.top = null;
        this.size = 0;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int popped = top.data;
        top = top.next;
        size--;
        return popped;
    }

    public int top() {
        if (isEmpty()) {
            return -1;
        }
        return top.data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();

        Main stack = new Main();

        while (q-- > 0) {
            int operation = scanner.nextInt();
            switch (operation) {
                case 1:
                    int data = scanner.nextInt();
                    stack.push(data);
                    break;
                case 2:
                    System.out.println(stack.pop());
                    break;
                case 3:
                    System.out.println(stack.top());
                    break;
                case 4:
                    System.out.println(stack.size());
                    break;
                case 5:
                    System.out.println(stack.isEmpty());
                    break;
            }
        }
    }
}
