class Solution {
    public int maximumWealth(int[][] accounts) {
        int largest = accounts[0][0];
        for(int[] account:accounts)
        {
            int curr_sum =0;
            for(int bank:account)
            {
                curr_sum+=bank;
            }
            largest = Math.max(largest,curr_sum);
        }
        return largest;
    }
}
