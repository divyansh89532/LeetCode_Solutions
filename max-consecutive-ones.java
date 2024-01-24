class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max_count=0;
        for(int i:nums)
        { 
            if(i==1)
                count++;    
            if(count>max_count){
                max_count = count;
            } 
            if(i==0)
                count =0;
        }
        return max_count;
    }
}
