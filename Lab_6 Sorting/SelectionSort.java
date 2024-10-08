class SelectionSort{
public static void Printlist(int arr[])
{
for(int i=0;i<arr.length;i++)
{
    System.err.print(arr[i]+" ");
}
}
public static void main(String[] args)
 {
     int arr[]={9,4,6,2,1};
    
     for(int i=0;i<arr.length-1;i++)
     {
        int smallest=i;
        for(int j=i+1;j<arr.length;j++)
        {
          if(arr[smallest]>arr[j])
          {
            smallest=j;
          }
        }
        int temp=arr[smallest];
        arr[smallest]=arr[i];
        arr[i]=temp;
     }
     Printlist(arr);
 }
}