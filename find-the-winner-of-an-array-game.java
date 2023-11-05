class Solution {
    public int getWinner(int[] arr, int k) {
        int max = arr[0];
        int win_streak = 0;
        for(int i=1;i<arr.length;i++)
        {
            if(max>arr[i])
            {
                win_streak++;
            }
            else{
                max=arr[i];
                win_streak=1;
            }
            if(win_streak==k)
            {
                break;
            }
        }
        return max;
    }
}
