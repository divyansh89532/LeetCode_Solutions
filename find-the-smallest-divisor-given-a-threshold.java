class Solution {
  public int calculate(int[] nums,int mid){ 
    int sum =0;
    for(int i:nums){
      sum+=Math.ceil((double)i/(double)mid);
    }
    return sum;
  }
  public int maxmin(int[]nums){
      int maxi = Integer.MIN_VALUE;
      for(int i=0;i<nums.length;i++){
        maxi = Math.max(nums[i],maxi);
      }
    return maxi;
  }
  public int smallestDivisor(int[] nums, int threshold){
    int low =1;
    int high = maxmin(nums);
    while(low<=high){
      int mid = (low+high)/2;
      if(calculate(nums, mid)<=threshold)
        high=mid-1;
      else
        low=mid+1;  
    }
    return low;

  }
}
