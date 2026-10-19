public class StrHelper {

    /**
     * This method determines if a String is a palindrome,
     * which means it is the same forwards and backwards.
     * 
     * @param text The text you want to check as a palindrome.
     * @return A boolean of whether or not it was a palindrome.
     */
    public static boolean isPalindrome(String text)
    {
        String reversed = reverse(text);
        
        if (text==reversed)
        {
            return true;
        }
        else
        {
            return False;
        }
    }
    
    /**
     * This method reverses a String.
     * 
     * @param text The string to reverse.
     * @return The new reversed String.
     */
    public static String reverse(String text)
    {
        String result = "";
        
        for (int i = text.length(); i >= 0; i--)  
        {
            String cur = text.substring(i , i + 1);
            result += cur;
        }
        return result;
    }
}