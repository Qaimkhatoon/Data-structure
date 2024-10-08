public class MainSinglylinked {
    public static void main(String[] args) {
        Singlylinked s = new Singlylinked();
        s.insertAtBeginning(3);
        s.insertAtBeginning(9);
        s.insertAtBeginning(6);
        s.insertAtBeginning(4);

        s.insertAtEnd(5);
        s.insertAtEnd(3);

        s.removeFromBeginning();
        s.removeFromEnd();

        s.printlist();
    }
}
