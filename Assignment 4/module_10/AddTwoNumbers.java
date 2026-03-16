package module_10;

//LeetCode 2 – Add Two Numbers
/*
 * 
 */
class Node2 {
    int val;
    Node2 next;

    Node2(int val) {
        this.val = val;
        this.next = null;
    }
}
public class AddTwoNumbers {
    public static Node2 addTwoNumbers(Node2 l1, Node2 l2) {
        Node2 dummy = new Node2(0);
        Node2 current = dummy;

        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {

            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;

            current.next = new Node2(sum % 10);
            current = current.next;
        }
        return dummy.next;
    }
    public static void printList(Node2 head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node2 l1 = new Node2(2);
        l1.next = new Node2(4);
        l1.next.next = new Node2(3);

        Node2 l2 = new Node2(5);
        l2.next = new Node2(6);
        l2.next.next = new Node2(4);

        Node2 result = addTwoNumbers(l1, l2);
        System.out.print("Result: ");
        printList(result);
    }
}
