class Solution {
    public void sortColors(int[] nums) {
        int length = nums.length;
        for(int i=0;i<=length-2;i++)
        {
            int min1 = i;
            for(int j=i;j<length;j++)
            {
                if(nums[j]<nums[min1])
                    min1=j;
            }
            int temp = nums[i];
            nums[i]=nums[min1];
            nums[min1]=temp;
        }
}
}
