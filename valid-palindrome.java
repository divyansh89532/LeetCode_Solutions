class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","");
        s=s.toLowerCase();
        int last = s.length();
        for(int i=0;i<last;i++)
        {
            last--;
            if(s.charAt(i)!=s.charAt(last))
            return false;
        }
        return true;
    }
}
