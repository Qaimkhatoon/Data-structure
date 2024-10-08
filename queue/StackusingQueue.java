public class StackusingQueue {
    private Queue q1,q2;
    StackusingQueue()
    {
       q1=new Queue();
       q2=new Queue();
    }
    public void push(int data)
    {
        q1.enqueue(data);
    }
    public int pop()
    {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;  // Or throw an exception
        }
        return q1.dequeue();
    }

    public int top() {
        if (q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;  // Or throw an exception
        }
        return q1.peek();  // Peek the front, which is the top of the stack
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }
    // public void printList(){
    //     Node temp=head;
    //     while (temp!=null){
    //         System.out.print(temp.data+" ");
    //         temp=temp.next;            
    //     }
    // }
    public static void main(String[] args) {
        StackusingQueue sq = new StackusingQueue();
        sq.push(4);
        sq.push(6);
       
    }
    
}