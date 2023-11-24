class Solution {
    public long minimumSteps(String s) {
        int n = s.length();
        int white_count =0;
        long count =0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='1')
                white_count++;
            else
                count = count + white_count;
        }
        return count;
        
    }
}
