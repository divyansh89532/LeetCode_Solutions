class Solution {
    public int longestConsecutive(int[] nums) {
      Arrays.sort(nums);
      int n = nums.length;
      if(n==0)
        return 0;
      int count =0;
      int curr_element = Integer.MIN_VALUE;
      int max_count =1;
      for(int i=0;i<n;i++)
      {
          if(nums[i]-curr_element==1){
              count++;
              curr_element = nums[i];
          }
          else if(nums[i]!=curr_element){
              curr_element=nums[i];
              count=1;
          }
        if(count>max_count)
            max_count=count;
      }
      return max_count;
    }
}
