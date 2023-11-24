class Solution {
    public int maxCoins(int[] piles) {
        int total_length = piles.length;
        int per_person_coin = piles.length/3;
        int sum =0;
        Arrays.sort(piles);
        for(int i=per_person_coin;i<total_length;i=i+2)
        {
            sum+=piles[i];
        }
        return sum;
    }
}
