class Node<T> {
    T data;
    Node<T> next;

    // Constructor to initialize the node
    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class GenericLinkedList<T> {
    private Node<T> head;

    // Constructor to initialize an empty list
    public GenericLinkedList() {
        head = null;
    }
     
        // Add a new element at the end of the list
        public void add(T data) {
            Node<T> newNode = new Node<>(data);
            if (head == null) {
                head = newNode;
            } else {
                Node<T> current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }
    
        // Add a new element at the beginning of the list
        public void addFirst(T data) {
            Node<T> newNode = new Node<>(data);
            newNode.next = head;
            head = newNode;
        }
    
        // Remove the first element from the list
        public void removeFirst() {
            if (head != null) {
                head = head.next;
            }
        }
    
        // Remove the last element from the list
        public void removeLast() {
            if (head == null) {
                return;
            }
            if (head.next == null) {
                head = null;
                return;
            }
    
            Node<T> current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
    
        // Print the entire linked list
        public void printList() {
            Node<T> current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    
        // Check if the list is empty
        public boolean isEmpty() {
            return head == null;
        }
    
    
        public static void main(String[] args) {
            // Creating a linked list of integers
            GenericLinkedList<Integer> intList = new GenericLinkedList<>();
            intList.add(1);
            intList.add(2);
            intList.addFirst(0);
            intList.printList();  // Output: 0 1 2
            
            // Creating a linked list of strings
            GenericLinkedList<String> strList = new GenericLinkedList<>();
            strList.add("Hello");
            strList.add("World");
            strList.addFirst("Hi");
            strList.printList();  // Output: Hi Hello World
        }
    }