import java.util.Scanner;
class Array
{
    public static void main(String[] args) {
        // int []marks=new int [4];
        // marks[0]=23;
        // marks[2]=45;
        // marks[1]=89;

        // System.out.println(marks[1]);


    //     int marks[]={1,3,4,5,6};
    //     System.out.println(marks[2]);

    System.out.println("enter the value");
    Scanner sc= new Scanner(System.in);
    int size=sc.nextInt();
    // int marks[]=new int[size];
    int number[]=new int[size];

    for(int i=0;i<size;i++)
    {
        number[i]=sc.nextInt();
    }
    for(int i=0;i<number.length;i++)
    {
        System.out.print(number[i]+" ");
    }
     }
}