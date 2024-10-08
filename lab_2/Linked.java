public class Linked{
  Node head;
    public void AddToFront(int data)
    {
      Node n = new Node(data);
      if(head==null)
      {
        head=n;
      } 
      else{ Node temp=head;
       head=n;
       n.next=temp; 
      }
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

