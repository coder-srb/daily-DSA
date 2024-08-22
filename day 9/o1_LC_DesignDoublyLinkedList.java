// https://leetcode.com/problems/design-linked-list/

class Node {
    public int data;  // Value of the node
    public Nodes next; // Pointer to the next node
    public Nodes prev; // Pointer to the previous node (for doubly linked list)

    // Constructor to create a new node with a given value
    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class o1_LC_DesignDoublyLinkedList {
    private Nodes head;  // Pointer to the head (first node) of the linked list
    private Nodes tail;  // Pointer to the tail (last node) of the linked list
    private int size;   // Number of elements in the linked list

    // Constructor to initialize an empty linked list
    public o1_LC_DesignDoublyLinkedList() {
        head = tail = null;
        size = 0;
    }

    // Method to get the value of the node at a specific index
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;  // Return -1 if the index is invalid
        }

        Nodes temp = head;
        for (int i = 0; i < index; i++) {  // Traverse to the node at the given index
            temp = temp.next;
        }
        return temp.data;  // Return the data of the found node
    }

    // Method to add a node with a specific value at the head of the list
    public void addAtHead(int val) {
        Nodes newNode = new Nodes(val);  // Create a new node
        if (size == 0) {
            head = tail = newNode;  // If the list is empty, both head and tail point to the new node
        } else {
            newNode.next = head;  // Link the new node to the former head
            head.prev = newNode;  // Link the former head back to the new node
            head = newNode;  // Update head to the new node
        }
        size++;  // Increase the size of the list
    }

    // Method to add a node with a specific value at the tail of the list
    public void addAtTail(int val) {
        Nodes newNode = new Nodes(val);  // Create a new node
        if (size == 0) {
            head = tail = newNode;  // If the list is empty, both head and tail point to the new node
        } else {
            tail.next = newNode;  // Link the current tail to the new node
            newNode.prev = tail;  // Link the new node back to the current tail
            tail = newNode;  // Update tail to the new node
        }
        size++;  // Increase the size of the list
    }

    // Method to add a node at a specific index in the list
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;  // If index is invalid, do nothing
        }
        if (index == 0) {
            addAtHead(val);  // If index is 0, add at the head
            return;
        }
        if (index == size) {
            addAtTail(val);  // If index equals the size, add at the tail
            return;
        }

        Nodes newNode = new Nodes(val);  // Create a new node
        Nodes temp = head;
        for (int i = 0; i < index - 1; i++) {  // Traverse to the node just before the desired index
            temp = temp.next;
        }

        // Insert the new node between temp and temp.next
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
        size++;  // Increase the size of the list
    }

    // Method to delete a node at a specific index in the list
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;  // If index is invalid, do nothing
        }

        if (index == 0) {  // If deleting the head node
            if (size == 1) {
                head = tail = null;  // If it's the only node, set head and tail to null
            } else {
                head = head.next;  // Move head to the next node
                head.prev = null;  // Set the previous pointer of the new head to null
            }
        } else if (index == size - 1) {  // If deleting the tail node
            tail = tail.prev;  // Move tail to the previous node
            tail.next = null;  // Set the next pointer of the new tail to null
        } else {  // If deleting a middle node
            Nodes temp = head;
            for (int i = 0; i < index; i++) {  // Traverse to the node at the desired index
                temp = temp.next;
            }
            temp.prev.next = temp.next;  // Link the previous node to the next node
            temp.next.prev = temp.prev;  // Link the next node back to the previous node
        }
        size--;  // Decrease the size of the list
    }


/*  Another method

class o1_LC_DesignDoublyLinkedList {
    List<Integer> l1;

    public o1_LC_DesignDoublyLinkedList() {
        this.l1=new ArrayList<Integer>();

    }

    public int get(int index) {
        if(index<l1.size())
        {
            return l1.get(index);
        }
        return -1;

    }

    public void addAtHead(int val) {
        l1.add(0,val);

    }

    public void addAtTail(int val) {
        l1.add(val);

    }

    public void addAtIndex(int index, int val) {
        if(index==l1.size())
        {
            l1.add(val);
        }
        else if(index<l1.size())
        {
            l1.add(index,val);

        }


    }

    public void deleteAtIndex(int index) {
        if(index<l1.size())
        {
            l1.remove(index);
        }

    }
}
*/

    /**
     * Your o1_LC_DesignDoublyLinkedList object will be instantiated and called as such:
     * o1_LC_DesignDoublyLinkedList obj = new o1_LC_DesignDoublyLinkedList();
     * int param_1 = obj.get(index);
     * obj.addAtHead(val);
     * obj.addAtTail(val);
     * obj.addAtIndex(index,val);
     * obj.deleteAtIndex(index);
     */

    void print() {
        Nodes temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.data + " <--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {

        o1_LC_DesignDoublyLinkedList myLinkedList = new o1_LC_DesignDoublyLinkedList();  // Initialize the linked list

        myLinkedList.addAtHead(1);    // Linked list becomes 1
        myLinkedList.print();

        myLinkedList.addAtTail(3);    // Linked list becomes 1->3
        myLinkedList.addAtTail(4);    // Linked list becomes 1->3->4
        myLinkedList.addAtTail(5);    // Linked list becomes 1->3->4->5
        myLinkedList.addAtTail(6);    // Linked list becomes 1->3->4->5->6
        myLinkedList.print();

        myLinkedList.addAtIndex(1, 2); // Linked list becomes 1->2->3->4->5->6
        myLinkedList.print();

        System.out.println(myLinkedList.get(1)); // Returns 2

        myLinkedList.deleteAtIndex(1); // Linked list becomes 1->3->4->5->6
        myLinkedList.print();
        System.out.println(myLinkedList.get(1)); // Returns 3
    }
}
