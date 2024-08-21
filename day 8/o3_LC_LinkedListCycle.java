// https://leetcode.com/problems/linked-list-cycle/description/

public class o3_LC_LinkedListCycle {

    //Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode head;

    public boolean hasCycle(ListNode head) {

        if (head == null) {
            return false;
        }

        ListNode slow, fast;
        slow = fast = head;

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
        o3_LC_LinkedListCycle ll = new o3_LC_LinkedListCycle();
        head = new ListNode(3);
        ListNode temp = new ListNode(2);
        head.next = temp;
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = temp;

        System.out.println(ll.hasCycle(head));
    }
}
