public class MainStack {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(3);
        s.push(5);
        s.push(8);
        s.push(9);
        s.push(1);

        System.out.println("top of stack is "+s.top());
        System.out.println("Popped element: "+s.pop());
        
        System.out.println("size of stack is "+s.size());
        System.out.println("is the stack is empty or not "+s.isEmpty());
        s.printlist();
    }
}
