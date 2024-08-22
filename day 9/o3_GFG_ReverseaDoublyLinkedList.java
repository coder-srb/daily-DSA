// GFG -Reverse a Doubly Linked List
// https://www.geeksforgeeks.org/problems/reverse-a-doubly-linked-list/1
class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int val) {
        data = val;
        next = null;
        prev = null;
    }
}

class o3_GFG_ReverseaDoublyLinkedList {
    public DLLNode reverseDLL(DLLNode head) {
        DLLNode curr = head;
        DLLNode prev = null;
        DLLNode next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    // Method to print the doubly linked list
    public void printDLL(DLLNode head) {
        DLLNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        o3_GFG_ReverseaDoublyLinkedList solution = new o3_GFG_ReverseaDoublyLinkedList();

        // Creating a doubly linked list: 1 <-> 2 <-> 3 <-> 4 <-> 5
        DLLNode head = new DLLNode(1);
        head.next = new DLLNode(2);
        head.next.prev = head;
        head.next.next = new DLLNode(3);
        head.next.next.prev = head.next;
        head.next.next.next = new DLLNode(4);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new DLLNode(5);
        head.next.next.next.next.prev = head.next.next.next;

        System.out.println("Original Doubly Linked List:");
        solution.printDLL(head);

        // Reversing the doubly linked list
        DLLNode reversedHead = solution.reverseDLL(head);

        System.out.println("Reversed Doubly Linked List:");
        solution.printDLL(reversedHead);
    }
}

