class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] ans = new int[nums.length];
        int diff =0;
        int n =nums.length;
        for(int i=0;i<n;i++)
        {
            diff+=Math.abs(nums[i]-nums[0]);
        }
        ans[0]=diff;
        for(int i=1; i<n; i++)
        {
            ans[i] = ans[i-1]+(nums[i]-nums[i-1])*i - (nums[i]-nums[i-1])*(n-i);
        } 
        return ans;
    }
}
