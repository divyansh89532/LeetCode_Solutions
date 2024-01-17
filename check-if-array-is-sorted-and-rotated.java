class Solution {
    public boolean check(int[] arr) {
        int[] sorted_arr = arr.clone();
        Arrays.sort(sorted_arr);
        int[] al = new int[arr.length];
        for(int x=1;x<=arr.length;x++)
        {
            for(int i=0;i<arr.length;i++)
            {
                al[(i+x) % arr.length]=arr[i];
            }
            if(Arrays.equals(al,sorted_arr))
            return true;
        }
        return false;
    }
}
