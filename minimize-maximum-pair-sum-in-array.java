class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int j= n-1;
        int max_sum =0;
        max_sum = nums[0]+nums[j];
        for(int i=0;i<n/2;i++)
        {
            if(max_sum<nums[i]+nums[j])
            {
                max_sum = nums[i]+nums[j];
            }
            j--;
        }
        return max_sum;
    }
}
