class DoublyLinked
{
       Node head;
       class Node{
        String data;
        Node next,pre;
        Node(String data)
        {
            this.data=data;
            this.next=null;
            this.pre=null;
        }
    }

    public void AddFront(String data)
    {
        Node Newnode= new Node(data);
        
            if(head==null)
            {
                head=Newnode;
            }
            else{
           head.pre = Newnode;
           Newnode.next=head;}
           head=Newnode;
            }
        public void insertAtBeginning(String name)
         {
            Node Newnode= new Node(name);
           
            if(head==null)
            {
                head=Newnode;
            }
            else{ 
                head.pre=Newnode;
                Newnode.next=head;
                head=Newnode;                 
            }
         }

         public void insertAtEnd(String name)
         {
            Node Newnode= new Node(name);
            if(head==null)
            {
                head= Newnode;
            }
            Node temp=head;
            while (temp.next!=null) {
                temp=temp.next;           
            }
            temp.next= Newnode;
            Newnode.pre=temp;
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
                DoublyLinked dl =new DoublyLinked();
                dl.AddFront("haya");
                dl.AddFront("sumera");
                dl.AddFront("zoya");
                dl.AddFront("hi");
                dl.insertAtEnd("mehwish");
                dl.insertAtBeginning("dil");
                dl.printList();
            }
        }