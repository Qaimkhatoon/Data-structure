class Singlylinked
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
    Node head,tail;
    int size=0;
    public void insertAtBeginning(int data)
    {
        Node newnode=new Node(data);
         if(head==null)
         {
            head=tail=newnode;        
         }
         else{
            newnode.next=head;
            head=newnode;
         }
    }
    public void insertAtEnd(int data)
    {    
        Node newnode=new Node(data);
        if(tail==null)
        {
           head=tail=newnode;}
        else{
            tail.next=newnode;
            tail=newnode;
        }
    }
    public void removeFromBeginning()
    {
        if(head==null)
           return;
        if (head == tail) {
            head = tail = null;
        }
    else{
        head=head.next;
    }    
    }
    public void removeFromEnd()
    {
        if(head==null)
        return;
        if (head == tail) {
            head = tail = null;
        }
        else{
           Node temp=head;
           while(temp.next!=tail)
           {
              temp=temp.next;
           }
           temp.next=null;
           tail=temp;
        }
    }
    public void printlist()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.err.println(temp.data+" ");
            temp=temp.next;
        }System.out.println();
    }
}