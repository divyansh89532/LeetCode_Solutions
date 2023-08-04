class Solution {
    public boolean isPalindrome(int x) {
        int len = (int)Math.log10(x);
        int orig =x;
        int rev = 0 ; 
        for(int i=len;i>=0;i--)
        {
            rev = rev + (x%10)*(int)Math.pow(10,i);
            x=x/10;
        }
        if(orig==rev && orig>=0)
        {
            return true;
        }
        else
        {
            return false;
        }
    
    }
}
