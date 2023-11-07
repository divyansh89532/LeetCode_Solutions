class Solution {

    public int setBitcount(int number){
        int count =0;
        while(number>0)
        {
            count = count + (number&1);
            number>>=1;
        }
        return count; 
    }

    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum =0 ;
        for(int i=0;i<nums.size();i++)
        {
            if(k==setBitcount(i))
            sum = sum + nums.get(i);
        }
        return sum;
    }
}
