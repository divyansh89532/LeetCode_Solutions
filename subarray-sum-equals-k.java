class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap <Integer,Integer> hm = new HashMap<>();
        int sum=0 , count=0;
        hm.put(0, 1);
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int delete = sum-k;
            count += hm.getOrDefault(delete, 0);
            hm.put(sum,hm.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}
