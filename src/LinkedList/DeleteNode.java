package LinkedList;

public class DeleteNode {
    private static Node deleteNode(Node head, int key) {
        if (head == null) {
            return null;
        }
        if (head.data == key) {
            return head.next;
        }
        Node temp = head;

        while (temp != null && temp.next.data != key) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;

    }

    static void printList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(10);

        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head = deleteNode(head, 30);

        printList(head);
    }

}
