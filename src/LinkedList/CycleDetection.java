package LinkedList;

public class CycleDetection {
    static boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Node head = new Node(10);

        head.next = new Node(20);
        head.next.next = new Node(30);

        // Creating cycle
        head.next.next.next = head.next;

        System.out.println(hasCycle(head));
    }
}

/*
    Time : O(N)
    Space : O(1)
    Approach : Floyed cycle detection(slow and fast pointer)
 */