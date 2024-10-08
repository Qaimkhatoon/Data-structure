class Node<T>{
    T data;
    Node<T> next;

    Node(T data)
    {
      this.data=data;
     this.next =null;
    }
    }
    
public class Link<T>{
     Node<T> head;
    public Link()
    {
        head =null;
    }
 
    public void Add(T data)
    {
        Node<T> newNode = new Node<>(data);
        if(head==null)
        {
            head= newNode;
        }
      else{
        Node<T> current = head;
        while(current.next!=null)
        {
            current=current.next;
        }
        current.next=newNode;        
      }
    }
 
 public void AddFirst(T data)
 {
    Node<T> newNode = new Node<>(data);
    if(head==null)
    {
        head=newNode;
    }
    else{
        newNode.next=head;
        head=newNode;
    }
 }

 public void AddLast()
 { Node<T> newNode = new Node<>(null);
   if(head==null){
      head=newNode;
   }
   else{
    Node<T> current = head;
    while(current.next!=null)
    {
        current=current.next;
    }
    current.next=newNode;
   }
 }

 public void Printlist()
 {
   Node<T> current = head;
   while(current !=null)
   {
    System.out.print(current.data+" ");
    current= current.next;
   }
 System.out.println();
 }

 public static void main(String[] args) {
    Link<Integer> l1= new Link<>();
    l1.Add(3);
    l1.Add(1);
    l1.Add(7);
    l1.Add(4);
    l1.AddFirst(0);
    l1.Printlist();

    Link<String> l2 =new Link<>(); 
    l2.Add("sumera");
    l2.Add("khan");
    l2.Add("Durrani"); 
    l2.AddFirst("hello");
    l2.AddFirst("hi");      
    l2.Printlist();
 }  
  }