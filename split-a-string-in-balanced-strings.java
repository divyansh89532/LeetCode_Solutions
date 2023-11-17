class Solution {
    public int balancedStringSplit(String s) {
        char string_array[] = s.toCharArray();
        int count =0;
        int ans =0;
        for(char i:string_array)
        {
            if(i=='L')
            count++;
            else
            count--;
            if(count==0)
            ans++;
        }
        return ans;
    }
}
