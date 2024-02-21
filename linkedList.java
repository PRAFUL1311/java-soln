class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }

    public void printNode() {
        System.out.print(val + " ");
    }
}

public class linkedList {
    public static Node processLinkedList(Node head) {
        Node temp=head;
        int k=1;
        while(k!=0){
            temp=temp.next;
            k--;
        }
        Node b=temp.next.next;
        temp.next=b;
       
        return head;
    } 

    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            current.printNode();
            current = current.next; 
        }
    }

    public static void main(String[] args) {
        // Creating a new linked list
        Node n1 = new Node(20);
        Node n2 = new Node(30);
        Node n3= new Node(40);
        Node n4= new Node(69);
        Node n5= new Node(88);
        Node n6= new Node(88);
        
        n1.next = n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        Node head = n1;

        // Process the linked list
        head = processLinkedList(head);

        // Printing the updated linked list
        System.out.print("Updated Linked List: ");
        printLinkedList(head);
    }
}
