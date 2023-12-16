import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class CircularSinglyLinkedList {
    Node head;

    // Insertion at the end of the circular linked list
    public void insert(int data) {
        Node new_node = new Node(data);

        if (head == null) {
            new_node.next = new_node; // For the first node, point to itself
            head = new_node;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = new_node;
            new_node.next = head; // New node points back to the head
        }
    }

    // Traversing the circular linked list
    public void traverse() {
        if (head == null) {
            System.out.println("Circular linked list is empty.");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println(head.data); // Printing the head again to signify the end
    }

    // Searching for a specific element in the circular linked list
    public boolean search(int key) {
        if (head == null) {
            System.out.println("Circular linked list is empty.");
            return false;
        }

        Node temp = head;
        do {
            if (temp.data == key) {
                return true; // Element found
            }
            temp = temp.next;
        } while (temp != head);
        return false; // Element not found
    }

    // Insertion at the beginning of the circular linked list
    public void insertAtBeginning(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            new_node.next = new_node;
            head = new_node;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = new_node;
            new_node.next = head;
            head = new_node;
        }
    }

    // Deletion of a specific element from the circular linked list
    public void delete(int key) {
        if (head == null) {
            System.out.println("Circular linked list is empty.");
            return;
        }

        Node curr = head, prev = null;

        // If head node itself holds the key to be deleted
        if (curr.data == key) {
            while (curr.next != head) {
                curr = curr.next;
            }
            curr.next = head.next;
            head = head.next;
            return;
        }

        // Search for the key to be deleted, keep track of the previous node
        while (curr.next != head) {
            prev = curr;
            curr = curr.next;
            if (curr.data == key) {
                prev.next = curr.next;
                return;
            }
        }

        // If the key was not present in the circular linked list
        if (curr.data != key) {
            System.out.println("Element not found in the circular linked list.");
        }
    }

    public static void main(String[] args) {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int count = scanner.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < count; i++) {
            int element = scanner.nextInt();
            list.insert(element);
        }

        System.out.print("\nCircular Linked List: ");
        list.traverse();

        System.out.print("\nEnter an element to search: ");
        int searchKey = scanner.nextInt();
        if (list.search(searchKey)) {
            System.out.println("Element found in the circular linked list.");
        } else {
            System.out.println("Element not found in the circular linked list.");
        }

        System.out.print("\nEnter an element to insert at the beginning: ");
        int insertAtBeginning = scanner.nextInt();
        list.insertAtBeginning(insertAtBeginning);
        System.out.print("Circular Linked List after insertion at the beginning: ");
        list.traverse();

        System.out.print("\nEnter an element to delete: ");
        int deleteKey = scanner.nextInt();
        list.delete(deleteKey);
        System.out.print("Circular Linked List after deletion: ");
        list.traverse();

        scanner.close();
    }
}
