class Solution {
    public int lengthOfLastWord(String s) 
    {
        int count=0;
        String s1=s.trim();
        int i=0;
        while(i<s1.length())
        {
            if(s1.charAt(i)==' ')
            {
                count=0;
            }
            else
            {
                count++;
            }
            i++;
        }
        return count;   
    }
}
