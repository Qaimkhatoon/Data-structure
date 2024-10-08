public class Mainque {
    public static void main(String[] args) {
        Queue q= new Queue();
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(7);
        q.enqueue(6);
        q.enqueue(1);
        q.enqueue(5);
       System.out.println(q.dequeue());

        q.printList();          
    }
}
