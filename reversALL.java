import java.util.LinkedList;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class reversALL {
   

    // Method to reverse the linked list
    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
        return head;
    }

    // Method to insert a new node at the beginning of the linked list
    // void insertAtBeginning(int data) {
    //     Node newNode = new Node(data);
    //     newNode.next = head;
    //     head = newNode;
    // }

    // Method to display the linked list
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // reversALL list = new reversALL();
        // list.insertAtBeginning(1);
        // list.insertAtBeginning(2);
        // list.insertAtBeginning(3);
        // list.insertAtBeginning(4);

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("Original Linked List:");
        display(head);

        head = reverse(head);

        System.out.println("Reversed Linked List:");
        display(head);
    }
}



