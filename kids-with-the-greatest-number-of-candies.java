class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> answer= new ArrayList<Boolean>(candies.length);
        int max_candy = candies[0];
        int n = candies.length;
        for(int i=0;i<n;i++)
        {
            if(candies[i]>max_candy)
            {
                max_candy = candies[i];
            }
        }
        for(int j=0;j<n;j++)
        {
            if(candies[j]+extraCandies>=max_candy)
                answer.add(true);
            else
                answer.add(false);
        }
        return answer;
    }
}
