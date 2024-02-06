import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Solution {
    Node head; // head of the list

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    public void deleteAlternateNodes() {
        Node current = head;
        while (current != null && current.next != null) {
            current.next = current.next.next;
            current = current.next;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(); // Ensure there's a newline at the end of the output
    }

    public static void main(String[] args) {
        Solution list = new Solution();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int data = scanner.nextInt();
            if (data == -1) break;
            list.append(data);
        }

        list.deleteAlternateNodes();
        list.printList();
    }
}
