class Solution {
    public int trap(int[] height) {
        int left_max[]= new int[height.length];
        int right_max[] = new int[height.length];
        int fin[] = new int[height.length];
        int max = height[0];
        int count=0;
        int i=0;
        while(i<height.length)
        {
            if(max<height[i])
            {
                max = height[i]; 
                left_max[i] = max; 
            }
            else
            {
                left_max[i] = max;
            }
            i++;
        }
        i=height.length-1;
        max = height[height.length-1];
        while(i>-1)
        {
            if(max<height[i])
            {
                max = height[i]; 
                right_max[i] = max; 
            }
            else
            {
                right_max[i] = max;
            }
            i--;
        }
        i=0;
        while(i<height.length)
        {
            fin[i]=Math.min(left_max[i],right_max[i]);
            i++;
        }
        i=0;
        while(i<height.length)
        {
            count+=fin[i]-height[i];
            i++;
        }
        return count;
    }
}
