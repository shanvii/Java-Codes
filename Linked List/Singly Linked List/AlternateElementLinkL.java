/*Given two linked list in a way such that the resultant list must contain the alternate elements from one 
list to another.
For Example: List 1: 10 20 30 40 50
List 2: 90 100 200 300 
Resultant list: 10 90 20 100 30 200 40 300 50*/

public class AlternateElementLinkL {
    
    private Node head = null;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void insert(int data) {
        Node newNode = new Node(data);
        if(head == null) 
            head = newNode;
        else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void display() {
        Node temp = head;
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println("\n");
    }

    void alternate(AlternateElementLinkL List1, AlternateElementLinkL List2, AlternateElementLinkL resultantList) {
        Node temp1 = List1.head;
        Node temp2 = List2.head;
        while(temp1 != null || temp2 != null) {
            if(temp1 != null) {
                resultantList.insert(temp1.data);
                temp1 = temp1.next;
            }
            if(temp2 != null) {
                resultantList.insert(temp2.data);
                temp2 = temp2.next;
            }
        }
    }

    public static void main(String[] args) {

        AlternateElementLinkL List1 = new AlternateElementLinkL();

        List1.insert(10);
        List1.insert(20);
        List1.insert(30);
        List1.insert(40);
        List1.insert(50);

        System.out.println("List1: ");
        List1.display();

        AlternateElementLinkL List2 = new AlternateElementLinkL();

        List2.insert(90);
        List2.insert(100);
        List2.insert(200);
        List2.insert(300);

        System.out.println("List2: ");
        List2.display();

        AlternateElementLinkL resultantList = new AlternateElementLinkL();
        resultantList.alternate(List1, List2, resultantList);

        System.out.println("Resultant List: ");
        resultantList.display();
    }
}
