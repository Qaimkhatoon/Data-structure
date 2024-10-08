class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

class Reverse
{
    Node head;
    public void add(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else{
           Node current =head;
           while (current.next != null)
           {
            current=current.next;
           }
           current.next=newNode;
        }
    }

    public void ReverseData()
    {
        if (head==null){
            System.out.println("LIST_ISEMPTY");
    }
    else{
        Node pre = null;
        Node current= head;
        Node next = null;
        while(current!=null)
        {
            next=current.next;
            current.next=pre;
            pre=current;
            current=next;
        }
        head=pre;
    }
    }

    public void printlist()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.err.println();
    }

    public static void main(String[] args) {
       Reverse R1 = new Reverse();
       R1.add(0);
       R1.add(9);
       R1.add(3);
       R1.add(2);
       System.out.println("Before Reverse : ");
       R1.printlist();
       System.out.println("After Reverse : ");
       R1.ReverseData();
       R1.printlist();
        
    }
}
