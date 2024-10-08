class Stack
{
        class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;
        } 
    }
    Node head;
    int size;
    public Stack() {
        head = null;
        size = 0;
    }
    public void push(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
        }
        else{
            newnode.next = head;  
            head = newnode;}
        size++;
}
    public int pop()
    {   
        if (head == null) {
            System.out.println("Stack is empty");
            return -1;}
        
        int s=head.data;
        head=head.next;
        size--;
        return s;
    }
    int top()
    {
        if(head==null)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        return head.data;
    }
    boolean isEmpty()
    {
        return head==null;
    }
    int size()
    {
        return size;
    }
        public void printlist()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}