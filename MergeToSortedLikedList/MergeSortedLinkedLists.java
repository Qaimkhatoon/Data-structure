class MergeSortedLinkedLists {
    // Node class representing each element in the list
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to merge two sorted linked lists and return the head of the merged list
    public Node mergeLists(Node l1, Node l2) {
        // Create a dummy node to form the basis of the merged list
        Node dummy = new Node(0);
        Node current = dummy;

        // While both lists have nodes to process
        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                current.next = l1;  // Add the node from list l1
                l1 = l1.next;       // Move to the next node in l1
            } else {
                current.next = l2;  // Add the node from list l2
                l2 = l2.next;       // Move to the next node in l2
            }
            current = current.next;  // Move the pointer of the merged list forward
        }

        // If any elements are remaining in either list, append them
        if (l1 != null) {
            current.next = l1;
        } else if (l2 != null) {
            current.next = l2;
        }

        // Return the head of the merged list (skip the dummy node)
        return dummy.next;
    }

    // Method to add a node at the end of the list
    public Node addLast(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    // Method to display the linked list
    public void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main method to test the merging of two sorted linked lists
    public static void main(String[] args) {
        MergeSortedLinkedLists list = new MergeSortedLinkedLists();

        // First sorted list: 1 -> 3 -> 5
        Node l1 = null;
        l1 = list.addLast(l1, 1);
        l1 = list.addLast(l1, 3);
        l1 = list.addLast(l1, 5);

        // Second sorted list: 2 -> 4 -> 6
        Node l2 = null;
        l2 = list.addLast(l2, 2);
        l2 = list.addLast(l2, 4);
        l2 = list.addLast(l2, 6);

        System.out.println("First List:");
        list.display(l1);  // Output: 1 3 5

        System.out.println("Second List:");
        list.display(l2);  // Output: 2 4 6

        // Merge the two lists
        Node mergedHead = list.mergeLists(l1, l2);

        System.out.println("Merged List:");
        list.display(mergedHead);  // Output: 1 2 3 4 5 6
    }
}