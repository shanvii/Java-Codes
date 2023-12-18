import java.util.Scanner;

public class LinkedListOp {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node head; // Head of the linked list

    // Method to insert a node at the end of the linked list
    public void insert(int data) {
        Node new_node = new Node(data);

        if (head == null) {
            head = new_node;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
    }

    // Method to insert a node at the beginning of the linked list
    public void insertBeginning(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    // Method to delete a node from the beginning of the linked list
    public void deleteBeginning() {
        if (head != null) {
            head = head.next;
        }
    }

    // Method to insert a node at the end of the linked list
    public void insertEnd(int data) {
        Node new_node = new Node(data);
        new_node.next = null;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new_node;
    }

    // Method to delete a node from the end of the linked list
    public void deleteEnd() {
        if (head == null || head.next == null) {
            head = null;
        } else {
            Node temp = head;
            Node prev = null;
            while (temp.next != null) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = null;
        }
    }

    // Method to print the linked list
    public void printList() {
        Node currNode = head;
        int index = 0;
        System.out.println("\nLinkedList: ");

        while (currNode != null) {
            System.out.println("Index: " + index + " data: " + currNode.data);
            index++;
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {
        linkListTraversal list = new linkListTraversal();

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int count = reader.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < count; i++) {
            int element = reader.nextInt();
            list.insert(element);
        }

        System.out.print("\nBefore Operation: ");
        list.printList();

        System.out.print(
                "\nMenu:\n1. For insertion in beginning\n2. For insertion at end\n3. Deletion from beginning\n4. Deletion from end\nEnter your choice: ");
        int choice = reader.nextInt();

        switch (choice) {
            case 1:
                System.out.print("\nEnter element to insert at the beginning: ");
                int element = reader.nextInt();
                list.insertBeginning(element);
                System.out.print("\nAfter Insertion in the beginning: ");
                list.printList();
                break;

            case 2:
                System.out.print("\nEnter element to insert at the end: ");
                element = reader.nextInt();
                list.insertEnd(element);
                System.out.print("\nAfter Insertion at the end: ");
                list.printList();
                break;

            case 3:
                list.deleteBeginning();
                System.out.print("\nAfter Deletion from beginning: ");
                list.printList();
                break;

            case 4:
                list.deleteEnd();
                System.out.print("\nAfter Deletion from end: ");
                list.printList();
                break;

            default:
                System.out.println("\nInvalid choice!");
        }

        reader.close();
    }
}
