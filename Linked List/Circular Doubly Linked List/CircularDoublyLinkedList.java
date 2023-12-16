import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int d) {
        data = d;
        prev = null;
        next = null;
    }
}

public class CircularDoublyLinkedList {
    Node head;

    // Insertion at the end of the circular doubly linked list
    public void insert(int data) {
        Node new_node = new Node(data);

        if (head == null) {
            new_node.next = new_node;
            new_node.prev = new_node;
            head = new_node;
        } else {
            Node tail = head.prev;
            tail.next = new_node;
            new_node.prev = tail;
            new_node.next = head;
            head.prev = new_node;
        }
    }

    // Traversing the circular doubly linked list
    public void traverse() {
        if (head == null) {
            System.out.println("Circular doubly linked list is empty.");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println(head.data); // Printing the head again to signify the end
    }

    // Searching for a specific element in the circular doubly linked list
    public boolean search(int key) {
        if (head == null) {
            System.out.println("Circular doubly linked list is empty.");
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

    // Insertion at the beginning of the circular doubly linked list
    public void insertAtBeginning(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            new_node.next = new_node;
            new_node.prev = new_node;
            head = new_node;
        } else {
            Node tail = head.prev;
            new_node.next = head;
            head.prev = new_node;
            new_node.prev = tail;
            tail.next = new_node;
            head = new_node;
        }
    }

    // Deletion of a specific element from the circular doubly linked list
    public void delete(int key) {
        if (head == null) {
            System.out.println("Circular doubly linked list is empty.");
            return;
        }

        Node curr = head;

        // If only one node in the list
        if (head.next == head && head.data == key) {
            head = null;
            return;
        }

        // Find the node to delete
        Node toDelete = null;
        do {
            if (curr.data == key) {
                toDelete = curr;
                break;
            }
            curr = curr.next;
        } while (curr != head);

        // Node to delete is not found
        if (toDelete == null) {
            System.out.println("Element not found in the circular doubly linked list.");
            return;
        }

        // If node to delete is head
        if (toDelete == head) {
            head = head.next;
        }

        toDelete.prev.next = toDelete.next;
        toDelete.next.prev = toDelete.prev;
    }

    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int count = scanner.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < count; i++) {
            int element = scanner.nextInt();
            list.insert(element);
        }

        System.out.print("\nCircular Doubly Linked List: ");
        list.traverse();

        System.out.print("\nEnter an element to search: ");
        int searchKey = scanner.nextInt();
        if (list.search(searchKey)) {
            System.out.println("Element found in the circular doubly linked list.");
        } else {
            System.out.println("Element not found in the circular doubly linked list.");
        }

        System.out.print("\nEnter an element to insert at the beginning: ");
        int insertAtBeginning = scanner.nextInt();
        list.insertAtBeginning(insertAtBeginning);
        System.out.print("Circular Doubly Linked List after insertion at the beginning: ");
        list.traverse();

        System.out.print("\nEnter an element to delete: ");
        int deleteKey = scanner.nextInt();
        list.delete(deleteKey);
        System.out.print("Circular Doubly Linked List after deletion: ");
        list.traverse();

        scanner.close();
    }
}
