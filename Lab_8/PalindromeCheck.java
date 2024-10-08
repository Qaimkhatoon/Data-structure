public class PalindromeCheck{
    public static boolean Palindrome(String str)
    {
        if(str.length()>=1)
        {
             return true;
        }
        else{
            if(str.charAt(0)==str.charAt(str.length()-1))
            {
                 return Palindrome(str.substring(1,str.length()-1));
            }
               else {
                return false;
               }    
        }
    }
    public static void main(String[] args) {
        String input = "racecar";  
        boolean result = Palindrome(input);
        System.out.println("Is \"" + input + "\" a palindrome? " + result);  
    }    
}
