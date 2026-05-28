package LinkedList;

public class MergeSortedList {
    static Node merge(Node list1, Node list2) {
        Node dummy = new Node(-1);
        Node tail = dummy;

        while (list1 != null && list2 != null) {
            if (list1.data <= list2.data) {

                tail.next = list1;
                list1 = list1.next;

            } else {

                tail.next = list2;
                list2 = list2.next;

            }
            tail = tail.next;
        }

        // Remaining nodes
        if (list1 != null) {
            tail.next = list1;
        }

        if (list2 != null) {
            tail.next = list2;
        }

        return dummy.next;
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

        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(5);

        Node list2 = new Node(2);
        list2.next = new Node(4);
        list2.next.next = new Node(6);

        Node merged = merge(list1, list2);

        printList(merged);
    }
}

/*
    Time : O(n + m)
    Space : O(1)
 */