class FirstSingleLetter
{
    public static char firstSingleLetter (String text ,  int n){
    int arr[] = new int[26];

    for(int i=0; i<n;i++)
    {
        char c = text.charAt(i);
        arr[c-'A']++;
    }
    for(int i=0; i<n;i++)
    {
      char c =text.charAt(i);
      if(arr[c-'A']==1)
      {
        return c;
      }
    }
    return '\0';    
}

public static void main(String[] args) {

    String text= "AEROPLANE";
    int n= text.length();
    char result = firstSingleLetter(text,n);
    if(result != '\0')
    {
       System.out.println("First non-repeating character: "+result);
    }
    else{
        System.err.println("no non-repeating character found.");
    }
}
}       