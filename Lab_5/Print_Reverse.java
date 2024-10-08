import java.util.Stack;
class Node<T>{
  T data;
  Node<T> next;
  Node(T data)
  {
    this.data=data;
    this.next=null;
  }
}

public class Print_Reverse<T> 
{
   Node<T> head;
    public Print_Reverse()
    {
        head = null;
    } 

    public void Add(T data)
    {  
        Node<T> newNode = new Node<>(data);
        if(head==null)
        {
            head = newNode;
        }
        else{
            Node<T> current = head;
            while(current.next != null)
            {
                current=current.next;
            }
            current.next = newNode;
        }
    }

    public void printReverse()
    {
        Stack<T> stack = new Stack<>();
        Node<T> current = head;
        while(current!=null)
        {
            stack.push(current.data);
            current=current.next;
        }

        while(!stack.isEmpty())
        {
            System.out.print(stack.pop()+" ");
        }
        System.out.println();
    }
      public static void main(String[] args) {
        Print_Reverse<Integer> pr = new Print_Reverse<>();
        pr.Add(1);
        pr.Add(3);
        pr.Add(5);
        pr.Add(8);
        pr.Add(9);
        
        System.out.println("Linked List printed in reverse:");
        pr.printReverse();
      }

}