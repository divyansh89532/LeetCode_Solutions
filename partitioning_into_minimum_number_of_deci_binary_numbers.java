class Solution {
    public int minPartitions(String n) {
        int max_number = 0;
        for(int i=0;i<n.length();i++)
        {
            if(n.charAt(i)-'0'==9) 
            return 9;
            max_number = Math.max(max_number,(n.charAt(i)-'0'));
        }
        return max_number;
    }
}
