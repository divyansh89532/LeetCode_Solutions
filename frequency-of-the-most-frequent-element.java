class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left =0;
        int right =0;
        long res = 0;
        long total = 0;
        while(right<nums.length){
            total+=nums[right];

            while(nums[right] * (right-left+1L)>total +k){
                total = total - nums[left];
                left = left+1;
            }
            res = Math.max(res,right-left+1L);
            right = right +1;
        }
        return (int)res;
    }
}
