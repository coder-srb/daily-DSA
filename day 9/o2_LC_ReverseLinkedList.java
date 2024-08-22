// https://leetcode.com/problems/reverse-linked-list/description/

class ListNode {  // Definition for singly-linked list.
    int val;        // Value of the node
    ListNode next;  // Pointer to the next node

    ListNode(int val) {
        this.val = val;
    }  // Constructor with value

    // Constructor with value and next pointer
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class o2_LC_ReverseLinkedList {
    // Method to reverse the linked list  ( 3 variables & 4 steps method)
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;    // Current node starts at the head
        ListNode prev = null;    // Previous node starts as null since the new tail will point to null
        ListNode next;           // Pointer to store the next node temporarily

        // Traverse the list until we reach the end
        while (curr != null) {
            next = curr.next;    // Store the next node
            curr.next = prev;    // Reverse the link by pointing current node's next to the previous node
            prev = curr;         // Move the previous pointer to the current node
            curr = next;         // Move the current pointer to the next node in the original list
        }

        // By the end of the loop, prev will be pointing to the new head of the reversed list
        return prev;
    }

    public void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        o2_LC_ReverseLinkedList solution = new o2_LC_ReverseLinkedList();

        // LinkedList [1, 2, 3, 4, 5]
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        System.out.print("Original List: ");
        solution.printList(head1); // Print original list

        ListNode reversedHead1 = solution.reverseList(head1);

        System.out.print("Reversed List: ");
        solution.printList(reversedHead1); // Print reversed list

    }
}

