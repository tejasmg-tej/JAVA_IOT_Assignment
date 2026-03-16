package module_10;

//LeetCode 19 – Remove Nth Node From End of List
/*
 * Given the head of a linked list, remove the nth node from the end 
 * of the list and return its head.
 */
class Node1 {
    int val;
    Node1 next;

    Node1(int val) {
        this.val = val;
        this.next = null;
    }
}

public class RemoveNthNode {
    public static Node1 removeNthFromEnd(Node1 head, int n) {
        Node1 dummy = new Node1(0);
        dummy.next = head;

        Node1 fast = dummy;
        Node1 slow = dummy;
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return dummy.next;
    }

    public static void printList(Node1 head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node1 head = new Node1(1);
        head.next = new Node1(2);
        head.next.next = new Node1(3);
        head.next.next.next = new Node1(4);
        head.next.next.next.next = new Node1(5);

        int n = 2;
        head = removeNthFromEnd(head, n);
        System.out.print("Updated List: ");
        printList(head);
    }
}