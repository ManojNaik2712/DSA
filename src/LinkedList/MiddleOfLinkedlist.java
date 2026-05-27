package LinkedList;

public class MiddleOfLinkedlist {
    private static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(12);
        head.next.next = new Node(15);
        head.next.next.next = new Node(17);
        head.next.next.next.next = new Node(2);

        Node middle = findMiddle(head);
        System.out.println(middle.data);
    }
}

/*
    Time : O(N)
    Space : O(1)
 */