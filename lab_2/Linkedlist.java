public class Linkedlist {
    public static class Node
    {
        int data; 
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
        public static void main(String args[])
       {
       Node a = new Node(3);
       Node b = new Node(7);
       Node c = new Node(6);
       Node d = new Node(4);
       a.next=b;
       b.next=c;
       c.next=d;

      Node temp = a;
      for(int i=1;i<=4;i++)
      {
        System.out.print(temp.data+" ");
        temp=temp.next;
      }
      



    //    System.out.println(a.data+" "+b.data+" "+c.data+" "+d.data);
         
    //       System.out.println(a.next.data+" "+b.next.data+" "+c.next.data);
        }
    }
    

