class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for( String symbol:operations)
        {
            if(symbol.charAt(1)=='+')
            {
                x++;
            }
            else
                x--;
        }
        return x;
    }
}
