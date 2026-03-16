package module_10;

//LeetCode 141 – Linked List Cycle
/*
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 */
class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1(int val) {
        this.val = val;
        this.next = null;
    }
}
public class LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slow = head;
        ListNode fast = head;

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
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(0);
        
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;
        boolean result = hasCycle(head);
        System.out.println("Cycle present: " + result);
    }
}