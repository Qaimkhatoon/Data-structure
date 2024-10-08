class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeSortedLists {

    // Function to merge two sorted linked lists
    public static Node mergeSortedLists(Node head1, Node head2) {
        // Create a dummy node to act as a placeholder
        Node dummy = new Node(0);
        Node tail = dummy;

        // Traverse both lists and append the smaller value to the merged list
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }

        // If one of the lists still has remaining nodes, append them
        if (head1 != null) {
            tail.next = head1;
        } else if (head2 != null) {
            tail.next = head2;
        }

        // Return the next node of dummy, which is the head of the merged list
        return dummy.next;
    }

    // Helper function to print the linked list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Example usage
        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(5);

        Node list2 = new Node(2);
        list2.next = new Node(4);
        list2.next.next = new Node(6);

        Node mergedHead = mergeSortedLists(list1, list2);
        printList(mergedHead);
    }
}