class Solution {
    public int[] rearrangeArray(int[] nums) {
      int[] positive = new int[nums.length/2];
      int[] negative = new int[nums.length/2];
      int j =0;
      int k =0;
      for(int i:nums)
      {
        if(i>0){
          positive[j]=i;
          j++;
        }
        else{
          negative[k]=i;
          k++;
        }
      }
      k=0;
      j=0;
      for(int i=0;i<nums.length;i++)
      {
        nums[i]=positive[k];
        i++;
        k++;
        nums[i]=negative[j];
        j++;
      }
      return nums;
    }
}
