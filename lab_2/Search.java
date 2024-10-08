public class Search {
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
boolean  search(int target)
{
Node temp=head;
while(temp!=null)
{
   if(temp.data==target)
   {
    return true;
   }
   temp= temp.next;
}
return false;
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


