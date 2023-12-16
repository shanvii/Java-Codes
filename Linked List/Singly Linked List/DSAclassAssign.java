/*
What is the output of following function for start pointing to first node of following 
linked list? 1->2->3->4->5->6

void fun(struct node* start)
{
 if(start == NULL)
 return;
 printf("%d ", start->data); 
 if(start->next != NULL )
 fun(start->next->next);
 printf("%d ", start->data);
} */

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DSAclassAssign {
    // Function to print the linked list in the specified pattern
    public static void fun(Node start) {
        if (start == null) {
            return;
        }

        // Print the data of the current node
        System.out.print(start.data + " ");

        if (start.next != null && start.next.next != null) {
            // Recursive call with the next-to-next node
            fun(start.next.next);
        }

        // Print the data of the current node again
        System.out.print(start.data + " ");
    }

    public static void main(String[] args) {
        // Create the linked list: 1->2->3->4->5->6
        Node start = new Node(1);
        start.next = new Node(2);
        start.next.next = new Node(3);
        start.next.next.next = new Node(4);
        start.next.next.next.next = new Node(5);
        start.next.next.next.next.next = new Node(6);

        // Call the function to traverse and print the linked list
        fun(start);
    }

} 
