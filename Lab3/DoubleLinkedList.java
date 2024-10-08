public class DoubleLinkedList {
    public class Node {
        String name;
        Node prev, next;

        Node(String name) {
            this.prev = null;
            this.next = null;
            this.name = name;
        }
    }

    Node head, tail;
    public void insertAtBeginning(String name) {
        Node newNode = new Node(name);
        insertAtBeginning(newNode);
    }
    public void insertAtBeginning(Node node) {
        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }
    public void insertAtEnd(String name) {
        Node newNode = new Node(name);
        insertAtEnd(newNode);
    }
    public void insertAtEnd(Node node) {
        if (tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }
    public void insertAfterName(String name, Node node) {
        Node current = head;
        while (current != null && !current.name.equals(name)) {
            current = current.next;
        }
        if (current == null) {
            throw new IllegalArgumentException("Node with name " + name + " not found.");
        }
        node.next = current.next;
        node.prev = current;
        if (current.next != null) {
            current.next.prev = node;
        } else {
            tail = node;  
        }
        current.next = node;
    }
    public void insertBeforeName(String name, Node node) {
        Node current = head;
        while (current != null && !current.name.equals(name)) {
            current = current.next;
        }
        if (current == null) {
            throw new IllegalArgumentException("Node with name " + name + " not found.");
        }
        node.next = current;
        node.prev = current.prev;
        if (current.prev != null) {
            current.prev.next = node;
        } else {
            head = node;  
        }
        current.prev = node;
    }
    public void makeCircular() {
        if (head == null || tail == null) {
            throw new IllegalStateException("List is empty. Cannot make it circular.");
        }
        tail.next = head;
        head.prev = tail;
    }
    public void printAll() {
        Node temp=head;
        while(temp!=null)
        {
            System.err.println(temp.name+" ");
            temp=temp.next;
        }System.out.println();
    }
                public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();

        dll.insertAtBeginning("zoya");
        dll.insertAtEnd("maheen");
        dll.insertAtBeginning("Charlie");

        dll.insertAfterName("zoya", dll.new Node("sumera"));
        dll.printAll();  

        dll.insertBeforeName("zoya", dll.new Node("ali"));
        dll.printAll(); 
        dll.makeCircular();
        dll.printAll();  
    }
}