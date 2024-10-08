class Queue
{
    class Node{
        int data;
        Node next=null;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    Node head,tail;
    int size=0;
    void enqueue(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            tail=newnode;           
        }
        else{
            tail.next=newnode;
            tail=newnode;
            }
            size++;        
    }
    public int dequeue()
    { if (isEmpty()) {
        System.out.println("Queue is empty");
        return -1; 
    }
        int s=head.data;
        head=head.next;
        size--;
        if (head == null) { 
            tail = null;
        }
        return s;
    }
    boolean isEmpty()
    {
       return head==null;
    }
    int size()
    {
        return size;
    }
    public void printList(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;            
        }
            System.out.println();
    }  
     
}