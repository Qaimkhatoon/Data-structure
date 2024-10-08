public class QueueUsingStack {
 Stack s1,s2;

 QueueUsingStack() {
    s1 = new Stack();
    s2 = new Stack();}

    public void enqueue(int data)
 {
    s1.push(data);
 }

 public int dequeue()
 { 
    if (s1.isEmpty() && s2.isEmpty()) {
        System.out.println("Queue is empty");
        return -1;
    }        
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
 }
 return s2.pop();
}
public static void main(String[] args) {
 int[] keys = { 1, 3, 4, 5 };
 QueueUsingStack q = new QueueUsingStack();
 // insert above key
 for (int key : keys) {
 q.enqueue(key);
 }
 System.out.println(q.dequeue()); 
 System.out.println(q.dequeue()); 
//  q.enqueue(3);
 }
} 

