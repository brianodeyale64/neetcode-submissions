class Solution 
{
    public boolean isPalindrome(String s) 
    {
        StringBuilder strs = new StringBuilder();

        for (char c : s.toCharArray()) 
        {
            if (Character.isLetterOrDigit(c)) 
            {
                strs.append(Character.toLowerCase(c));
            }
        }

        String clean = strs.toString();
        String reversed = strs.reverse().toString();
        return clean.equals(reversed);
    }
}