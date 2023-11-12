class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int[] ans = new int[nums.length];
        leftSum[0] = 0;
        rightSum[nums.length-1]=0;
        for(int j=nums.length-2;j>-1;j--)
        {
            rightSum[j] = rightSum[j+1]+nums[j+1];
        }
        for(int i=1;i<nums.length;i++)
        {
            leftSum[i] = leftSum[i-1]+nums[i-1];            
        }

        for(int j=0;j<nums.length;j++)
        {
            ans[j] = Math.abs(rightSum[j]-leftSum[j]);
        }
        return ans ;
        
    }
}
