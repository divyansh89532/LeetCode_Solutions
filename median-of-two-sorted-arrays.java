class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m =nums1.length;
        int n = nums2.length;
        double median = 0 ;
        int[] combined = new int[m+n];
        for(int i =0;i<m; i++)
        {
            combined[i]=nums1[i];
        }
        for(int j=0 ;j<n; j++)
        {
            combined[m+j]=nums2[j];
        }
        Arrays.sort(combined);
        if((m+n)%2==0)
        {
            int index_main = ((m+n)/2)-1;
            median =(double)(combined[index_main] + combined[index_main+1])/2;
        }
        else{
            int index_main = Math.floorDiv(m+n,2);
            median = combined[index_main];
        }
        return median;
    }
}
