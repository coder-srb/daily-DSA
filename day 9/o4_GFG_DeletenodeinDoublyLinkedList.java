// GFG - Delete node in Doubly Linked List
// https://www.geeksforgeeks.org/problems/delete-node-in-doubly-linked-list/1


class Nodes {
    int data;
    Nodes next;
    Nodes prev;

    Nodes(int x) {
        data = x;
        next = null;
        prev = null;
    }
}

class o4_GFG_DeletenodeinDoublyLinkedList {
    public Nodes deleteNode(Nodes head, int x) {
        // Base case: if the list is empty
        if (head == null) {
            return null;
        }

        // If the node to be deleted is the head
        if (x == 1) {
            Nodes newHead = head.next;
            if (newHead != null) {
                newHead.prev = null;
            }
            return newHead;
        }

        // Traverse to the node to be deleted
        Nodes current = head;
        int count = 1;

        while (current != null && count < x) {
            current = current.next;
            count++;
        }

        // If the node to be deleted is found
        if (current != null) {
            // If it's not the last node, change the next node's prev link
            if (current.next != null) {
                current.next.prev = current.prev;
            }

            // If it's not the first node, change the previous node's next link
            if (current.prev != null) {
                current.prev.next = current.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        o4_GFG_DeletenodeinDoublyLinkedList solution = new o4_GFG_DeletenodeinDoublyLinkedList();

        // Creating a doubly linked list: 10 <-> 20 <-> 30 <-> 40 <-> 50
        Nodes head = new Nodes(10);
        head.next = new Nodes(20);
        head.next.prev = head;
        head.next.next = new Nodes(30);
        head.next.next.prev = head.next;
        head.next.next.next = new Nodes(40);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new Nodes(50);
        head.next.next.next.next.prev = head.next.next.next;

        // Print original list
        printList(head);

        // Delete node at position 3
        head = solution.deleteNode(head, 3);

        // Print the list after deletion
        printList(head);
    }

    // Utility method to print the list
    public static void printList(Nodes head) {
        Nodes temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

