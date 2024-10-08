public class LengthList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
Node head;

void add(int data)
{
    Node newNode = new Node(data);
    if(head==null)
    {
        head= newNode;
    }
    else
    {
        Node temp =head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
    }
}
    public int Length()
    {
        int count=0;
        Node temp = head;
        while(temp!=null)
        {
        count++;
        temp=temp.next;
        }
        return count;
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