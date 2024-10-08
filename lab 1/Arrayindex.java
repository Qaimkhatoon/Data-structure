import java.util.Scanner;
public class Arrayindex 
{
public static void main(String args[]) 
{
    Scanner sc =new Scanner(System.in);
    int size= sc.nextInt();
    int array[]=new int[size];
    for(int i=0;i<size;i++)
    {
        array[i]=sc.nextInt();
    }
      int x=sc.nextInt();
      for(int i=0;i<size;i++)
      {
        if(array[i]==x)
        {
            System.out.println("x is found at the location ("+i+" ");
        }
      }
}
}
