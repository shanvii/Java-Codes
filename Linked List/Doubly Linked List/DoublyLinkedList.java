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

public class DoublyLinkedList {
    Node head;

    public void insert(int data) {
        Node new_node = new Node(data);

        if (head == null) {
            head = new_node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_node;
            new_node.prev = temp;
        }
    }

    public void insertBeginning(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        if (head != null) {
            head.prev = new_node;
        }
        head = new_node;
    }

    public void insertAtIndex(int data, int index) {
        Node new_node = new Node(data);
        Node temp = head;
        int count = 0;

        while (temp != null && count < index - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Index out of range");
        } else {
            new_node.next = temp.next;
            if (temp.next != null) {
                temp.next.prev = new_node;
            }
            temp.next = new_node;
            new_node.prev = temp;
        }
    }

    public void deleteBeginning() {
        if (head != null) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        }
    }

    public void deleteAtIndex(int index) {
        if (head == null) {
            return;
        }

        Node temp = head;
        int count = 0;

        while (temp != null && count < index) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Index out of range");
            return;
        }

        if (temp.prev != null) {
            temp.prev.next = temp.next;
        } else {
            head = temp.next;
        }

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
    }

    public void deleteEnd() {
        if (head == null || head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.prev.next = null;
        }
    }

    public void printList() {
        Node temp = head;
        System.out.print("\nDoubly Linked List: ");

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int count = scanner.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < count; i++) {
            int element = scanner.nextInt();
            list.insert(element);
        }

        System.out.print("\nBefore Operation: ");
        list.printList();

        System.out.print("\nMenu:\n1. For insertion at end\n2. For insertion at beginning\n3. For insertion at index\n4. For deletion from end\n5. For deletion from beginning\n6. For deletion from index\nEnter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("\nEnter element to insert at the end: ");
                int element = scanner.nextInt();
                list.insert(element);
                System.out.print("\nAfter Insertion at the end: ");
                list.printList();
                break;

            case 2:
                System.out.print("\nEnter element to insert at the beginning: ");
                element = scanner.nextInt();
                list.insertBeginning(element);
                System.out.print("\nAfter Insertion at the beginning: ");
                list.printList();
                break;

            case 3:
                System.out.print("\nEnter element to insert: ");
                element = scanner.nextInt();
                System.out.print("Enter index: ");
                int index = scanner.nextInt();
                list.insertAtIndex(element, index);
                System.out.print("\nAfter Insertion at index: ");
                list.printList();
                break;

            case 4:
                list.deleteEnd();
                System.out.print("\nAfter Deletion from end: ");
                list.printList();
                break;

            case 5:
                list.deleteBeginning();
                System.out.print("\nAfter Deletion from beginning: ");
                list.printList();
                break;

            case 6:
                System.out.print("\nEnter index to delete: ");
                index = scanner.nextInt();
                list.deleteAtIndex(index);
                System.out.print("\nAfter Deletion from index: ");
                list.printList();
                break;

            default:
                System.out.println("\nInvalid choice!");
        }

        scanner.close();
    }
}
