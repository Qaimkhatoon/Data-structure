public class Lll {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            newNode=null;
            return;
        }
        Node temp=head;
        while (temp.next!=null) {
            temp=temp.next;           
        }
        temp.next=newNode;
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is ALREADY NULL");
        }
        head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("List is ALREADY NULL");
        }
        Node temp=head;
        while (temp.next.next!=null) {
            temp=temp.next;
        }
        temp.next=null;
    }

    void removeAt(int index) 
    { 
    if (index==1) 
       { addFirst(index);} 
     
    else{ 
        Node n=head; 
        Node temp=null; 
        for(int i=1;i<index-1;i++) 
        { 
            n=n.next; 
        } 
        temp=n.next; 
        n.next=temp.next; 
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
    public static void main(String[] args) {
        Lll list =new Lll();
        list.addFirst(1);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        // list.addLast(0);

        list.removeAt(1);

        // list.deleteFirst();
        // list.deleteLast();

        list.printList();

}
}
