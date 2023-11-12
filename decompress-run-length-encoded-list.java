class Solution {
    public int[] decompressRLElist(int[] nums) {
        int len = 0;
        for(int i=0;i<nums.length;i=i+2)
        {
            len = len + nums[i];
        }
        int[] ans = new int[len];
        int index = 0;
        for(int j=0;j<nums.length;j=j+2)
        {
            for(int k=0;k<nums[j];k++)
            {
                ans[index] = nums[j+1];
                index++;
            }
        }
        return ans;
    }
}
