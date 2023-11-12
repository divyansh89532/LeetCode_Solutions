class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> dummy = new ArrayList<Integer>(index.length);
        int[] ans = new int[index.length];
        for(int i=0;i<index.length;i++)
        {
            dummy.add(index[i],nums[i]);
        }
        for(int j=0;j<index.length;j++)
        {
            ans[j]=dummy.get(j);
        }
        return ans;

    }
}
