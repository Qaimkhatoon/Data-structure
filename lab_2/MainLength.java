public class MainLength {
    public static void main(String[] args) {
        LengthList ll= new LengthList();
        ll.add(3);
        ll.add(5);
        ll.add(7);
        ll.add(9);
        ll.add(1);
        ll.add(2);

        ll.printList();

        int length = ll.Length();
        System.out.println("Length of the linked list: " + length);
        
        // System.out.println(ll.Length());
        
        
    }
}
