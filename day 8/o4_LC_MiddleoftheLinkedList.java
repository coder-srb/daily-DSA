// https://leetcode.com/problems/middle-of-the-linked-list/description/

public class o4_LC_MiddleoftheLinkedList {

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode head;

    public ListNode middleNode(ListNode head) {  // middle node; If there are two middle nodes, return the second middle node.
        ListNode slow, fast;
        slow = fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {

    }
}
