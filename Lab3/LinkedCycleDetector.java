public class LinkedCycleDetector {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public boolean hasCycle(Node head) {
        if (head == null || head.next == null) {
            return false; 
        }
        Node slow = head;
        Node fast = head;

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
        LinkedCycleDetector list = new LinkedCycleDetector();
        Node head = list.new Node(1);
        head.next = list.new Node(2);
        head.next.next = list.new Node(3);
        head.next.next.next = list.new Node(4);
        head.next.next.next.next = head.next;  
        System.out.println("Does the linked list have a cycle? " + list.hasCycle(head)); 
    }
}