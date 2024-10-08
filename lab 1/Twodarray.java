import java.util.Scanner;
public class Twodarray 
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner (System.in);  
     int rows=sc.nextInt();
     int colms=sc.nextInt();
     
     int[][]Array=new int[rows][colms];
     for(int i=0;i<rows;i++)
     {
        for(int j=0;j<colms;j++)
        {
        Array[i][j]=sc.nextInt();
        }
     }

    //  for(int i=0;i<rows;i++)
    //  {
    //     for(int j=0;j<colms;j++)
    //     {
    // System.out.print(Array[i][j]+" ");
    //     }
    //     System.out.println();
    //  }
   

     int x= sc.nextInt();
     for(int i=0;i<rows;i++)
     {
        for(int j=0;j<colms;j++)
        {
       if(Array[i][j]==x)
       {
        System.out.println("x is found at location("+i+","+j+")");
       }
        }
     }

     }
    }
