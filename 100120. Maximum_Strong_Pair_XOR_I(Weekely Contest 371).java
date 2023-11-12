class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int max_xor = 0;
        for(int i =0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(Math.abs(nums[i]-nums[j])<=Math.min(nums[i],nums[j]) && ((nums[i]^nums[j])>max_xor))
                    max_xor = nums[i]^nums[j];
            }
        }
        return max_xor;
    }
}
