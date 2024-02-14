class Solution {

    public int partition(int[] nums,int mid){
        int partition_sum = 0;
        int partitions = 1;
        for(int i:nums){
            if(partition_sum+i<=mid){
                partition_sum+=i;
            }
            else{
                partition_sum =i;
                partitions++;
            }
        }
        return partitions;
    }
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high =0;
        for(int i:nums){
            low = Math.max(i,low);
            high+=i;
        }
        while(low<=high){
            int mid = (low+high)/2;
            if(partition(nums,mid)<=k){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}
