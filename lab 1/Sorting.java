import java.util.Arrays;

public class Sorting {
public static void main(String[] args) {
    

    int []array={1,2,3,4,5,6,7,8,9};
    System.out.println("orignal array");
    System.out.println(Arrays.toString(array));

    int j=0;
    for(int i=j;i<array.length;i++)
    {
        int temp;
        if(array[i]%2!=0)
        {
         temp=array[j];
         array[j]=array[i];
         array[i]=temp;
         j++;

        }
    }
    System.out.println("sorted array");
    System.out.println(Arrays.toString(array));

}
    
}
