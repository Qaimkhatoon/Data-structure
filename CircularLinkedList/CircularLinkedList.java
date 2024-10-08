class CircularLinkedList {
    // Node class representing each element in the list
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the linked list
    private Node head = null;
    // Tail of the linked list
    private Node tail = null;

    // Method to add a node at the end
    public void add(int data) {
        Node newNode = new Node(data);

        // If the list is empty, initialize head and tail
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;  // Point the new node to head (making it circular)
        } else {
            // Add the new node after the tail
            tail.next = newNode;
            tail = newNode;       // Move the tail to the new node
            tail.next = head;     // Make it circular by pointing the last node to head
        }
    }

    // Method to display the circular linked list
    public void display() {
        if (head != null) {
            Node current = head;
            do {
                System.out.print(current.data + " ");
                current = current.next;
            } while (current != head);  // Continue until we reach the head again
            System.out.println();
        } else {
            System.out.println("The list is empty.");
        }
    }

    // Method to delete a node from the beginning
    public void deleteFirst() {
        if (head != null) {
            if (head == tail) {
                // If there's only one node, set head and tail to null
                head = tail = null;
            } else {
                // Move head to the next node and update tail's next pointer to new head
                head = head.next;
                tail.next = head;
            }
        }
    }
    //  // Method to AddFirst a node from the end
    public void addFirst(int data) {
        Node newNode = new Node(data);

        // If the list is empty, initialize head and tail
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;  // Point the new node to itself (making it circular)
        } else {
            // Point the new node to the current head
            newNode.next = head;
            head = newNode;       // Move the head to the new node
            tail.next = head;     // Make sure the tail points to the new head (to keep the list circular)
        }
    }

    // Method to delete a node from the end
    public void deleteLast() {
        if (head != null) {
            if (head == tail) {
                // If there's only one node, set head and tail to null
                head = tail = null;
            } else {
                Node current = head;
                while (current.next != tail) {
                    current = current.next;
                }
                // Remove the last node and update the tail
                current.next = head;
                tail = current;
            }
        }
    }

    // Main method to demonstrate the circular linked list
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //AddFirst
        list.addFirst(99);
        list.display();

        System.out.println("Original Circular Linked List:");
        list.display();  // Output: 1 2 3 4 5

        System.out.println("After deleting the first element:");
        list.deleteFirst();
        list.display();  // Output: 2 3 4 5

        System.out.println("After deleting the last element:");
        list.deleteLast();
        list.display();  // Output: 2 3 4
    }
}